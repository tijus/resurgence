<?php
include("dbcon.php");
// error_reporting(0);
session_start();

$id=$_REQUEST['del'];
$role=$_SESSION['role'];
$file=mysqli_query($con,"SELECT ImagePath FROM updates WHERE id='$id'");
while($row=mysqli_fetch_array($file))
{
	$fname=$row['ImagePath'];
}
if($delete=mysqli_query($con,"DELETE FROM updates WHERE id='$id'"))
{
	echo "<script>alert('Updated Deleted!');
              window.location.href='updates.php?role=".$role."';</script>";

}
else
{
	echo "<script>alert('Unable to delete update!');window.location.href='updates.php?role=".$role."';</script>";
}
?>