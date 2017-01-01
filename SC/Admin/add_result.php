<?php
include("dbcon.php");
// error_reporting(0);

$class=$_REQUEST['class'];
$class=trim($class);
$class=mysqli_real_escape_string($con,$class);

$session=$_REQUEST['session'];
$session=trim($session);
$session=mysqli_real_escape_string($con,$session);
$file_name=$_FILES['file']['name'];
$file_name = str_replace(' ', '_', $file_name);
$targetfolder = "../uploads/media/pdf/";
 
 $targetfolder = $targetfolder . basename( $file_name) ;

 
 $ok=1;


$date=$_REQUEST['date'];
$branch=$_REQUEST['branch'];
$year=$_REQUEST['year'];

$date=mysqli_real_escape_string($con,$date);

$syllabus=$_REQUEST['syllabus'];
$syllabus=trim($syllabus);
$syllabus=mysqli_real_escape_string($con,$syllabus);

if($class=="" || $session=="" ||  $date=="" || $syllabus=="" || $branch=="" || $year=="")
{
	echo "<script>alert('Please input all the fields!');window.location.href='results.php';</script>";
}
else if(($branch=="BSH" && $year=="I" && ($class=="SEM I" || $class=="SEM II")) || ($year=="II" && ($class=="SEM III" || $class=="SEM IV")) || ($year=="III" && ($class=="SEM V" || $class=="SEM VI")) || ($year=="IV" && ($class=="SEM VII" || $class=="SEM VIII")))
{	
	$url="../uploads/media/pdf/".$file_name;
 if(move_uploaded_file($_FILES['file']['tmp_name'], $targetfolder))
 {

	if($insert=mysqli_query($con,"INSERT INTO `results`(`Class`, `Class_sess` ,`Url` , `date_selected`,`Syllabus`,`Branch`,`Year`) VALUES ('$class','$session','$url','$date','$syllabus','$branch','$year')"))
	{
		echo "<script>alert('Details Added!');window.location.href='results.php';</script>";
	}
	else
	{
		echo "<script>alert('Problem in adding details!');window.location.href='results.php';</script>";
	}}
	else
	{
		echo "<script>alert('".$_FILES['file']['error']."');window.location.href='results.php';</script>";		
	}
}
else

{
	echo "<script>alert('Please input the correct fields!');window.location.href='results.php';</script>";
}

?>