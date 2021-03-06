<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
        <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%> 
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class="container">
  <div class="row">
    <div class="col-sm">
      One of three columns
    </div>
    <div class="col-sm">
      
              <div class="card" style="width: 18rem;">
  <ul class="list-group list-group-flush">
    <li class="list-group-item"><h6>Bus name : ${a.bus_name}</li>
    <li class="list-group-item"><h6>Bus number : ${a.bus_number}</li>
    
    
    <li class="list-group-item"><h6>from  : ${a.arrival_place}</li>
    <li class="list-group-item"><h6>to : ${a.dest_place}</li>
    <li class="list-group-item"><h6>departure time : ${a.dt}</li>
    <li class="list-group-item"><h6>arrival time : ${a.time}</li>
      <li class="list-group-item"><h6>ticket price for one person : ${x}</li>
  </ul>
</div>
               
    </div>
    <div class="col-sm">
    <div class="card">
  
  <div class="card-body">
  <form:form action="adddetailandpayment">
  
<p class="card-text"> <form:select class="custom-select" path="maleseat">
  <option selected>number of male</option>
  <option value="1">One</option>
  <option value="2">Two</option>
  <option value="3">Three</option>
</form:select></p>
<p class="card-text"> <form:select class="custom-select" path="femaleseat">
  <option selected>number of female</option>
  <option value="1">One</option>
  <option value="2">Two</option>
  <option value="3">Three</option>
</form:select></p>

    <button class="btn btn-primary" type="submit">Go </button>
   </form:form>
  </div>
</div>
 ${msg}
    </div>
  </div>
</div>
</body>
</html>