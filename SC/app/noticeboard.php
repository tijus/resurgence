<?php
include("dbcon.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>
  <title>Notification Panel</title>
  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js"></script>
  <style type="text/css">
      .notification{
        color: #a94442;+
        background-color: #f2dede;
        border-color: #ebccd1;
        
        
        
        border: 1px solid transparent;
        border-radius: 4px;
    }

    body{
        background-color: #FFFFFF;
        padding: 15px;
    }
</style>
</head>
<body>

<?php
$matter=$_GET["matter"];
$sql = "SELECT * FROM noticeboard where Matter='$matter' order by id DESC";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  
    // output data of each row
    while($row = $result->fetch_assoc()) {
        
    
?>

<div class="container" onclick="location.href='<?php echo $row["URL"]?>'">
 <div class="notification">
      <strong><?php echo $row["Label"]; ?></strong><br>
        <?php echo $row["Matter"]; ?>
        <div align="right"><?php echo $row["Date"];?></div>
        <hr>
    </div>
   </div>

    <?php
    }
    
} else {
    echo "Noticeboard is empty";
}
$conn->close();
?>

</body>
</html>

