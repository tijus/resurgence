<?php
include("dbcon.php");
?>

<!DOCTYPE html>
<html lang="en">
<head>

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
    img {
    transition: -webkit-transform 0.25s ease;
}

img:active {
    -webkit-transform: scale(2);
}

    body{
        background-color: #FFFFFF;
        padding: 15px;
    }
</style>
</head>
<body style="background-color:#FFF5E4">



<?php
$role=$_GET['role'];
if (!isset($role))
{
echo "Bad input";
}
else
{
$sql = "SELECT * FROM updates where role='$role' order by Id DESC";
$result = $conn->query($sql);

if ($result->num_rows > 0) {
  
    // output data of each row
    while($row = $result->fetch_assoc()) {
        
    
?>


 <div class="notification" style="background-color:White; margin:10% 0% 10% 0%">
 <img src='<?php echo $row["ImagePath"]; ?>' style="width: 100%; height: 100% ;"><br>
 <div style="margin:5%">
      <strong><?php echo $row["UpdateTitle"]; ?></strong><br>

        <?php
echo '<script>
function toggletext_'.$row["id"].'() {
 var ele_ara = document.getElementById("toggleText_'.$row["id"].'");
 var text_ara = document.getElementById("displayText_'.$row["id"].'");
 if(ele_ara.style.display == "block") {
      ele_ara.style.display = "none";
  text_ara.innerHTML = "Read Description";
   }
 else {
  ele_ara.style.display = "block";
  text_ara.innerHTML = "";
 }
}
</script>';
$string = strip_tags($row["UpdateDescription"]);
echo '<span><b><a href="javascript:toggletext_'.$row["id"].'();" id="displayText_'.$row["id"].'">Read Description</a></b></span>';
echo '<div id="toggleText_'.$row["id"].'" style="display: none;">
'.$row["UpdateDescription"].'
</div>';



 ?>

  
</div>
     
         </div>


    <?php
    }
    
} else {
    echo "No updates to display";
}
$conn->close();
}
?>

</body>
</html>

