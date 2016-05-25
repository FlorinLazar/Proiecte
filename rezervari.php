<?php
$ore = array("10:00","10:30","11:00","11:30","12:00","12:30","13:00","13:30","14:00","14:30","15:00","15:30","16:00","16:30","17:00","17:30","18:00","18:30","19:00","19:30","20:00","20:30","21:00","21:30","22:00","22:30");
    $form = <<<INC
    <form action="$_SERVER[PHP_SELF]" method='POST'>
        Data: <input type='date' name="data"/><br>
        Ora: <select name='ora'>
            <option value='10:00'>10:00</option>
            <option value='10:30'>10:30</option>
            <option value='11:00'>11:00</option>
            <option value='11:30'>11:30</option>
            <option value='12:00'>12:00</option>
            <option value='12:30'>12:30</option>
            <option value='13:00'>13:00</option>
            <option value='13:30'>13:30</option>
            <option value='14:00'>14:00</option>
            <option value='14:30'>14:30</option>
            <option value='15:00'>15:00</option>
            <option value='15:30'>15:30</option>
            <option value='16:00'>16:00</option>
            <option value='16:30'>16:30</option>
            <option value='17:00'>17:00</option>
            <option value='17:30'>17:30</option>
            <option value='18:00'>18:00</option>
            <option value='18:30'>18:30</option>
            <option value='19:00'>19:00</option>
            <option value='19:30'>19:30</option>
            <option value='20:00'>20:00</option>
            <option value='20:30'>20:30</option>
            <option value='21:00'>21:00</option>
            <option value='21:30'>21:30</option>
            <option value='22:00'>22:00</option>
            <option value='22:30'>22:30</option>
        </select></br>
        Numar persoane: <input type="number" name='pers' min="1" max="20"></br>
        <input type="submit" value="Rezerva">
INC;
    session_start();
    if(empty($_SESSION['logat'])){
        include "meniuri.php";
        echo "Rezervarile sunt permise doar user-ilor care sunt logati.<br>";
        echo "Intoarce-te la <a href='homepage.php'>pagina principala</a>";
    }else{
        if($_SERVER['REQUEST_METHOD']=="GET"){
            include "meniuri.php";
            echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
            echo $form."</br>";
            echo "Istoricul rezervarilor:</br> ";
            $rez = file_get_contents("istoric_rezervari.txt");
            $rez1 = explode("<br>",$rez);
            foreach($rez1 as $el){
                $elem = explode("/",$el);
                if($_SESSION['username']==$elem[0]){
                    echo $elem[1]."</br>";
                }
                
            }
        }else{
            if(!in_array($_POST['ora'],$ore)){
                include "meniuri.php";
                echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
                echo $form."</br>";
                echo "Nu s-a putut face rezervarea pentru aceasta ora."; 
                echo "Istoricul rezervarilor:</br> ";
            $rez = file_get_contents("istoric_rezervari.txt");
            $rez1 = explode("<br>",$rez);
            foreach($rez1 as $el){
                $elem = explode("/",$el);
                if($_SESSION['username']==$elem[0]){
                    echo $elem[1]."</br>";
                }
                
            }
            }elseif($_POST['pers']<1 && $_POST['pers']>20){
                include "meniuri.php";
                echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
                echo $form."</br>";
                echo "Nu s-a putut face rezervarea pentru acest numar de persoane."; 
                echo "Istoricul rezervarilor:</br> ";
            $rez = file_get_contents("istoric_rezervari.txt");
            $rez1 = explode($rez,"<br>");
            foreach($rez1 as $el){
                $elem = explode($el,"/");
                if($_SESSION['username']==$elem[0]){
                    echo $elem[1]."</br>";
                }
                
            }
            }else{
                $model = "Data: ".$_POST['data']."\n "."Ora: ".$_POST['ora']."\n "."Numar persoane: ".$_POST['pers'];
                file_put_contents("istoric_rezervari.txt",$_SESSION['username']."/",FILE_APPEND);
                file_put_contents("istoric_rezervari.txt",$model,FILE_APPEND);
                file_put_contents("istoric_rezervari.txt","<br>",FILE_APPEND);
                include "meniuri.php";
                echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
                echo "Rezervarea a fost efectuata.</br>";
                echo "Istoricul rezervarilor:</br> ";
            $rez = file_get_contents("istoric_rezervari.txt");
            $rez1 = explode("<br>",$rez);
            foreach($rez1 as $el){
                $elem = explode("/",$el);
                if($_SESSION['username']==$elem[0]){
                    echo $elem[1]."</br>";
                }
                
            }
        }
  
        }}
?>