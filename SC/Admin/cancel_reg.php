<?php
include("dbcon.php");
error_reporting(0);

$id=$_REQUEST['cancel'];

$update=mysqli_query($con,"UPDATE `user` SET `ConfirmationStatus`='N' WHERE `id`='$id'");
header('Location: status.php');
?>