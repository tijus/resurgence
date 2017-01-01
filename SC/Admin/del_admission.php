<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];


if($delete=mysqli_query($con,"DELETE FROM admission WHERE Id='$id'"))
{
	echo "<script>alert('Results Deleted!');window.location.href='admissions.php';</script>";

}
else
{
	echo "<script>alert('Unable to delete results!');window.location.href='admissions.php';</script>";
}
?>