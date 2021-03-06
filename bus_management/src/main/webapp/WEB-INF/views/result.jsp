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
<p class="text-monospace navbar text-light   navbar-light bg-dark">${s.getArriving_palace()} to ${s.getDestination_palace()} & date : ${s.getDate()}</p>

    <table class="table ">
  <thead>
    <tr>
      <th scope="col">busnumber</th>
      <th scope="col">from</th>
       <th scope="col">remaining seat</th>
      <th scope="col">bus name</th>
      <th scope="col">destination</th>
      <th scope="col">arrival time</th>
      <th scope="col">departure time</th>
     
      
    </tr>
  </thead>
  <tbody>
     <c:forEach var="a" items="${l}">
    <tr>
     
      <td>${a.bus_number}</td>
       <td>${a.arrival_place}</td>
       <td>${a.remaining_seat}</td>
        <td>${a.bus_name}</td>
        <td>${a.dest_place}</td>
        <td>${a.time}</td>
        <td>${a.dt}</td>
         <td><a href="send/${a.bus_number}">book bus</a></td>  


    </tr>
  
   </c:forEach>
  </tbody>
</table>
</div>
</body>
</html>