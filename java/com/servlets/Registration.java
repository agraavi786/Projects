package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Shop;

/**
 * Servlet implementation class Registration
 */
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Registration() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
		String name= request.getParameter("name");
		int id= Integer.parseInt(request.getParameter("id"));
		int number= Integer.parseInt(request.getParameter("number"));
		String email= request.getParameter("email");
		int pass= Integer.parseInt(request.getParameter("password"));
		int repass= Integer.parseInt(request.getParameter("repassword"));
		
		
		
		Shop s= new Shop(name,id,email,number,pass,repass,new Date());
		
		
		System.out.println(s.getEmail());
		
		
		Configuration conf= new Configuration();
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf= conf.configure().buildSessionFactory();
		Session se= sf.openSession();
		
		Transaction tx = se.beginTransaction();
		
		
		se.save(s);
		
		tx.commit();
		
		
		
		
		
		se.close();
		
		
		//PrintWriter out = response.getWriter();
		//out.println("<h1 style='text-align:center;'> Note is loaded successfuy </h1>");
		
		response.setContentType("text/html");
		response.sendRedirect("login.jsp");
		}
		
		
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
