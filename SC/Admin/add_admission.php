<?php
include("dbcon.php");
// error_reporting(0);

$label=$_REQUEST['label'];
$label=trim($label);
$label=mysqli_real_escape_string($con,$label);

$matter=$_REQUEST['matter'];
$matter=trim($matter);
$matter=mysqli_real_escape_string($con,$matter);



$date=$_REQUEST['date'];
$date=trim($date);
$date=mysqli_real_escape_string($con,$date);

$file_name=$_FILES['file']['name'];
$file_name = str_replace(' ', '_', $file_name);
$targetfolder = "../uploads/media/pdf/";
 
 $targetfolder = $targetfolder . basename( $file_name) ;


if($label=="")
{
	echo "<script>alert('Please input all the fields!');window.location.href='admissions.php';</script>";
}
else
{
	$url="../uploads/media/pdf/".$file_name;
 if(move_uploaded_file($_FILES['file']['tmp_name'], $targetfolder))
 {
	if($insert=mysqli_query($con,"INSERT INTO `admission`(`Label`, `Matter` ,`URL` , `Date`) VALUES ('$label','$matter','$url','$date')"))
	{
		echo "<script>alert('Details Added!');window.location.href='admissions.php';</script>";
	}
	else
	{
		echo "<script>alert('Problem in adding details!');window.location.href='admissions.php';</script>";
	}}
	else
	{
		echo "<script>alert('".$_FILES['file']['error']."');window.location.href='admissions.php';</script>";		
	}
}
?>