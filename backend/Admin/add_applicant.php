<?php
include("dbcon.php");
// error_reporting(0);

$name=$_REQUEST['name'];
$name=trim($name);
$name=mysqli_real_escape_string($con,$name);

$email=$_REQUEST['email'];
$email=trim($email);
$email=mysqli_real_escape_string($con,$email);

$branch=$_REQUEST['branch'];
$branch=trim($branch);
$branch=mysqli_real_escape_string($con,$branch);

$college=$_REQUEST['college'];
$college=trim($college);
$college=mysqli_real_escape_string($con,$college);

$mn=$_REQUEST['mn'];
$mn=trim($mn);
$mn=mysqli_real_escape_string($con,$mn);

$conf=$_REQUEST['conf'];
if($conf!="Y")
{
	$conf="N";
}

$total=0;
$count=0;

if($name=="" || $email=="" || $branch=="" || $college=="" || $mn=="")
{
	echo "<script>alert('Please Input all the fields!');window.location.href='applicant.php';</script>";
}
else
{
//EVENT 1
for($i=1;$i<=3;$i++)
{
	$e='E1_'.$i;
	if($event=$_REQUEST[$e])
	{
		$total++;
		$event=mysqli_real_escape_string($con,$event);
	if($insert=mysqli_query($con,"INSERT INTO `user`(`Fullname`, `Username`, `BranchnYear`, `College`, `Contact`, `EventType`, `EventRegistered`, `ConfirmationStatus`) VALUES ('$name','$email','$branch','$college','$mn','Event 1','$event','$conf')"))
	{
		$count++;
	}
	}
}

//EVENT 2
for($i=1;$i<=3;$i++)
{
	$e='E2_'.$i;
	if($event=$_REQUEST[$e])
	{
		$total++;
		$event=mysqli_real_escape_string($con,$event);
	if($insert=mysqli_query($con,"INSERT INTO `user`(`Fullname`, `Username`, `BranchnYear`, `College`, `Contact`, `EventType`, `EventRegistered`, `ConfirmationStatus`) VALUES ('$name','$email','$branch','$college','$mn','Event 2','$event','$conf')"))
	{
		$count++;
	}
	}
}

//EVENT 3
for($i=1;$i<=3;$i++)
{
	$e='E3_'.$i;
	if($event=$_REQUEST[$e])
	{
		$total++;
		$event=mysqli_real_escape_string($con,$event);
	if($insert=mysqli_query($con,"INSERT INTO `user`(`Fullname`, `Username`, `BranchnYear`, `College`, `Contact`, `EventType`, `EventRegistered`, `ConfirmationStatus`) VALUES ('$name','$email','$branch','$college','$mn','Event 3','$event','$conf')"))
	{
		$count++;
	}
	}
	
}

if($total==$count)
{
	echo "<script>alert('Participant Added!');window.location.href='applicant.php';</script>";
}
else
{
	echo "<script>alert('Problem in adding applicant!');window.location.href='applicant.php';</script>";
}
}
?>