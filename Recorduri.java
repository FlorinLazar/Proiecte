
import java.io.Serializable;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Florin
 */
public class Recorduri implements Serializable {
     private String nume1;
     private String nume2;
     private String nume3;
     private String nume4;
     private String nume5;
     private int scor1;
     private int scor2;
     private int scor3;
     private int scor4;
     private int scor5;
     public void Clasare(int scor, String nume){
         if(scor>scor1){
             scor5=scor4;
             nume5=nume4;
             scor4=scor3;
             nume4=nume3;
             scor3=scor2;
             nume3=nume2;
             scor2=scor1;
             nume2=nume1;
             scor1=scor;
             nume1=nume;
             
         }else if(scor>scor2){
             scor5=scor4;
             nume5=nume4;
             scor4=scor3;
             nume4=nume3;
             scor3=scor2;
             nume3=nume2;
             scor2=scor;
             nume2=nume;
         }else if(scor>scor3){
             scor5=scor4;
             nume5=nume4;
             scor4=scor3;
             nume4=nume3;
             scor3=scor;
             nume3=nume;
         }else if(scor>scor4){
             scor5=scor4;
             nume5=nume4;
             scor4=scor;
             nume4=nume;
         }else if(scor>scor5){
             scor5=scor;
             nume5=nume;
         }
    }
    public String getNume1(){
         return nume1;
    }
    public int getScor1(){
         return scor1;
     }
    public String getNume2(){
         return nume2;
     }
    public int getScor2(){
         return scor2;
     }
    public String getNume3(){
         return nume3;
     }
    public int getScor3(){
         return scor3;
     }
    public String getNume4(){
         return nume4;
     }
    public int getScor4(){
         return scor4;
     }
    public String getNume5(){
         return nume5;
     }
    public int getScor5(){
         return scor5;
     }
    public void setNume1(String s){
        nume1=s;
    }
    public void setNume2(String s){
        nume2=s;
    }
    public void setNume3(String s){
        nume3=s;
    }
    public void setNume4(String s){
        nume4=s;
    }
    public void setNume5(String s){
        nume5=s;
    }
    public void setScor1(int s){
        scor1=s;
    }
    public void setScor2(int s){
        scor2=s;
    }
    public void setScor3(int s){
        scor3=s;
    }
    public void setScor4(int s){
        scor4=s;
    }
    public void setScor5(int s){
        scor5=s;
    }
    
}
    
