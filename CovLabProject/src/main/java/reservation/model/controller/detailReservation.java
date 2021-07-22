package reservation.model.controller;

import java.io.Console;
import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.model.service.reservationService;
import reservation.model.vo.Hospital;
import reservation.model.vo.Members;
import reservation.model.vo.Reservation;
import reservation.model.vo.Vaccine;

/**
 * Servlet implementation class detailReservation
 */
@WebServlet("/detailhp")
public class detailReservation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public detailReservation() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		String reg_bus_no = request.getParameter("reg_bus_no");
		
		//서비스 연결
		reservationService rservice = new reservationService();
		
		/*테스트용 세션 생성*/
		HttpSession session = request.getSession(true);
		session.setAttribute("user_id", "user02");
		
		String user_id = (String) session.getAttribute("user_id");
		Members mb = rservice.selectOneMember(user_id);
		
		//테스트용 사업자번호 부여
		String reg_bus_no = "252-12-62156";
		System.out.println(reg_bus_no);
		
		//테스트용 백신 시리얼 넘버 부여
		String serial_num = request.getParameter("serial_num");
		
		//hp 객체에 hp정보 담기
		Hospital hp = rservice.selectOneHp(reg_bus_no);
		int checkRes = rservice.checkReservation(mb.getUserRn());


		
		RequestDispatcher view = null;
		if(hp != null) {
			view = request.getRequestDispatcher(
					"views/reservation/detail_reservation.jsp");
			
			System.out.println("세션 : "+session.getId());
			request.setAttribute("hp", hp);
			request.setAttribute("checkRes", checkRes);

			
			view.forward(request, response);
		}else {
			view = request.getRequestDispatcher(
					"views/common/error.jsp");
			request.setAttribute("message", 
					reg_bus_no + "번 병원 조회 실패!");
			view.forward(request, response);
		}
		
	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
