

<?php
include("dbcon.php");
// error_reporting(0);

$id=$_REQUEST['del'];

$file=mysqli_query($con,"SELECT ImagePath FROM gallery WHERE id='$id'");
while($row=mysqli_fetch_array($file))
{
	$fname=$row['ImagePath'];
}
if($delete=mysqli_query($con,"DELETE FROM gallery WHERE id='$id'"))
{
	echo "<script>alert('Image deleted successfully!');window.location.href='imagegallery.php';</script>";
	unlink($fname);
}
else
{
	echo "<script>alert('Unable to delete update!');window.location.href='imagegallery.php';</script>";
}
?>
