<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%> 
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
   
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"    
"http://www.w3.org/TR/html4/loose.dtd">    
<html>    
<head>  
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
	
	<script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">   
<title><tiles:insertAttribute name="title" ignore="true" /></title>
<style type="text/css">

@media (max-width: 575.98px) {


.col-sm-2{

border-bottom:2px solid green;
}
 }
.jumbotron{
	background-image: url('${pageContext.request.contextPath}/resource/images/deepu.jpg');
	background-size: cover;
	background-repeat: no-repeat;
}
.abc{
 background-color:rgba(255, 255, 255, 0.7);
}
</style>   
</head>      
<body>    
       <div><tiles:insertAttribute name="header"/></div>
       <div container-fluid></div>
     <div class=" mt-3 ">
    
        
      
        <tiles:insertAttribute name="body" /> 
       
        </div> 
        <div style="clear:both"><tiles:insertAttribute name="footer" /></div>    
</body>    
</html> 