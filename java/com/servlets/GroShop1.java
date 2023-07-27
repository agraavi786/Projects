package com.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Shop1;


public class GroShop1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public GroShop1() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	try {
		String delAdd = request.getParameter("delAdd");
		String wishList=request.getParameter("wishList");
		int id= Integer.parseInt(request.getParameter("id"));
		Shop1 s1= new Shop1(id,delAdd,wishList);
		
		Configuration cnf=new Configuration();
		 cnf.configure("hibernate.cfg.xml");
		
		SessionFactory se=cnf.buildSessionFactory();
		Session ses= se.openSession();
		Transaction tx= ses.beginTransaction();
		
		ses.save(s1);
		
		
		tx.commit();
		
		
		ses.close();
		response.setContentType("text/html");
		response.sendRedirect("groShop1.jsp");
	}
	catch(Exception e) {
		e.printStackTrace();
	}
		
		
		
		
	}

}
