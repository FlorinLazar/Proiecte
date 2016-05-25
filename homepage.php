<?php
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
session_start();
$_SESSION['produse'] = array();
$_SESSION['total'] = 0;
$form= <<<INCEPUT
        <h1>LOGIN</h1>
        <form action=$_SERVER[PHP_SELF] method="POST">
            <label>Username: <input type="text" name="user" placeholder="Username-ul dvs"></label><br>
            <label>Parola: <input type="password" name="pass" placeholder="Parola dvs"></label>
            <input type="submit" value="Login">
        </form><br>
        Daca nu ai un cont, <a href="creare.php">creeaza-ti unul</a>
INCEPUT;
if($_GET['logout']==1){
    $_SESSION = array();
}
if($_SERVER['REQUEST_METHOD']=="GET"){
    include "meniuri.php";
    if(!empty($_SESSION['logat'])){
        echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a><br><br>";
        echo "Navigati printre pagini";
    }else{
    echo $form;
    }
}else{
    $conturi = file_get_contents("conturi.txt");
    $arr = explode("<br>",$conturi);
    foreach($arr as $element){
        $el = explode("/",$element);
        if($_POST['user']==$el[0] && $_POST['pass']==$el[1]){
            session_start();
            $_SESSION['username']=$_POST['user'];
            $_SESSION['logat']="true";
            $_SESSION['email']=$el[3];
            $_SESSION['pass']=$el[2];
            include "meniuri.php";
            include "logat.php";
            echo "<br/>Esti logat. Acum poti naviga pe site";

    }
    }
    if((!$_SESSION['logat']=="true")){
        include "meniuri.php";
        echo "Username sau parola gresite.<br/>";
        echo $form;
    }
}


?>