package board.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.model.service.BoardService;
import board.model.vo.Board;

/**
 * Servlet implementation class boardUpdateViewServlet
 */
@WebServlet("/bupview")
public class BoardUpdateViewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public BoardUpdateViewServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// 게시글 수정 페이지 출력 처리용 컨트롤러
		// 전송오는 값이 숫자여서 인코딩 필요 없음

		int boardNo = Integer.parseInt(request.getParameter("bno"));
		int currentPage = Integer.parseInt(request.getParameter("page"));

		Board board = new BoardService().selectBoard(boardNo);

		RequestDispatcher view = null;
		if (board != null) {
			view = request.getRequestDispatcher("views/board/boardUpdateView.jsp");
			request.setAttribute("board", board);
			request.setAttribute("page", currentPage);
			view.forward(request, response);
		} else {
			view = request.getRequestDispatcher("views/common/error.jsp");
			request.setAttribute("message", boardNo + "번 게시글 수정 페이지로 이동 실패..");
			view.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
