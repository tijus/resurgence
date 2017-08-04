<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];
if($delete=mysqli_query($con,"DELETE FROM user WHERE id='$id'"))
{
	echo "<script>alert('Application Deleted!');window.location.href='status.php';</script>";
}
else
{
	echo "<script>alert('Unable to delete Application!');window.location.href='status.php';</script>";	
}
?>