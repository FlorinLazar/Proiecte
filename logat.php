<?php
    session_start();
    if(empty($_SESSION['logat'])){
        
        header("Location:homepage.php");
        exit;
    }
    echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a>";
?>