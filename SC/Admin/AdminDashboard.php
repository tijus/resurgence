<?php
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
    <title>AdminDashboard</title>
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
    .box{
      padding: 10;
    }
    .btn{
      margin: 10;
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
        <a href="#" class="logo">
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
            <li class="active"><a href="#"><i class="fa fa-home"></i><span>Home</span></a></li>
            
          </ul><!-- /.sidebar-menu -->
        </section>
        <!-- /.sidebar -->
              </aside>
      <!-- Content Wrapper. Contains page content -->
      <div class="content-wrapper">
        <!-- Content Header (Page header) -->
        <section class="content-header">
          <h1>
            DASHBOARD
          </h1>
        </section>
        <!-- Main content -->
        <section class="content">
        
          <!-- Your Page Content Here -->
          <div class="box">

<?php
if($_GET['role']=="user")
{
?>          <div class="row">
            <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="sponsorer.php"><button type="button" class="btn btn-danger btn-block">Add Sponsorer</button></a></center>
            </div>
            <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="updates.php?role=user"><button type="button" class="btn btn-danger btn-block">Add Updates</button></a></center>
            </div>
</div>
<div class="row">
           <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="imagegallery.php"><button type="button" class="btn btn-danger btn-block">Add Gallery Images</button></a></center>
            </div>
 
            
            <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="user.php"><button type="button" class="btn btn-danger btn-block">Add Users</button></a></center>
            </div>
</div>
            <div class="row">
            <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="applicant.php"><button type="button" class="btn btn-danger btn-block">Add Applicant</button></a></center>
            </div>

          <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="status.php"><button type="button" class="btn btn-danger btn-block">Participant Status</button></a></center>
            </div>
</div>

            <div class="row">
            <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="Feedbacks.php"><button type="button" class="btn btn-danger btn-block">View Feedbacks</button></a></center>
            </div>
</div>
</div>
<?php
}
else if($_GET['role']=="admin")
{
?>

          <div class="row">
          <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="noticeboard.php"><button type="button" class="btn btn-danger btn-block">Noticeboard</button></a></center>
            </div>
        
          <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="results.php"><button type="button" class="btn btn-danger btn-block">Results</button></a></center>
            </div>
</div>
        <div class="row">
          <div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="admissions.php"><button type="button" class="btn btn-danger btn-block">Admissions</button></a></center>
            </div>
<div class="col-md-5 col-sm=6 col-xs-6">
              <center><a href="updates.php?role=admin"><button type="button" class="btn btn-danger btn-block">Updates</button></a></center>
            </div>
</div>
<?php
}
?>
        </div>
        <br>
        </section><!-- /.content -->
      </div><!-- /.content-wrapper -->
      <!-- Main Footer -->
      <footer class="main-footer">
        <!-- To the right -->

        <!-- Default to the left -->
        <strong>Students Council</strong>
      </footer>
      <!-- Control Sidebar -->
        <!-- Tab panes -->
    <!-- REQUIRED JS SCRIPTS -->
    <!-- jQuery 2.1.4 -->
    <script src="AdminLTE/plugins/jQuery/jQuery-2.1.4.min.js"></script>
    <!-- Bootstrap 3.3.5 -->
    <script src="AdminLTE/bootstrap/js/bootstrap.min.js"></script>
    <!-- AdminLTE App -->
    <script src="AdminLTE/dist/js/app.min.js"></script>
    <!-- Optionally, you can add Slimscroll and FastClick plugins.
         Both of these plugins are recommended to enhance the
         user experience. Slimscroll is required when using the
         fixed layout. -->
  </body>
</html>
