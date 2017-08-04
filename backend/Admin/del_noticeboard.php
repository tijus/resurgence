<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];
$role=$_SESSION['role'];

if($delete=mysqli_query($con,"DELETE FROM noticeboard WHERE id='$id'"))
{
	echo "<script>alert('Noticeboard Deleted!');window.location.href='noticeboard.php';</script>";

}
else
{
	echo "<script>alert('Unable to delete notice!');window.location.href='noticeboard.php';</script>";
}
?>