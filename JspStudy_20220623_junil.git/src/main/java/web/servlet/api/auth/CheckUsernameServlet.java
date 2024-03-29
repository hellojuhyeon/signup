package web.servlet.api.auth;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.UserService;
import service.UserServiceImpl;


@WebServlet("/check/username")
public class CheckUsernameServlet extends HttpServlet {
   private static final long serialVersionUID = 1L;

   
   private final UserService userService;
   
   public CheckUsernameServlet() {
      userService = new UserServiceImpl();
   }
   
   
   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       
	   
	   	   
	   String username = request.getParameter("username");
      
      response.setContentType("text/plain;charset=UTF-8");
      try {
         response.getWriter().print(userService.checkUsername(username));//데이터 응답할때 getWriter사용
      } catch (Exception e) {
         e.printStackTrace();
      }
   }

}