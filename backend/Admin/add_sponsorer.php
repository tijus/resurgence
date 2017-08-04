<?php
include("dbcon.php");
// error_reporting(0);

$spon=$_REQUEST['spon'];
$spon=trim($spon);
$spon=mysqli_real_escape_string($con,$spon);

$url=$_REQUEST['url'];
$url=trim($url);
$url=mysqli_real_escape_string($con,$url);

if($spon=="" || $url=="")
{
	echo "<script>alert('Please input all the fields!');window.location.href='sponsorer.php';</script>";
}
else
{
	$url='http://'.$url;
	if($insert=mysqli_query($con,"INSERT INTO `sponsors`(`SponsorName`, `URL`) VALUES ('$spon','$url')"))
	{
		echo "<script>alert('Sponsorer Added!');window.location.href='sponsorer.php';</script>";
	}
	else
	{
		echo "<script>alert('Problem in adding sponsorer!');window.location.href='sponsorer.php';</script>";
	}
}
?>