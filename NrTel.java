
package proiectfinaljava;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class NrTel implements Serializable {
    private String nrTel;
    public void setNrTel(String n){
        Pattern pattern = Pattern.compile("\\d{10}");
        Matcher matcher = pattern.matcher(n);
        if(! (matcher.matches() && (((n.startsWith("07") || n.startsWith("02")|| n.startsWith("03")))))){
            throw new IllegalArgumentException("Numarul de telefon introdus nu este valid!");
        }
        else{
            nrTel=n;
        }
    }
    public String getNrTel(){
        return nrTel;
    }
}
