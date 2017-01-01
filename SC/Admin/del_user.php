<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];
if($delete=mysqli_query($con,"DELETE FROM admins WHERE AdminId='$id'"))
{
	echo "<script>alert('User Deleted!');window.location.href='user.php';</script>";
}
else
{
	echo "<script>alert('Problem in deleting user!');window.location.href='user.php';</script>";
}
?>