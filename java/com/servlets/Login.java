package com.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.Shop;

public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
    public Login() {
        super();
        
    }

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String name= request.getParameter("name");
		int pass= Integer.parseInt(request.getParameter("pass"));
		
        Configuration conf= new Configuration();
		
		SessionFactory sf= conf.configure().buildSessionFactory();
		Session se= sf.openSession();
		
		Query q= se.createQuery("from Shop");
		
		    List<Shop> l=q.list();
		    
		    se.close();
		    
		    
		    
		    int count=0;
		    for (int i = 0; i < l.size(); i++) {
	            Shop pt = (Shop) l.get(i);
	            String str=pt.getEmail();
	            int itr=pt.getPass();
	            
	            if(pt.getEmail().equals(name) && pt.getPass()==pass){
	            	response.sendRedirect("grocery1.jsp");
	            	
	            	count++;
	            	
	            	
	            }
		    }
	            if(count==0) {
	            	response.sendRedirect("login.jsp");
	            	//dis = request.getRequestDispatcher("login.jsp");
	            } 
	            
	           
	            //dis.forward(request, response);
	            	
	           
		    
		    
	        
		    }	
	
	}


