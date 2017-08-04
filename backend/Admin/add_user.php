<?php
include("dbcon.php");
// error_reporting(0);

$name=$_REQUEST['name'];
$name=trim($name);
$email=$_REQUEST['email'];
$email=trim($email);
echo $remark=$_REQUEST['remark'];
$remark=trim($remark);

$name=mysqli_real_escape_string($con,$name);
$email=mysqli_real_escape_string($con,$email);
$remark=mysqli_real_escape_string($con,$remark);

function generatePassword($length = 4) {
    $chars = 'abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789';
    $count = mb_strlen($chars);

    for ($i = 0, $result = ''; $i < $length; $i++) {
        $index = rand(0, $count - 1);
        $result .= mb_substr($chars, $index, 1);
    }
  
    return $result;
}
$pass=generatePassword();

if($name=="" || $email=="" || $remark=="")
{
	echo "<script>alert('Please input all the fields!');window.location.href='user.php';</script>";
}
else
{
	if($insert=mysqli_query($con,"INSERT INTO `admins`(`username`, `password`, `remarks`, `Name`) VALUES ('$email','$pass','$remark','$name')"))
	{
	echo "<script>alert('User Added!');window.location.href='user.php';</script>";
	}
	else
	{
	echo "<script>alert('Problem in adding user!');window.location.href='user.php';</script>";
	}
}
?>