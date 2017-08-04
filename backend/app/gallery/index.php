<?php
include("dbcon.php");
$event=$_GET["event"];
?>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">
    <title>Gallery</title>
    <link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/css/bootstrap.min.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-1.11.2.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/3.3.2/js/bootstrap.min.js"></script>
    <script src="photo-gallery.js"></script>
  </head>
  <style>
      ul {         
          padding:0 0 0 0;
          margin:0 0 0 0;
      }
      ul li {     
          list-style:none;
          margin-bottom:25px;           
      }
      ul li img {
          cursor: pointer;
      }
      .modal-body {
          padding:5px !important;
      }
      .modal-content {
          border-radius:0;
      }
      .modal-dialog img {
          text-align:center;
          margin:0 auto;
      }
    .controls{          
        width:50px;
        display:block;
        font-size:11px;
        padding-top:8px;
        font-weight:bold;          
    }
    .next {
        float:right;
        text-align:right;
    }
      /*override modal for demo only*/
      .modal-dialog {
          max-width:500px;
          padding-top: 90px;
      }
      @media screen and (min-width: 768px){
          .modal-dialog {
              width:500px;
              padding-top: 90px;
          }          
      }
      @media screen and (max-width:1500px){
          #ads {
              display:none;
          }
      }
     body
     {
       margin-top:8%;
     }
  </style>
  <body>    
    <div class="container">    
    
        <ul class="row">
           
              
                <?php
$sql = "SELECT * FROM gallery where Type='$event' order by Id DESC";

$result = $conn->query($sql);

if ($result->num_rows >= 0) {
  
    // output data of each row
    while($row = $result->fetch_assoc()) {
        
    
?>
             <li class="col-lg-3 col-md-4 col-xs-6 thumb ">
                   <img src='<?php echo $row["ImagePath"]; ?>' style="width: 100%; height: 100% ;" alt=""><br>
               </li>
            <?php
    }
    
} else {
    echo "Image gallery is empty";
}
$conn->close();
?>
            
          </ul>             
    </div> <!-- /container -->
    
     
    <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
      <div class="modal-dialog">
        <div class="modal-content">         
          <div class="modal-body">                
          </div>
        </div><!-- /.modal-content -->
      </div><!-- /.modal-dialog -->
    </div><!-- /.modal -->
    
  </body>


  
</html>
