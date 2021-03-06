<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<center>
<code>

 Bus name : ${a.bus_name}<br>
   Bus number : ${a.bus_number}<br>
  
   from  : ${a.arrival_place}<br>
    to : ${a.dest_place}<br>
 departure time : ${a.dt}<br>
 male seat : ${s.maleseat}<br>
 female seat : ${s.femaleseat}<br>
   seat number:<c:forEach var="b" items="${l}">
  
  ${b}
  
  </c:forEach>
 <br>
 total ticket fare :Rs. ${ticket}<br>


</code>

</center>
