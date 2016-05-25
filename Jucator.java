
public class Jucator {
    private int nrVieti=3;
    private int greseli=0;
    private String nivel;
    private int cuvinteCompletate=0;
    private int scor=0;
    private String nume;
    public void setNrVieti(int nrVieti){
        this.nrVieti=nrVieti;
    }
    public int getNrVieti(){
        return nrVieti;
    }
    public void setGreseli(int greseli){
        this.greseli=greseli;
    }
    public int getGreseli(){
        return greseli;
    }
    public void setNivel(String nivel){
        this.nivel=nivel;
    }
    public String getNivel(){
        return nivel;
    }
    public void setCuvinteCompletate(){
        cuvinteCompletate=0;
    }
    public void setCuvinteCompletate(int cuvinteCumpletate){
        this.cuvinteCompletate=cuvinteCompletate+1;
    }
    public int getCuvinteCompletate(){
        return cuvinteCompletate;
    }
    public int getScor(){
        return scor;
    }
    public void setScor(){
        scor=0;
    }
    public void setScor(int i){
        scor=i;
    }
    public void setScorUsor(){
        scor=scor+1;
    }
    public void setScorMediu(){
        scor=scor+2;
    }
    public void setScorGreu(){
        scor=scor+4;
    }
}
