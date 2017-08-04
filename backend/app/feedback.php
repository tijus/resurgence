<?php
error_reporting(0);
if($con=mysqli_connect("localhost","somaiyaappadmin","#resurgence2K16","somaiyaappdb"))
{}
else
{echo "Problem in connecting to Database";}


$name=$_REQUEST['rtxtFullname'];
$name=trim($name);
$email=$_REQUEST['rtxtEmail'];
$email=trim($email);
echo $remark=$_REQUEST['rtxtMessage'];
$remark=trim($remark);

$name=mysqli_real_escape_string($con,$name);
$email=mysqli_real_escape_string($con,$email);
$remark=mysqli_real_escape_string($con,$remark);



	if($insert=mysqli_query($con,"INSERT INTO `feedback`(`Name`, `Email`, `Message`) VALUES ('$name','$email','$remark')"))
	{
	echo "Successfull";
	}
	else
	{
	echo "";
	}

?>