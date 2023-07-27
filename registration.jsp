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
    
    <h1>Sing Up</h1>
    
    
    
    <form action="Registration" method="post">
    <input type="text"  name="id" />
  
  <div class="mb-1">
    <label for="tilte1" class="form-label">Full Name</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Full name" required name="name" />
    
  </div>
  <div class="mb-1">
    <label for="tilte1" class="form-label">Email</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Email" required name="email" />
    
  </div>
  
   <div class="mb-1">
    <label for="tilte1" class="form-label">Mobile Number</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Mobile Number" required name="number" />
    
  </div>
  <div class="mb-1">
    <label for="tilte1" class="form-label">Password</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Password" required name="password" />
    
  </div>
  <div class="mb-1">
    <label for="tilte1" class="form-label">Retype Password</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="Retype Password" required name="repassword" />
    
  </div>
 
  
  <div class="container text-center">
  
  <button type="submit" class="btn btn-primary">Sing up</button>
  <p>already have account? 
  <a href="login.jsp">login</a></p>
  
  </div>
</form>
<a href="index.jsp"><button class="btn btn-outline-primary text-center">Back</button></a>

</div>





</body>
</html>