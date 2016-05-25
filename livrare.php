<?php
include "produse.php";
error_reporting(E_ALL & ~E_NOTICE & ~E_WARNING);
include "produse.php";
session_start();
if(empty($_SESSION['produse']))
	$_SESSION['produse'] = array();
$form .=
    "Adauga produse:</br><form action=$_SERVER[PHP_SELF] method='POST'>
        <select name='produse'>";
foreach($fel1 as $k=>$f){
    $form .="<option>$k</option>";
}
foreach($fel2 as $k=>$f){
    $form .="<option>$k</option>";
}
foreach($pizza as $k=>$f){
    $form .="<option>$k</option>";
}
$form .="</select><br><input type='submit' name='add' value='Adauga'>
                  <br><input type='submit' name='finish' value='Trimite comanda'/></form></br>";

    if(empty($_SESSION['logat'])){
        include "meniuri.php";
        echo "Livrarile la domiciliu sunt permise doar user-ilor care sunt logati.<br>";
        echo "Intoarce-te la <a href='homepage.php'>pagina principala</a>";
    }else{
        if($_SERVER['REQUEST_METHOD']=="GET"){
            include "meniuri.php";
            echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
            echo $form."</br>";
        }else{
            include "meniuri.php";
            echo "Sunteti logat ca si $_SESSION[username] | <a href='homepage.php?logout=1'> Logout </a></br></br>";
            if(isset($_POST['add'])){
                $_SESSION['produse'][]=$_POST['produse'];
            }elseif(!empty($_POST['sterge']) && is_array($_POST['sterge'])){
                unset($_SESSION['produse'][key($_POST['sterge'])]);
            }elseif(!empty($_POST['produse_de_sters']) && is_array($_POST['produse_de_sters'])){
                foreach($_POST['produse_de_sters'] as $id){
                    unset($_SESSION['produse'][$id]);
                }
            }elseif(!empty($_POST['finish'])){
                $model = "";
                foreach($_SESSION['produse'] as $produse){
                    $model .= "Fel de mancare: ".$produse." Pret: ".$total[$produse]." lei \n"; 
                }
                $model .= "Total: ".$_SESSION['total']. " lei \n";
                file_put_contents("istoric_comenzi.txt",$_SESSION['username']."/",FILE_APPEND);
                file_put_contents("istoric_comenzi.txt",$model,FILE_APPEND);
                file_put_contents("istoric_comenzi.txt","<brt>",FILE_APPEND);
                $_SESSION['produse'] = array();
                $_SESSION['total'] = 0;
                echo "Comanda a fost efectuata.</br>";
            }
        
        echo "<form method='POST' action=$_SERVER[PHP_SELF]>";
        if(!empty($_SESSION['produse'])){
            echo "<ul>";
            $suma = 0;
            foreach($_SESSION['produse'] as $id=>$produs){
                $suma += $total[$produs];
                echo "<li>
                    <input type=checkbox name='produse_de_sters[]' value=$id />$produs - ".$total[$produs]." lei
                    <input type=submit  name='sterge[$id]' value=Sterge />
                    </li>\n";
            }
            echo "</ul>";
            $_SESSION['total']=$suma;
            echo "Total: ".$suma." lei</br>";
            echo "<input type=submit value='Sterge produsele selectate' /></br>";
        }
        
    $form = 
        "<select name='produse'>";
foreach($fel1 as $k=>$f){
    $form .="<option>$k</option>";
}
foreach($fel2 as $k=>$f){
    $form .="<option>$k</option>";
}
foreach($pizza as $k=>$f){
    $form .="<option>$k</option>";
}
$form .="</select><br><input type='submit' name='add' value='Adauga'>
                  <br><input type='submit' name='finish' value='Trimite comanda'/></form></br>";
        echo $form."</br>";
        }
        echo "Istoricul comenzilor:</br> ";
            $rez = file_get_contents("istoric_comenzi.txt");
            $rez1 = explode("<brt>",$rez);
            foreach($rez1 as $el){
                $elem = explode("/",$el);
                if($_SESSION['username']==$elem[0]){
                    echo nl2br($elem[1])."</br>";
                }
                
            }    
            
        }

?>