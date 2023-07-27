<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<div class="container">

<%@include file="grocery.jsp" %>

<div class="card text-center">
<h4>Rajesh Kirana Store</h4>
<form action="GroShop1" method="post">

<input type="text" name="id"  />

<div class="mb-3">
    <label for="tilte1" class="form-label">Address</label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="What is your delivery address name/full adress/mobile number??" required name="delAdd" />
    
  </div>

<textarea name ="wishList" placeholder="What you want wirte here" class="form-control" style="height:300px;" required></textarea>
  
<div class="container text-center">
  
  <button type="submit" class="btn btn-primary">Send</button>
  <button type="submit" class="btn btn-primary">Total Bill</button>
  
  </div>
</form>




</div>

<br>
<div class="card text-center">
<h4>Gangaram Kirana Store</h4>




<form action="ganga.jsp">
<input type="text" name="id"  />

<div class="mb-3">
    <label></label>
    <input type="text" class="form-control" 
    id="title1" aria-describedby="emailHelp"
    placeholder="What is your delivery address name/full adress/mobile number??" required name="delAdd" />
    
  </div>

<textarea name ="wishList" placeholder="What you want wirte here" class="form-control" style="height:300px;" required></textarea>
  
<div class="container text-center">
  
  <button type="submit" class="btn btn-primary">Send</button>
  
  
  </div>
</form>



</div>
<button type="submit" class="btn btn-primary">Total Bill</button>




</div>

</body>
</html>