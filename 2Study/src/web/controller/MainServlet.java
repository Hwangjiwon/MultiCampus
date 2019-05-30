package web.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import web.model.MemberDAO;

public class MainServlet extends HttpServlet {


   protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("get 요청처리...");
      process(request, response);
   }


   protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("post 요청처리...");
      process(request, response);
   }
   
   protected void process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
      System.out.println("process 동작중...");
      String sign =request.getParameter("sign");
      if(sign!=null) {
         if(sign.equals("login")) {
            String id=request.getParameter("id");
            String pw=request.getParameter("pw");
            //db...
            MemberDAO member = new MemberDAO(); 
            try {
				String username = member.login(id, pw);
				if(username != null) { //login success
					HttpSession session = request.getSession();
					System.out.println(session+": 열쇠를 발급받았습니다.");
					session.setAttribute("username", username);
					RequestDispatcher disp = request.getRequestDispatcher("jsp/login_ok.jsp"); //응답할 페이지로  
					disp.forward(request, response);
				} else { //login failed
					RequestDispatcher disp = request.getRequestDispatcher("jsp/login_error.jsp"); //응답할 페이지로  
					disp.forward(request, response);
				}
			} catch (Exception e) { //login error
				// TODO Auto-generated catch block
				e.printStackTrace(); //그냥 냅두면 에러정보 노출됨!!! 개발 시점에서 테스팅용으로 필요하지만, 개발 이후 반드시 지워줄것!
				RequestDispatcher disp = request.getRequestDispatcher("jsp/login_error.jsp"); //응답할 페이지로  
				disp.forward(request, response);
			}
            
         }
      }else {
         //침해 대응
      }
   }

}