
package proiectfinaljava;

import java.io.Serializable;
import static java.lang.Integer.parseInt;
import java.util.Comparator;

public class Abonat extends NrTel implements Serializable {
    private String nume;
    private String prenume;
    private String cnp;
    private NrTel nrTel = new NrTel();
    Abonat(String nume,String prenume,String cnp, String nrtel){
        if(!nume.matches( "[A-Z][a-zA-Z]*")){
            throw new IllegalArgumentException("Numele introdus nu este corect!");
        }else{
            this.nume=nume;
        }
        if(!prenume.matches( "[A-Z][a-zA-Z]*")){
            throw new IllegalArgumentException("Prenumele introdus nu este corect!");
        }else{
            this.prenume=prenume;
        }
        if(!((cnp.matches("-?\\d+(\\.\\d+)?")) &&
            (cnp.startsWith("1")||cnp.startsWith("2")) && 
            (cnp.length()==13) &&
            (parseInt(cnp.substring(3,5))<=12) &&
            (parseInt(cnp.substring(5,7))<=31))){
                throw new IllegalArgumentException("CNP-ul introdus nu este valid.");
        }else{
            this.cnp=cnp;
        }
        nrTel.setNrTel(nrtel);
        }
    
    public static Comparator<Abonat> NumeAlfabeticCrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String NumeAbonat1 = a1.getNume().toUpperCase();
            String NumeAbonat2 = a2.getNume().toUpperCase();
            
            return NumeAbonat1.compareTo(NumeAbonat2);
        }
        
    };
    
    public static Comparator<Abonat> NumeAlfabeticDescrescator= new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String NumeAbonat1 = a1.getNume().toUpperCase();
            String NumeAbonat2 = a2.getNume().toUpperCase();
            
            return NumeAbonat2.compareTo(NumeAbonat1);
        }
        
    };
    
    public static Comparator<Abonat> PrenumeAlfabeticCrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String PrenumeAbonat1 = a1.getPrenume().toUpperCase();
            String PrenumeAbonat2 = a2.getPrenume().toUpperCase();
            
            return PrenumeAbonat1.compareTo(PrenumeAbonat2);
        }
        
    };
    
    public static Comparator<Abonat> PrenumeAlfabeticDescrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String PrenumeAbonat1 = a1.getPrenume().toUpperCase();
            String PrenumeAbonat2 = a2.getPrenume().toUpperCase();
            
            return PrenumeAbonat2.compareTo(PrenumeAbonat1);
        }
        
    };
    
    public static Comparator<Abonat> CNPCrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String CnpAbonat1 = a1.getCnp().toUpperCase();
            String CnpAbonat2 = a2.getCnp().toUpperCase();
            
            return CnpAbonat1.compareTo(CnpAbonat2);
        }
        
    };

    public static Comparator<Abonat> CNPDescrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String CnpAbonat1 = a1.getCnp().toUpperCase();
            String CnpAbonat2 = a2.getCnp().toUpperCase();
            
            return CnpAbonat2.compareTo(CnpAbonat1);
        }
        
    };
    
    public static Comparator<Abonat> NrTelCrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String NrTelAbonat1 = a1.getNumar().toUpperCase();
            String NrTelAbonat2 = a2.getNumar().toUpperCase();
            
            return NrTelAbonat1.compareTo(NrTelAbonat2);
        }
        
    };
    
    public static Comparator<Abonat> NrTelDescrescator = new Comparator<Abonat>(){

        public int compare(Abonat a1,Abonat a2){
            String NrTelAbonat1 = a1.getNumar().toUpperCase();
            String NrTelAbonat2 = a2.getNumar().toUpperCase();
            
            return NrTelAbonat2.compareTo(NrTelAbonat1);
        }
        
    };
    
    public void setNume(String n){
        if(!n.matches( "[A-Z][a-zA-Z]*")){
            throw new IllegalArgumentException("Numele introdus nu este corect!");
        }else{
            n=nume;
        }
    }
    public void setPrenume(String p){
        if(!p.matches( "[A-Z][a-zA-Z]*")){
            throw new IllegalArgumentException("Numele introdus nu este corect!");
        }else{
            p=nume;
        }
    }
    public void setCnp(String c){
        if(!((c.matches("-?\\d+(\\.\\d+)?")) &&
            (c.startsWith("1")||c.startsWith("2")) && 
            (c.length()==13) &&
            (parseInt(c.substring(3,5))<=12) &&
            (parseInt(c.substring(5,7))<=31))){
                throw new IllegalArgumentException("CNP-ul introdus nu este valid.");
        }else{
            c=cnp;
        }
    }
    public String getNume(){return nume;}
    public String getPrenume(){return prenume;}
    public String getCnp(){return cnp;}
    public String getNumar(){return nrTel.getNrTel();}
}

    
