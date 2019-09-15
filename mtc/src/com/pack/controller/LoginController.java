package com.pack.controller;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.pack.model.Login;

//import com.pack.model.Admin;
import com.pack.service.loginSeviceImpl;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        //doGet(request, response);
        response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        int id=Integer.parseInt(request.getParameter("userid"));
        String password=request.getParameter("password");
        Login a=new Login(id,password);
        loginSeviceImpl l=new loginSeviceImpl();
       boolean val=l.checkLogin(a);
        if(val)
        {
               pw.println("Login Succesfull");
          //     int i=new loginSeviceImpl().getCount(a);
            //   pw.println(i);
               
              
               int username= l.getUsername(a);
             //  String designation=new LoginServiceImpl().getDesignation(a);
               //String office=new LoginServiceImpl().getOffice(a);
               a.setUserName(username);
               HttpSession hs=request.getSession();
               hs.setAttribute("login", a);
               hs.setAttribute("username", a.getUserName());
            
               RequestDispatcher rd=request.getRequestDispatcher("/BookBus.jsp");
               rd.forward(request, response);
        }
      
        pw.close();
        
        
        
 }


}
