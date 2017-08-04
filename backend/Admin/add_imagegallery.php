<?php
include("dbcon.php");
// error_reporting(0);





$targetfolder = "../uploads/imagegallery/";
 
 $targetfolder = $targetfolder . basename( $_FILES['file']['name']) ;
 
 $ok=1;
$file_name=$_FILES['file']['name'];
$event = $_REQUEST['event'];
 
 if($file_name=="" || $event=="")
 {
 	echo "<script>alert('Please input all the fields!');window.location.href='imagegallery.php';</script>";	
 }
 else
 {
 
$url="/SC/uploads/imagegallery/$file_name";
 if(move_uploaded_file($_FILES['file']['tmp_name'], $targetfolder))
 {
 	if($insert=mysqli_query($con,"INSERT INTO `gallery`( `ImagePath`,`Type`) VALUES ('$url','$event')"))
 	{
 	echo "<script>alert('Image added successfully!');window.location.href='imagegallery.php';</script>";		
 	}
 	else
 	{
 	echo "<script>alert('Unable to add image to the gallery!');window.location.href='imagegallery.php';</script>";		
 	}
 }
 else
 {
 	echo "<script>alert('Error in uploading file!');window.location.href='imagegallery.php';</script>";		
 }

}
?>