 
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <div class="col-sm d-flex justify-content-center">
    <div class="container">
  <div class="row">
<!--   ***************************************************Search employee****************************************************************
 -->    <div class="col-sm-4">

    <div class="jumbtron">
  <h1 class="display-4">search bus</h1>
  <hr class="my-4">
   <form class="form-signin" action="search">
    <div class="form-label-group">
    <label>starting place</label>
        <input  id="" name="arriving_palace" class="form-control" placeholder="From" required><br>
       <h6>to</h6>
         <label>destination</label>
       <input  name="destination_palace" class="form-control" placeholder="to" required><br>
       (date ): <input type="date" name="date">
       <br><br>
<button class="btn btn-lg btn-primary btn-block" type="submit">Serach</button>


      </div>
      </form>
</div>
    </div>
    
    
<!--     ********************************************Sign up form********************************************************
 -->   
    
    <div class="col-sm">
     <div class="jumbotron">
     <div class="abc">
 <div class="col-sm-6"style="margin-left: 150px;">
   <div class="">
  <form:form class="form-signin" action="signin">
      <div class="text-center mb-4">
        <h1 class="h3 mb-3 font-weight-normal">signin</h1>
      </div>

      <div class="form-label-group">
        <form:input path="email" id="inputEmail" class="form-control" placeholder="Email address"  required="required"></form:input>
        <label for="inputEmail">Email address</label>
      </div>

      <div class="form-label-group">
        <form:input path="password" id="inputPassword" class="form-control" placeholder="Password"  required="required"></form:input>
        <label for="inputPassword">Password</label>
      </div>

      <div class="checkbox mb-3">
        <label>
          <input type="checkbox" value="remember-me"> Remember me
        </label>
        
      </div>
      <br>
      <button class="btn btn-lg btn-outline-primary btn-block" type="submit">Sign in</button>
      <h2  style="color: red">${a}</h2>
       <h4>${signmessage}</h4>
    </form:form >
</div>
    </div>
  
</div>
</div>
    </div>
    
    
    

 
 
 
  
  </div>
</div>
  </div>