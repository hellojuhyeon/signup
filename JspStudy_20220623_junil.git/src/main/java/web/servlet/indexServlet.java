package web.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 요청의 종류
 * 1.view(html)요청 -> 무조건 get요청
 * 2.api(application programming interface)요청 -> crud(post, get, put, delete):JavaScript(AJAX 동기, 비동기)
 */
@WebServlet("/index")
public class indexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/views/index.jsp");
		request.getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);
	}

}
