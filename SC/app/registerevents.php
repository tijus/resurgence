<?php
include("dcon.php");

$sql = "INSERT INTO registrations(Timestamps, FullName, College, Conatact, Branch, )
VALUES ('John', 'Doe', 'john@example.com')";

if (mysqli_query($conn, $sql)) {
    echo "You have registered successfully. Please check your email";
} else {
    echo "";
}

mysqli_close($conn);
?>