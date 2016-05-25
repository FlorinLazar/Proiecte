<?php
    session_start();
    $_SESSION['produse'] = array();
    $_SESSION['total'] = 0;
    include "meniuri.php";

    if(empty($_SESSION['logat'])){
        include "meniunelogat.php";
    }else{
        echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a><br><br>";
        include "meniulogat.php";
    }
?>