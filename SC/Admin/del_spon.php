<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];

if($delete=mysqli_query($con,"DELETE FROM Sponsors WHERE SponsorId='$id'"))
{
	echo "<script>alert('Delete Successful!');window.location.href='sponsorer.php';</script>";
}
else
{
	echo "<script>alert('Unable to delete!');window.location.href='sponsorer.php';</script>";
}
?>