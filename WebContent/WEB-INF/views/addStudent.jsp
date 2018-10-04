<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO"/>
</head>
<body>
<form class="form-inline" action="./addStudent" method="post">

<h2 style="color:red">${errorMsg}</h2><br>
  <div class="form-group mb-2">
    <label for="staticEmail2" class="sr-only">Name</label>
    <input type="text"  class="form-control-plaintext" id="staticEmail2"  name="name"  required>
  </div>
  <div class="form-group mx-sm-3 mb-2">
    <label for="inputPassword2" class="sr-only">Password</label>
    <input type="password" class="form-control" id="inputPassword2" name="password" placeholder="Password" required>
  </div>
   <div class="form-group mx-sm-3 mb-2">
    <label for="doj" class="sr-only">Joining date</label>
    <input type="text" class="form-control" id="doj" name="doj" placeholder="dd/MM" required>
  </div>
    <div class="form-group mx-sm-3 mb-2">
    <label for="status" class="sr-only">Passport available</label><br>
    Yes<input type="radio" class="form-control"  name="status" value="yes" required>
     No<input type="radio" class="form-control"  name="status" value="no" required>
  </div>
  <!-- boolean -->
  
  <!-- list :subjects
  enum gender-->
  <button type="submit" class="btn btn-primary mb-2">Submit</button>
</form>
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script> 

</body>
</html>