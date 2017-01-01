<?php
include("dbcon.php");
// error_reporting(0);

$title=$_REQUEST['title'];
$title=trim($title);
$role=$_REQUEST['role'];

$title=mysqli_real_escape_string($con,$title);

$desp=$_REQUEST['desp'];
$desp=trim($desp);
$desp=mysqli_real_escape_string($con,$desp);

$targetfolder = "../uploads/updates/";
 
 $targetfolder = $targetfolder . basename( $_FILES['file']['name']) ;
 
 $ok=1;
$file_name=$_FILES['file']['name'];
 
 if($title=="" || $desp=="")
 {
 	echo "<script>alert('Please input all the fields!');window.location.href='updates.php?role=".$role."';</script>";	
 }
 else
 {
 
$url="../uploads/updates/$file_name";
 if(move_uploaded_file($_FILES['file']['tmp_name'], $targetfolder))
 {
 	if($insert=mysqli_query($con,"INSERT INTO `updates`(`UpdateTitle`, `UpdateDescription`, `ImagePath`, `role`) VALUES ('$title','$desp','$url', '$role')"))
 	{
 	echo "<script>alert('Updates Added!');window.location.href='updates.php?role=".$role."';</script>";		
 	}
 	else
 	{
 	echo "<script>alert('Unable to add update!');window.location.href='updates.php?role=".$role."';</script>";		
 	}
 }
 else
 {
 	echo "<script>alert('Error in uploading file!');window.location.href='updates.php?role=".$role."';</script>";		
 }

}
?>