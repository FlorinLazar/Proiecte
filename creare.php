<?php
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
    $_SESSION['produse'] = array();
    $_SESSION['total'] = 0;
    //functii validare
    function validare_username(){
        if(!preg_match("/(\w){5,}/",$_POST['username'])){
            return false;
        }
        return true;
    }
    function validare_password(){
        if($_POST['password']!=$_POST['rpassword']){
            return false;
        }
        return true;
    }
    function validare_email(){
        if(!preg_match("/^[\w.-]+@(?i)[a-z-]+\.[a-z-.]+/",$_POST['email'])){
            return false;
        }
        return true;
    }
    
    $campuri=array("username","password","email");
    foreach($campuri as $camp){
        $x="form_$camp";
        $$x= "";
    }
    $erori = array();

if($_SERVER['REQUEST_METHOD']=="POST"){
    $conturi = file_get_contents("conturi.txt");
    $arr = explode("<br>",$conturi);
    foreach($arr as $element){
        $el = explode("/",$element);
        if($_POST['username']==$el[0]){
            include "meniuri.php";
            echo "Numele de utilizator este folosit deja.";
            $form1= <<<INCEPUT
        <h1>CREATE ACCOUNT</h1>
        <form action=$_SERVER[PHP_SELF] method="POST">
            <label>Username: <input type="text" name="username"></label><br>
            <label>Password: <input type="password" name="password" ></label><br>
            <label>Retype your password: <input type="password" name="rpassword"></label><br>
            <label>Email: <input type="email" name="email"></label><br>
            <input type="submit" value="Create account"><br>
        </form>
            Daca ai deja un cont, <a href="homepage.php">logheza-te</a><br/>
INCEPUT;
        echo $form1;
            exit;
        }
    }
    foreach($campuri as $camp){
        $x="form_$camp";
        $functie_validare="validare_$camp";
        if(!$functie_validare()){
            $erori[] = "Campul $camp este invalid";
        }else{
            $$x = $_POST[$camp];
        }
    }
    $form= <<<INCEPUT
        <h1>CREATE ACCOUNT</h1>
        <form action=$_SERVER[PHP_SELF] method="POST">
            <label>Username: <input type="text" name="username" value='$form_username'></label><br>
            <label>Password: <input type="password" name="password" value='$form_password'></label><br>
            <label>Retype your password: <input type="password" name="rpassword" value='$form_password'></label><br>
            <label>Email: <input type="email" name="email" value='$form_email'></label><br>
            <input type="submit" value="Create account"><br>
        </form>
            Daca ai deja un cont, <a href="homepage.php">logheza-te</a><br/>
INCEPUT;
    if(!empty($erori)){
        foreach($erori as $err){
            echo $err;
        }
        echo $form;
    }else{
        //Verificare daca nu exista deja un user cu acest nume
        foreach($_POST as $k=>$camp){
            file_put_contents("conturi.txt","$camp/",FILE_APPEND);
        }
        file_put_contents("conturi.txt","<br>",FILE_APPEND);
        include "meniuri.php";
        include "logat.php";
        echo "Ai reusit. Intoarce-te acum la <a href='homepage.php'> pagina principala </a> pentru a te loga.";
    }
}
    elseif($_SERVER['REQUEST_METHOD']=="GET"){
        include "meniuri.php";
        $form1= <<<INCEPUT
        <h1>CREATE ACCOUNT</h1>
        <form action=$_SERVER[PHP_SELF] method="POST">
            <label>Username: <input type="text" name="username"></label><br>
            <label>Password: <input type="password" name="password" ></label><br>
            <label>Retype your password: <input type="password" name="rpassword"></label><br>
            <label>Email: <input type="email" name="email"></label><br>
            <input type="submit" value="Create account"><br>
        </form>
            Daca ai deja un cont, <a href="homepage.php">logheza-te</a><br/>
INCEPUT;
        echo $form1;
    }