<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="com.entity.Shop1" %>
<%@ page import="org.hibernate.cfg.Configuration" %>
<%@ page import="org.hibernate.Session" %>
<%@ page import="org.hibernate.SessionFactory" %>
<%@ page import="org.hibernate.Transaction" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try{
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




%>

</body>
</html>