<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1, user-scalable=0">
<link rel="stylesheet" href="dist/css/bootstrap.min.css">
<style type="text/css">
      body { background: #edf0f5 ; }
      .tb5 {
	border:2px solid #456879;
	border-radius:10px;
	height: 25px;
	width: 230px;
}
.ta5 {
	border:2px solid #456879;
	border-radius:10px;
	height: 200px;
	width: 330px;
}

.col-center-block {
    float: none;
    display: block;
    margin-left: auto;
    margin-right: auto;
}

.color_white
{
	color:#ffffff;
}
.page-header { background-color: #a90329; margin-left: 0px; margin-right: 0px; };

    </style>
<title>Index Page</title>
</head>
<body>
<div class="page-header">
<center><br><h2 class="color_white">System Usability Scale<br></h2>
<br>
</center>
</div>
<div class=container>
  
  <div class="col-md-4 col-sm-6 col-xs-10 col-center-block">
    
  <div class="panel panel-default">
  <div class="panel-heading"><center><strong>Admin Login</strong></center></div>
  <div class="panel-body">
	
      <form action=Login_Form.php role="form" method="post">
        <div class="form-group">
  <label for="usr">Username:</label>
  <input type="text" class="form-control" id="usr" name="usr">
</div>
<div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" class="form-control" id="pwd" name="pwd">
</div>
        <button type="submit" class="btn btn-success">Sign In</button>
      </form><br><br>
      
  
</div>
</div>
</div>
</div>
<center>
</div>
</center>
<script src="dist/js/bootstrap.min.js"></script>
</body>
</html>

