<?php
include("dbcon.php");


$username=$_REQUEST["usr"];
$password=$_REQUEST["pwd"];
session_start();
if($username!="" && $password!="")
{
    $sql = "SELECT * FROM admins where username='$username' and password='$password'";

    $result = mysqli_query($con, $sql);

    if (mysqli_num_rows($result) > 0) 
    {
        $row = mysqli_fetch_assoc($result);
        if($row["remarks"]=="admin")
        {
//            echo $row["remarks"];


            $_SESSION['uname'] = $row['username'];
            $_SESSION['passwd'] = $row['password'];
            $_SESSION['role'] = $row['remarks'];

            echo 'Please <a href="AdminDashboard.php?role=admin">click here</a> to redirect';
            header('Location: http://kjsieit.in/SC/Admin/AdminDashboard.php',302);
            die();

        }
        else if ($row["remarks"]=="user")
        {
            

            $_SESSION['uname'] = $row['username'];
            $_SESSION['passwd'] = $row['password'];
            $_SESSION['role'] = $row['remarks'];

            echo 'Please <a href="AdminDashboard.php?role=user">click here</a> to redirect';
            header('Location: http://kjsieit.in/SC/Admin/AdminDashboard.php',302);
            die();
        }}
        else
        {
            echo "<script>alert('Invalid username or password!');window.location.href='index.php';</script>";
        }

    

}
    else
    {
    echo "<script>alert('Please input all the fields!');window.location.href='index.php';</script>";
    }    


?>
