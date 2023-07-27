<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="all_js_css.jsp"%>

</head>
<body>

<div class="container">
    
    <%@include file="navar.jsp"%>
    
    <h1>Sing In for go to shop</h1>
    
    
    
    <form action="Login" method="post">
  <div class="mb-1">
    <label for="tilte1" class="form-label">User Name</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="User Name or email" required name="name" />
    
  
    
  </div>
  <div class="mb-1">
    <label for="tilte1" class="form-label">Password</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Password" required name="pass" />
    
  </div>
  <br>
  
 
  
  <div class="container text-center">
  
  <button type="submit" class="btn btn-primary">Sign in</button>
 
  <p>do'nt have account? 
  <a href="registration.jsp">register</a></p>
  
  </div>
</form>
<a href="index.jsp"><button class="btn btn-outline-primary text-center">Back</button></a>

</div>





</body>
</html>