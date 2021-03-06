<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<nav class="navbar   navbar-expand-xl navbar-light bg-light">
		<a href="" class="navbar-brand"> </a>
		 <span class="navbar-text "> Star bus services </span>
		       <button class="navbar-toggler" type="button" data-toggle="collapse" data-target=".dual-collapse2">
            <span class="navbar-toggler-icon"></span>
        </button>

       
    <div class="navbar-collapse collapse  dual-collapse2">
        <ul class="navbar-nav ml-auto "> 

        <li class="nav-item active border border-success ml-1">
                <a class="nav-link"  href="#">contact</a>
            </li>
    
  
      <li class="nav-item active border border-success ml-1">
                <a class="nav-link"  href="#">about us</a>
            </li>
            
            
      <li class="nav-item active border border-success ml-1"  data-toggle="modal" data-target="#exampleModal">
                <a class="nav-link"  href="#">signup</a>
            </li>
            <li class="nav-item active ">
               <h2>${message}</h2>
            </li>
        </ul>
      
    </div>
    
 </nav>
 <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">register yourself to get services</h5>
        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div class="modal-body">
      <div class="col-sm">
    
 <form:form class="form-signin" action="signup" >
      <div class="text-center mb-4">
        <h1 class="h3 mb-3 font-weight-normal">signup</h1>
      </div>

      <div class="form-label-group">
        <form:input path="email" id="inputEmail" class="form-control" placeholder="Email address" ></form:input>
        <form:errors path="email"></form:errors>
        <form:label path="email">Email address</form:label>
      </div>

      <div class="form-label-group">
        <form:input path="password" id="inputPassword" class="form-control" placeholder="Password"  ></form:input>
        <form:errors path="password"></form:errors>
        <form:label path="password">Password</form:label>
      </div>
  <div class="form-label-group">
        <form:input path="mobile" id="inputPassword" class="form-control" placeholder="mobile number" ></form:input>
        <label >mobile number</label>
      </div>
     
      <button class="btn btn-lg  btn-block btn-outline-primary" type="submit">Sign up</button>
 <p class="mt-5 mb-3 text-muted text-center">&copy; 2017-2018</p>
 
 <h2>${message}</h2>
    </form:form>
  
</div>
    </div>
    
    

      </div>
    
    </div>
  </div>


