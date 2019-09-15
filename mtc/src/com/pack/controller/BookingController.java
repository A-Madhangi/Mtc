package com.pack.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.pack.dao.BookingDaoImpl;
import com.pack.model.BookingDetails;
import com.pack.model.Login;
import com.pack.service.BookingServiceImpl;
import com.pack.service.loginSeviceImpl;

/**
 * Servlet implementation class BookingController
 */
@WebServlet("/BookingController")
public class BookingController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BookingController() {
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
		doGet(request, response);
		
		response.setContentType("text/html");
        PrintWriter pw=response.getWriter();
        int noofperson=Integer.parseInt(request.getParameter("noOfPersons"));
        String fromlocation=request.getParameter("fromPlace");
        String tolocation=request.getParameter("toPlace");
        
        BookingDetails b=new BookingDetails(fromlocation,tolocation,noofperson);
        
        BookingServiceImpl bsi=new BookingServiceImpl();
        
        bsi.checkBooking(b);
        
        
        List<BookingDetails> l=null;
	    l=new BookingDaoImpl().checkBooking(b);
		request.setAttribute("custlist",l);
		RequestDispatcher rd=request.getRequestDispatcher("/Ticket.jsp");
		rd.include(request, response);

		
		
		
		
		
	}

}
