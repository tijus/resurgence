<?php
include("dbcon.php");
error_reporting(0);

$id=$_REQUEST['approve'];

$update=mysqli_query($con,"UPDATE `user` SET `ConfirmationStatus`='Y' WHERE `id`='$id'");
header('Location: status.php');
?>