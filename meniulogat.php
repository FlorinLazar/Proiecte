<?php
include "produse.php";
echo "<table border=1><thead>
        <tr><td>Nume produs</td><td>Pret (lei)</td></tr></thead><tbody>";
echo "<tr><td colspan=2><b>Ciorbe</b></td></tr>";
foreach($fel1 as $k=>$c){
    echo "<tr><td>$k</td><td>$c</td></tr>";
}
echo "<tr><td colspan=2><b>Felul 2</b></td></tr>";
foreach($fel2 as $k=>$c){
    echo "<tr><td>$k</td><td>$c</td></tr>";
}
echo "<tr><td colspan=2><b>Pizza</b></td></tr>";
foreach($pizza as $k=>$c){
    echo "<tr><td>$k</td><td>$c</td></tr>";
}
echo "</tbody></table><br><br>";
echo "Pentru a putea vizualiza si preturile va rugam sa va logati.";
?>