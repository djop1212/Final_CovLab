package reservation.controller;

import java.io.IOException;
import java.sql.Timestamp;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import reservation.service.reservationService;
import reservation.vo.Members;
import reservation.vo.Reservation;

/**
 * Servlet implementation class termsPopup
 */
@WebServlet("/tpop")
public class termsPopup extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public termsPopup() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Reservation res = new Reservation();
		Members mb = new Members();
		reservationService rservice = new reservationService();
		
		
		HttpSession session = request.getSession(true);
		String user_id = (String) session.getAttribute("user_id");
		String date = request.getParameter("rev_date");
		
//		
//		System.out.println("날짜 :" +date);
//		
//		SimpleDateFormat sdf = new SimpleDateFormat("yy/MM/dd HH:mm:ss");
//		String d2 = sdf.format(date);
		Timestamp rev_date = Timestamp.valueOf(date);

		System.out.println("rev_date:"+rev_date);
		/*
		 * endDate = (Timestamp)sdf.parse(date); res.setRev_date(endDate);
		 * System.out.println("날짜 : "+endDate);
		 */
			// TODO Auto-generated catch block
		mb = rservice.selectOneMember(user_id);
		
		
		res.setSerial_num(request.getParameter("serial_num"));
		res.setReg_bus_no(request.getParameter("reg_bus_no"));
		res.setRev_date(rev_date);
		res.setUser_no(mb.getUserRn());
		
		System.out.println("받은 세션 값: "+user_id);
		System.out.println("주민번호 :" +mb.getUserRn());
		System.out.println("REG_BUS_NO :" +res.getReg_bus_no());
		System.out.println("reg_date :" +res.getRev_date());
		
		int result = rservice.insertReservation(res);
		
		System.out.println("결과 :" + result);
		
		if(result >0) {
			
		}else {
			
		}
		
		RequestDispatcher view = null;

		view = request.getRequestDispatcher(
				"views/reservation/termsPopupPage.jsp");
		
		view.forward(request, response);
		
		}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
