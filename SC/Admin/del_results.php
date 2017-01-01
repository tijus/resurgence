<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];
$role=$_SESSION['role'];

if($delete=mysqli_query($con,"DELETE FROM results WHERE id='$id'"))
{
	echo "<script>alert('Results Deleted!');window.location.href='results.php';</script>";

}
else
{
	echo "<script>alert('Unable to delete results!');window.location.href='results.php';</script>";
}
?>