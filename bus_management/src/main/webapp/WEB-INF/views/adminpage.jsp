
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  <h2>add bus informaion</h2>
  <hr>
  
  <div class="ml-5 d-flex justify-content-center">
      <form class="needs-validation" method="post" enctype="multipart/form-data" modelAttribute="uploadedFile" action="save">
      <div class="row">
  <div  class="col-sm-5">
  <div class="form-group">
    <label for="exampleInputEmail1">bus name</label>
    <input type="text" name="bus_name"class="form-control" id="" aria-describedby="emailHelp" placeholder="busname" required="required">
    </div>
  <div class="form-group">
    <label for="exampleInputPassword1">starting place</label>
    <input type="text" name="arrival_place" class="form-control" id="" placeholder="place"required="required">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">destination</label>
    <input type="text" name="dest_place" class="form-control" id="" placeholder="destination"required="required">
  </div>
    <div class="form-group">
    <label for="exampleInputPassword1">arrival_time</label>
    <input type="time" name="time" class="form-control" id="" placeholder="arrival_time"required="required">
  </div>
  </div>
  <div class="col-sm-4">
    <div class="form-group">
    <label for="exampleInputPassword1">bus number</label>
    <input type="text" name="bus_number" class="form-control" id="" placeholder="bus number(only integer)"required="required">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">total seat</label>
    <input type="text" name="seat" class="form-control" id="" placeholder="totalseat"required="required">
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">departure time</label>
    <input type="time" name="dt" class="form-control" id="exampleInputPassword1" placeholder="departure time"required="required">
 
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">date</label>
    <input type="date" name="date" class="form-control" id="" placeholder="date"required="required">
 
  </div>
   <div class="form-group">
    <label for="exampleInputPassword1">total distance in kilometer</label>
    <input type="text" name="distace" class="form-control" id="exampleInputPassword1" placeholder="total distance"required="required">
  </div>
 <br><br>

  <button type="submit" class="btn btn-primary">Submit</button>
</div>
</div>
       </form>
</div>

