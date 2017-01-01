<?php
// $b=$_REQUEST['menu1'];
session_start();
$user=$_SESSION['uname'];
if($user=="")
{
  header('Location: index.php');
}
?>
<html>
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <title>Add Participant</title>
    <!-- Tell the browser to be responsive to screen width -->
    <meta content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no" name="viewport">
    <!-- Bootstrap 3.3.5 -->
   <link rel="stylesheet" href="AdminLTE/bootstrap/css/bootstrap.min.css">
    <!-- Font Awesome -->
    <link rel="stylesheet" href="AdminLTE/dist/font-awesome/css/font-awesome.min.css">
    <!-- Ionicons -->
    <link rel="stylesheet" href="AdminLTE/dist/css/ionicons.min.css">
    <!-- Theme style -->
    <link rel="stylesheet" href="AdminLTE/dist/css/AdminLTE.min.css">
    <!-- AdminLTE Skins. We have chosen the skin-blue for this starter
          page. However, you can choose any other skin. Make sure you
          apply the skin class to the body tag so the changes take effect.
    -->
    <link rel="stylesheet" href="AdminLTE/dist/css/skins/skin-yellow-light.min.css">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
        <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
    <style>
    #errmsg
{
color: red;
}

.box
{
  padding-left: 15;
  padding-bottom: 15;
  padding-top: 15
}
</style>
  </head>
  <!--
  BODY TAG OPTIONS:
  =================
  Apply one or more of the following classes to get the
  desired effect
  |---------------------------------------------------------|
  | SKINS         | skin-blue                               |
  |               | skin-black                              |
  |               | skin-purple                             |
  |               | skin-yellow                             |
  |               | skin-red                                |
  |               | skin-green                              |
  |---------------------------------------------------------|
  |LAYOUT OPTIONS | fixed                                   |
  |               | layout-boxed                            |
  |               | layout-top-nav                          |
  |               | sidebar-collapse                        |
  |               | sidebar-mini                            |
  |---------------------------------------------------------|
  -->
  <body class="hold-transition skin-yellow-light sidebar-mini">
    <div class="wrapper">
      <!-- Main Header -->
      <header class="main-header">

        <!-- Logo -->
        <a href="AdminDashboard.php" class="logo">
          <!-- mini logo for sidebar mini 50x50 pixels -->
          <span class="logo-mini">SC</span>
          <!-- logo for regular state and mobile devices -->
          <span class="logo-lg"><b>Student's Council</b></span>
        </a>

        <!-- Header Navbar -->
        <nav class="navbar navbar-static-top" role="navigation">
          <!-- Sidebar toggle button-->
          <a href="#" class="sidebar-toggle" data-toggle="offcanvas" role="button">
            <span class="sr-only">Toggle navigation</span>
          </a>
          <!-- Navbar Right Menu -->
          <div class="navbar-custom-menu">
            <ul class="nav navbar-nav">
              <!-- Messages: style can be found in dropdown.less-->
              
              <!-- User Account Menu -->
              <li class="dropdown user user-menu">
                <!-- Menu Toggle Button -->
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                  <!-- The user image in the navbar-->
                  <img src="D_Logo/avatar.png" class="user-image" alt="User Image">
                  <!-- hidden-xs hides the username on small devices so only the image appears. -->
                  <span class="hidden-xs">Admin</span>
                </a>
                <ul class="dropdown-menu">
                  <!-- The user image in the menu -->
                  <li class="user-header">
                    <img src="D_Logo/avatar.png" class="img-circle" alt="User Image">
                    <p>
                      Admin
                    </p>
                  </li>
                  
                  <!-- Menu Footer-->
                  <li class="user-footer">
                    <!-- <div class="pull-left">
                      <a href="#" class="btn btn-default btn-flat">Profile</a>
                    </div> -->
                    <div class="pull-right">
                      <a href="logout.php" class="btn btn-default btn-flat">Sign out</a>
                    </div>
                  </li>
                </ul>
              </li>
              <!-- Control Sidebar Toggle Button -->
              
            </ul>
          </div>
        </nav>
      </header>
      <!-- Left side column. contains the logo and sidebar -->
      <aside class="main-sidebar">
        <!-- sidebar: style can be found in sidebar.less -->
        <section class="sidebar">

          <!-- Sidebar user panel (optional) -->
          <div class="user-panel">
            <div class="pull-left image">
              <img src="D_Logo/avatar.png" class="img-circle" alt="User Image">
            </div>
            <div class="pull-left info">
              <p>Admin</p>
              <!-- Status -->
            </div>
          </div>

          <!-- Sidebar Menu -->
          <ul class="sidebar-menu">
            <!-- Optionally, you can add icons to the links -->
            <li><a href="AdminDashboard.php"><i class="fa fa-home"></i><span>Home</span></a></li>
          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
              </aside>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            Add Participant: 
          </h1>
          
        </section>
        <!-- Main content -->
        <section class="content">

          <form action=add_applicant.php role="form" method="post">
            <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Student Name" name="name">
            <span class="glyphicon glyphicon-user form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="email" class="form-control" placeholder="Student Email" name="email">
            <span class="glyphicon glyphicon-envelope form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Branch And Year" name="branch">
            <span class="fa fa-graduation-cap form-control-feedback"></span>
          </div>
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="College" name="college">
            <span class="fa fa-university form-control-feedback"></span>
            
          </div>
          <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Mobile Number" name="mn" id="mn">          
            <span class="fa fa-th form-control-feedback"></span>
            <div id="errmsg"></div>
          </div>
          <!-- <div class="form-group has-feedback">
            <input type="text" class="form-control" placeholder="Branch And Year" name="branch">
          </div> -->

<!-- <div class="form-group">
  <label for="gender">Event Type:</label><br>
  <select name="gender">
    <option value="">Select Event Type</option>
    <option value="1">Event 1</option>
    <option value="2">Event 2</option>
    <option value="3">Event 3</option>
  </select>
</div> -->

<div>
<label>Select Event:</label>
<div class="row">
  <div class="col-md-4">
<div class="form-group">
<div>
  <label>Event 1:</label>
  <div class="box">
      <div class="checkbox">
        <label><input type="checkbox" value="Event1 Name 1" name="E1_1">Event1 Name 1</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event1 Name 2" name="E1_2">Event1 Name 2</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event1 Name 3" name="E1_3">Event1 Name 3</label>
      </div>
  </div>
</div>
</div>
</div>

<div class="col-md-4">
<div class="form-group">
<div>
  <label>Event 2:</label>
  <div class="box">
      <div class="checkbox">
        <label><input type="checkbox" value="Event2 Name 1" name="E2_1">Event2 Name 1</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event2 Name 2" name="E2_2">Event2 Name 2</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event2 Name 3" name="E2_3">Event2 Name 3</label>
      </div>
  </div>
</div>
</div>
</div>

<div class="col-md-4">
<div class="form-group">
<div>
  <label>Event 3:</label>
  <div class="box">
      <div class="checkbox">
        <label><input type="checkbox" value="Event3 Name 1" name="E3_1">Event3 Name 1</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event3 Name 2" name="E3_2">Event3 Name 2</label>
      </div>
      <div class="checkbox">
        <label><input type="checkbox" value="Event3 Name 3" name="E3_3">Event3 Name 3</label>
      </div>
  </div>
</div>
</div>
</div>


</div> <!-- row -->
</div>

<div>
  <div class="checkbox">
        <label><input type="checkbox" value="Y" name="conf">Amount Paid</label>
      </div>
</div>
<button type="submit" class="btn btn-success">Next</button>
</form>
</div>


        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
      <!-- Main Footer -->
  <footer class="main-footer">
        <!-- To the right -->

        <!-- Default to the left -->
        <strong>Students Council</strong>
      </footer>      <!-- Control Sidebar -->
        <!-- Tab panes -->
    <!-- REQUIRED JS SCRIPTS -->
    <!-- jQuery 2.1.4 -->
    <script src="AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="AdminLTE/bootstrap/js/bootstrap.min.js"></script>
    <!-- AdminLTE App -->
    <script src="AdminLTE/dist/js/app.min.js"></script>

    <script>
    $(document).ready(function () {
  //called when key is pressed in textbox
  $("#mn").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsg").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});

    $(document).ready(function () {
  //called when key is pressed in textbox
  $("#amount").keypress(function (e) {
     //if the letter is not digit then display error and don't type anything
     if (e.which != 8 && e.which != 0 && (e.which < 48 || e.which > 57)) {
        //display error message
        $("#errmsgamt").html("Digits Only").show().fadeOut("slow");
               return false;
    }
   });
});

    
</script>
    <!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->
  </body>
</html>
