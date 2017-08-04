<?php
$servername = "localhost";
$username = "somaiyaappadmin";
$password = "#resurgence2K16";
$dbname = "somaiyaappdb";

// Create connection
$conn = new mysqli($servername, $username, $password, $dbname);
// Check connection
if ($conn->connect_error) {
    die("Connection failed: " . $conn->connect_error);
} 



?>