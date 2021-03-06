<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<nav class="navbar   navbar-expand-xl navbar-light bg-light">
		<a href="" class="navbar-brand">Add logo </a>
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
           
            
      <li class="nav-item active border border-success ml-1"  >
                <a class="nav-link"  href="logout">logout</a>
            </li>
             <li class="nav-item active ">
               
            </li>
            <li class="nav-item active ">
               <h2>${message}</h2>
            </li>
        </ul>
      
    </div>
    
 </nav>



