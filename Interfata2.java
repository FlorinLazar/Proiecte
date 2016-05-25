
import java.awt.CardLayout;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JWindow;
import javax.swing.SwingConstants;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Florin
 */
public class Interfata2 extends javax.swing.JFrame {
    /*ImageIcon icon0 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-0.png"));
    ImageIcon icon1 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-1.png"));
    ImageIcon icon2 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-2.png"));
    ImageIcon icon3 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-3.png"));
    ImageIcon icon4 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-4.png"));
    ImageIcon icon5 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-5.png"));
    ImageIcon icon6 = new ImageIcon(System.getProperty("user.dir"+"\\src\\Hangman-6.png"));*/
    public void SalvareLista(String s){
        try{
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(rec);
            oos.close();
            fos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }
    }
    //deserializare
    public void incarcareContacte(String s) throws IOException, ClassNotFoundException {

    try (
        InputStream file = new FileInputStream(s);
        InputStream buffer = new BufferedInputStream(file);
        ObjectInput input = new ObjectInputStream(buffer);) {
        Recorduri rec1= (Recorduri)input.readObject();
        rec.setNume1(rec1.getNume1());
        jLabelNumeLoc1.setText(rec.getNume1());
        rec.setNume2(rec1.getNume2());
        jLabelNumeLoc2.setText(rec.getNume2());
        rec.setNume3(rec1.getNume3());
        jLabelNumeLoc3.setText(rec.getNume3());
        rec.setNume4(rec1.getNume4());
        jLabelNumeLoc4.setText(rec.getNume4());
        rec.setNume5(rec1.getNume5());
        jLabelNumeLoc5.setText(rec.getNume5());
        rec.setScor1(rec1.getScor1());
        String scor1 = String.valueOf(rec1.getScor1());
        jLabelScorLoc1.setText(scor1);
        rec.setScor2(rec1.getScor2());
        String scor2 = String.valueOf(rec1.getScor2());
        jLabelScorLoc2.setText(scor2);
        rec.setScor3(rec1.getScor3());
        String scor3 = String.valueOf(rec1.getScor3());
        jLabelScorLoc3.setText(scor3);
        rec.setScor4(rec1.getScor4());
        String scor4 = String.valueOf(rec1.getScor4());
        jLabelScorLoc4.setText(scor4);
        rec.setScor5(rec1.getScor5());
        String scor5 = String.valueOf(rec1.getScor5());
        jLabelScorLoc5.setText(scor5);
        jLabelLoc1.setVisible(true);
        jLabelLoc2.setVisible(true);
        jLabelLoc3.setVisible(true);
        jLabelLoc4.setVisible(true);
        jLabelLoc5.setVisible(true);
        
        }
        
    }
    public void ButonGreu(){
        setariInitiale();
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereGreu();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Greu");
    }
    public void ButonMediu(){
        setariInitiale();
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereMediu();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==14){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Mediu");
    }
    public void ButonUsor(){
        setariInitiale();
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereUsor();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Usor");
    }
    public void UpdateImagini(){
        if(juc.getGreseli()==1){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H1.png"));
        }
        if(juc.getGreseli()==2){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H2.png"));
        }
        if(juc.getGreseli()==3){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H3.png"));
        }
        if(juc.getGreseli()==4){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H4.png"));
        }
        if(juc.getGreseli()==5){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H5.png"));
        }
        if(juc.getGreseli()==6){
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H6.png"));
        }
    }
    public void SetariNrGreseli(){
                    int valoare = jOptionPaneSalvare.showConfirmDialog(this, "Ati ramas fara vieti. Doriti sa salvati scorul obtinut?", "Intrebare", JOptionPane.YES_NO_OPTION);
                    jOptionPaneSalvare.setVisible(true);
                    if (valoare == jOptionPaneSalvare.YES_OPTION) {
                        String nume = jOptionPaneInregistrare.showInputDialog(this,"Introduceti numele");
                        if(nume == null || (nume != null && ("".equals(nume)))){
                            CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
                            cardLayout.show(jPanelCardLayout, "Card Meniu");
                            setariInitiale();
                            juc.setCuvinteCompletate();
                            juc.setScor();
                            jLabel3.setText("0");
                            jLabelNrVieti.setText("3");
                            juc.setNrVieti(3);
                        }   
                        rec.Clasare(juc.getScor(), nume);
                        UpdateClasament();
                        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
                        cardLayout.show(jPanelCardLayout, "Card Meniu");
                        setariInitiale();
                        juc.setCuvinteCompletate();
                        juc.setScor();
                        jLabel3.setText("0");
                        jLabelNrVieti.setText("3");
                        juc.setNrVieti(3);
                        

                    }   
                    if(valoare == jOptionPaneSalvare.NO_OPTION){
                        jOptionPaneSalvare.setVisible(false);
                        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
                        cardLayout.show(jPanelCardLayout, "Card Meniu");
                        setariInitiale();
                        juc.setCuvinteCompletate(0);
                        juc.setNrVieti(3);
                        jLabelNrVieti.setText("3");
                        juc.setScor(0);
                        jLabel3.setText("0");
                    }

                }
        
    
    public void setariInitiale(){
        jLabelCuvant1.setText("");
            jLabelCuvant2.setText("");
            jLabelCuvant3.setText("");
            jLabelCuvant4.setText("");
            jLabelCuvant5.setText("");
            jLabelCuvant6.setText("");
            jLabelCuvant7.setText("");
            jLabelCuvant8.setText("");
            jLabelCuvant9.setText("");
            jLabelCuvant10.setText("");
            jLabelCuvant11.setText("");
            jLabelCuvant12.setText("");
            jLabelCuvant13.setText("");
            jLabelCuvant14.setText("");
            jLabelCuvant15.setText("");
            jLabelCuvant1.setVisible(false);
            jLabelCuvant2.setVisible(false);
            jLabelCuvant3.setVisible(false);
            jLabelCuvant4.setVisible(false);
            jLabelCuvant5.setVisible(false);
            jLabelCuvant6.setVisible(false);
            jLabelCuvant7.setVisible(false);
            jLabelCuvant8.setVisible(false);
            jLabelCuvant9.setVisible(false);
            jLabelCuvant10.setVisible(false);
            jLabelCuvant11.setVisible(false);
            jLabelCuvant12.setVisible(false);
            jLabelCuvant13.setVisible(false);
            jLabelCuvant14.setVisible(false);
            jLabelCuvant15.setVisible(false);
            jButtonQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonW.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED)); 
            jButtonE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonJ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonZ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
            jButtonQ.setEnabled(true);
            jButtonW.setEnabled(true);
            jButtonE.setEnabled(true);
            jButtonR.setEnabled(true);
            jButtonT.setEnabled(true);
            jButtonY.setEnabled(true);
            jButtonU.setEnabled(true);
            jButtonI.setEnabled(true);
            jButtonO.setEnabled(true);
            jButtonP.setEnabled(true);
            jButtonA.setEnabled(true);
            jButtonS.setEnabled(true);
            jButtonD.setEnabled(true);
            jButtonF.setEnabled(true);
            jButtonG.setEnabled(true);
            jButtonH.setEnabled(true);
            jButtonJ.setEnabled(true);
            jButtonK.setEnabled(true);
            jButtonL.setEnabled(true);
            jButtonZ.setEnabled(true);
            jButtonX.setEnabled(true);
            jButtonC.setEnabled(true);
            jButtonV.setEnabled(true);
            jButtonB.setEnabled(true);
            jButtonN.setEnabled(true);
            jButtonM.setEnabled(true);
            juc.setGreseli(0);
            cuv.setLitereC();
            jLabelImagini.setIcon(new ImageIcon(System.getProperty("user.dir")+"\\src\\H0.png"));
    }
    public void UpdateClasament(){
        jLabelNumeLoc1.setText("");
        jLabelScorLoc1.setText("");
        jLabelNumeLoc2.setText("");
        jLabelScorLoc2.setText("");
        jLabelNumeLoc3.setText("");
        jLabelScorLoc3.setText("");
        jLabelNumeLoc4.setText("");
        jLabelScorLoc4.setText("");
        jLabelNumeLoc5.setText("");
        jLabelScorLoc5.setText("");
        
        jLabelNumeLoc1.setText(rec.getNume1());
        jLabelScorLoc1.setText(String.valueOf(rec.getScor1()));
        jLabelNumeLoc2.setText(rec.getNume2());
        jLabelScorLoc2.setText(String.valueOf(rec.getScor2()));
        jLabelNumeLoc3.setText(rec.getNume3());
        jLabelScorLoc3.setText(String.valueOf(rec.getScor3()));
        jLabelNumeLoc4.setText(rec.getNume4());
        jLabelScorLoc4.setText(String.valueOf(rec.getScor4()));
        jLabelNumeLoc5.setText(rec.getNume5());
        jLabelScorLoc5.setText(String.valueOf(rec.getScor5()));
    }
    Jucator juc = new Jucator();
    Cuvant cuv = new Cuvant();
    Recorduri rec = new Recorduri();
    int index;
    String cuvant;
    String copie;
    public Interfata2() {
        
        initComponents();
        jPanelCardLayout.add(jPanelMeniu,"Card Meniu");
        jPanelCardLayout.add(jPanelJoc,"Card Joc");
        jPanelCardLayout.add(jPanelNivel,"Card Nivel");
        jPanelCardLayout.add(jPanelRecorduri,"Card Recorduri");
        getContentPane().add(jPanelCardLayout);
        jLabelCuvant1.setVisible(false);
        jLabelCuvant2.setVisible(false);
        jLabelCuvant3.setVisible(false);
        jLabelCuvant4.setVisible(false);
        jLabelCuvant5.setVisible(false);
        jLabelCuvant6.setVisible(false);
        jLabelCuvant7.setVisible(false);
        jLabelCuvant8.setVisible(false);
        jLabelCuvant9.setVisible(false);
        jLabelCuvant10.setVisible(false);
        jLabelCuvant11.setVisible(false);
        jLabelCuvant12.setVisible(false);
        jLabelCuvant13.setVisible(false);
        jLabelCuvant14.setVisible(false);
        jLabelCuvant15.setVisible(false);
        

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jOptionPaneInapoiJoc = new javax.swing.JOptionPane();
        jOptionPaneSalvare = new javax.swing.JOptionPane();
        jOptionPaneInregistrare = new javax.swing.JOptionPane();
        jOptionPaneIntrebareNivel = new javax.swing.JOptionPane();
        jPanelCardLayout = new javax.swing.JPanel();
        jPanelMeniu = new javax.swing.JPanel();
        jLabelSpanzuratoar1 = new javax.swing.JLabel();
        jButtonIesire1 = new javax.swing.JButton();
        jButtonStart1 = new javax.swing.JButton();
        jButtonRecorduri1 = new javax.swing.JButton();
        jPanelJoc = new javax.swing.JPanel();
        jPanelCuvant = new javax.swing.JPanel();
        jLabelCuvant1 = new javax.swing.JLabel();
        jLabelCuvant4 = new javax.swing.JLabel();
        jLabelCuvant3 = new javax.swing.JLabel();
        jLabelCuvant2 = new javax.swing.JLabel();
        jLabelCuvant9 = new javax.swing.JLabel();
        jLabelCuvant7 = new javax.swing.JLabel();
        jLabelCuvant8 = new javax.swing.JLabel();
        jLabelCuvant5 = new javax.swing.JLabel();
        jLabelCuvant6 = new javax.swing.JLabel();
        jLabelCuvant10 = new javax.swing.JLabel();
        jLabelCuvant13 = new javax.swing.JLabel();
        jLabelCuvant12 = new javax.swing.JLabel();
        jLabelCuvant11 = new javax.swing.JLabel();
        jLabelCuvant15 = new javax.swing.JLabel();
        jLabelCuvant14 = new javax.swing.JLabel();
        jPanelTastatura = new javax.swing.JPanel();
        jButtonQ = new javax.swing.JButton();
        jButtonW = new javax.swing.JButton();
        jButtonE = new javax.swing.JButton();
        jButtonR = new javax.swing.JButton();
        jButtonT = new javax.swing.JButton();
        jButtonY = new javax.swing.JButton();
        jButtonO = new javax.swing.JButton();
        jButtonP = new javax.swing.JButton();
        jButtonU = new javax.swing.JButton();
        jButtonI = new javax.swing.JButton();
        jButtonH = new javax.swing.JButton();
        jButtonG = new javax.swing.JButton();
        jButtonF = new javax.swing.JButton();
        jButtonD = new javax.swing.JButton();
        jButtonS = new javax.swing.JButton();
        jButtonX = new javax.swing.JButton();
        jButtonL = new javax.swing.JButton();
        jButtonK = new javax.swing.JButton();
        jButtonJ = new javax.swing.JButton();
        jButtonN = new javax.swing.JButton();
        jButtonB = new javax.swing.JButton();
        jButtonV = new javax.swing.JButton();
        jButtonZ = new javax.swing.JButton();
        jButtonA = new javax.swing.JButton();
        jButtonC = new javax.swing.JButton();
        jButtonM = new javax.swing.JButton();
        jLabelImagini = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButtonJocInapoi = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabelNrVieti = new javax.swing.JLabel();
        jPanelNivel = new javax.swing.JPanel();
        jLabelSpanzuratoare1 = new javax.swing.JLabel();
        jButtonGreu = new javax.swing.JButton();
        jButtonUsor = new javax.swing.JButton();
        jButtonMediu = new javax.swing.JButton();
        jButtonNivelInapoi = new javax.swing.JButton();
        jPanelRecorduri = new javax.swing.JPanel();
        jLabelRecorduri = new javax.swing.JLabel();
        jLabelLoc1 = new javax.swing.JLabel();
        jLabelLoc2 = new javax.swing.JLabel();
        jLabelLoc4 = new javax.swing.JLabel();
        jLabelLoc3 = new javax.swing.JLabel();
        jLabelLoc5 = new javax.swing.JLabel();
        jLabelScorLoc1 = new javax.swing.JLabel();
        jLabelNumeLoc3 = new javax.swing.JLabel();
        jLabelNumeLoc4 = new javax.swing.JLabel();
        jLabelNumeLoc5 = new javax.swing.JLabel();
        jLabelNumeLoc1 = new javax.swing.JLabel();
        jLabelScorLoc3 = new javax.swing.JLabel();
        jLabelScorLoc2 = new javax.swing.JLabel();
        jLabelNumeLoc2 = new javax.swing.JLabel();
        jLabelScorLoc4 = new javax.swing.JLabel();
        jLabelScorLoc5 = new javax.swing.JLabel();
        jButtonRecorduriInapoi = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Spanzuratoarea");
        setMaximumSize(new java.awt.Dimension(787, 345));
        setMinimumSize(new java.awt.Dimension(787, 345));
        setName("Interfata"); // NOI18N
        setResizable(false);
        setSize(new java.awt.Dimension(787, 345));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanelCardLayout.setLayout(new java.awt.CardLayout());

        jPanelMeniu.setMaximumSize(new java.awt.Dimension(787, 345));
        jPanelMeniu.setMinimumSize(new java.awt.Dimension(787, 345));

        jLabelSpanzuratoar1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelSpanzuratoar1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSpanzuratoar1.setText("Spanzuratoarea");

        jButtonIesire1.setText("Iesire");
        jButtonIesire1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIesire1ActionPerformed(evt);
            }
        });

        jButtonStart1.setText("Start");
        jButtonStart1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStart1ActionPerformed(evt);
            }
        });

        jButtonRecorduri1.setText("Recorduri");
        jButtonRecorduri1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecorduri1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelMeniuLayout = new javax.swing.GroupLayout(jPanelMeniu);
        jPanelMeniu.setLayout(jPanelMeniuLayout);
        jPanelMeniuLayout.setHorizontalGroup(
            jPanelMeniuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeniuLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(jPanelMeniuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeniuLayout.createSequentialGroup()
                        .addGroup(jPanelMeniuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonIesire1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRecorduri1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelMeniuLayout.createSequentialGroup()
                        .addComponent(jLabelSpanzuratoar1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))))
        );
        jPanelMeniuLayout.setVerticalGroup(
            jPanelMeniuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelMeniuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSpanzuratoar1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonStart1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonRecorduri1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonIesire1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(77, Short.MAX_VALUE))
        );

        jPanelCardLayout.add(jPanelMeniu, "card2");

        jPanelJoc.setMaximumSize(new java.awt.Dimension(787, 345));
        jPanelJoc.setMinimumSize(new java.awt.Dimension(787, 345));
        jPanelJoc.setPreferredSize(new java.awt.Dimension(787, 345));

        jLabelCuvant1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant9.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant7.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant10.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant13.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant13.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant12.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant15.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabelCuvant14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelCuvant14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelCuvant14.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanelCuvantLayout = new javax.swing.GroupLayout(jPanelCuvant);
        jPanelCuvant.setLayout(jPanelCuvantLayout);
        jPanelCuvantLayout.setHorizontalGroup(
            jPanelCuvantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuvantLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabelCuvant1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelCuvant15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanelCuvantLayout.setVerticalGroup(
            jPanelCuvantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCuvantLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addGroup(jPanelCuvantLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCuvant15, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant3, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant4, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant5, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant6, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant7, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant8, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant9, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant10, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant11, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant12, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant13, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelCuvant14, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jButtonQ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonQ.setText("Q");
        jButtonQ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonQ.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonQ.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonQ.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonQ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonQActionPerformed(evt);
            }
        });

        jButtonW.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonW.setText("W");
        jButtonW.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonW.setMaximumSize(new java.awt.Dimension(41, 42));
        jButtonW.setMinimumSize(new java.awt.Dimension(41, 42));
        jButtonW.setPreferredSize(new java.awt.Dimension(41, 42));
        jButtonW.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWActionPerformed(evt);
            }
        });

        jButtonE.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonE.setText("E");
        jButtonE.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonE.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonE.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonE.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEActionPerformed(evt);
            }
        });

        jButtonR.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonR.setText("R");
        jButtonR.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonR.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonR.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonR.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRActionPerformed(evt);
            }
        });

        jButtonT.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonT.setText("T");
        jButtonT.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonT.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonT.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonT.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTActionPerformed(evt);
            }
        });

        jButtonY.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonY.setText("Y");
        jButtonY.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonY.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonY.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonY.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonYActionPerformed(evt);
            }
        });

        jButtonO.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonO.setText("O");
        jButtonO.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonO.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonO.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonO.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonO.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOActionPerformed(evt);
            }
        });

        jButtonP.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonP.setText("P");
        jButtonP.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonP.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonP.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonP.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPActionPerformed(evt);
            }
        });

        jButtonU.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonU.setText("U");
        jButtonU.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonU.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonU.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonU.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUActionPerformed(evt);
            }
        });

        jButtonI.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonI.setText("I");
        jButtonI.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonI.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonI.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonI.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIActionPerformed(evt);
            }
        });

        jButtonH.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonH.setText("H");
        jButtonH.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonH.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonH.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonH.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHActionPerformed(evt);
            }
        });

        jButtonG.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonG.setText("G");
        jButtonG.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonG.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonG.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonG.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGActionPerformed(evt);
            }
        });

        jButtonF.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonF.setText("F");
        jButtonF.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonF.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonF.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonF.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFActionPerformed(evt);
            }
        });

        jButtonD.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonD.setText("D");
        jButtonD.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonD.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonD.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonD.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDActionPerformed(evt);
            }
        });

        jButtonS.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonS.setText("S");
        jButtonS.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonS.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonS.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonS.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSActionPerformed(evt);
            }
        });

        jButtonX.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonX.setText("X");
        jButtonX.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonX.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonX.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonX.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonXActionPerformed(evt);
            }
        });

        jButtonL.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonL.setText("L");
        jButtonL.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonL.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonL.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonL.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLActionPerformed(evt);
            }
        });

        jButtonK.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonK.setText("K");
        jButtonK.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonK.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonK.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonK.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonK.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKActionPerformed(evt);
            }
        });

        jButtonJ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonJ.setText("J");
        jButtonJ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonJ.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonJ.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonJ.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonJ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJActionPerformed(evt);
            }
        });

        jButtonN.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonN.setText("N");
        jButtonN.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonN.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonN.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonN.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNActionPerformed(evt);
            }
        });

        jButtonB.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonB.setText("B");
        jButtonB.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonB.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonB.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonB.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBActionPerformed(evt);
            }
        });

        jButtonV.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonV.setText("V");
        jButtonV.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonV.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonV.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonV.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonVActionPerformed(evt);
            }
        });

        jButtonZ.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonZ.setText("Z");
        jButtonZ.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonZ.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonZ.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonZ.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonZ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonZActionPerformed(evt);
            }
        });

        jButtonA.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonA.setText("A");
        jButtonA.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonA.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonA.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonA.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAActionPerformed(evt);
            }
        });

        jButtonC.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonC.setText("C");
        jButtonC.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonC.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonC.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonC.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCActionPerformed(evt);
            }
        });

        jButtonM.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jButtonM.setText("M");
        jButtonM.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButtonM.setMaximumSize(new java.awt.Dimension(18, 33));
        jButtonM.setMinimumSize(new java.awt.Dimension(18, 33));
        jButtonM.setPreferredSize(new java.awt.Dimension(18, 33));
        jButtonM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTastaturaLayout = new javax.swing.GroupLayout(jPanelTastatura);
        jPanelTastatura.setLayout(jPanelTastaturaLayout);
        jPanelTastaturaLayout.setHorizontalGroup(
            jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTastaturaLayout.createSequentialGroup()
                .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanelTastaturaLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTastaturaLayout.createSequentialGroup()
                        .addComponent(jButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelTastaturaLayout.createSequentialGroup()
                        .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanelTastaturaLayout.setVerticalGroup(
            jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTastaturaLayout.createSequentialGroup()
                .addGroup(jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonQ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonE, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonR, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonT, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonY, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonU, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonI, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonO, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButtonP, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jButtonW, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonS, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonD, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonF, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonG, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonH, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonJ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonK, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonL, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonA, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanelTastaturaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonZ, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonX, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonC, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonV, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonB, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonN, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonM, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jLabelImagini.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelImagini.setIcon(new javax.swing.ImageIcon(getClass().getResource("/H0.png"))); // NOI18N

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Numar de vieti :");

        jButtonJocInapoi.setText("Inapoi");
        jButtonJocInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonJocInapoiActionPerformed(evt);
            }
        });

        jLabel2.setText("Scor:");

        jLabel3.setText("0");

        jLabelNrVieti.setText("3");

        javax.swing.GroupLayout jPanelJocLayout = new javax.swing.GroupLayout(jPanelJoc);
        jPanelJoc.setLayout(jPanelJocLayout);
        jPanelJocLayout.setHorizontalGroup(
            jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelJocLayout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabelNrVieti, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(139, 139, 139))
            .addGroup(jPanelJocLayout.createSequentialGroup()
                .addGroup(jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelJocLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanelCuvant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelJocLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(jPanelTastatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanelJocLayout.createSequentialGroup()
                                .addGap(198, 198, 198)
                                .addComponent(jButtonJocInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelJocLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabelImagini, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(4, 4, 4)))))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanelJocLayout.setVerticalGroup(
            jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelJocLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addComponent(jLabelNrVieti, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelCuvant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelJocLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanelTastatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelJocLayout.createSequentialGroup()
                        .addComponent(jLabelImagini, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonJocInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))))
        );

        jPanelCardLayout.add(jPanelJoc, "card3");

        jPanelNivel.setMaximumSize(new java.awt.Dimension(787, 345));
        jPanelNivel.setMinimumSize(new java.awt.Dimension(787, 345));

        jLabelSpanzuratoare1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelSpanzuratoare1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelSpanzuratoare1.setText("Selectare nivel:");

        jButtonGreu.setText("Greu");
        jButtonGreu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGreuActionPerformed(evt);
            }
        });

        jButtonUsor.setText("Usor");
        jButtonUsor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUsorActionPerformed(evt);
            }
        });

        jButtonMediu.setText("Mediu");
        jButtonMediu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMediuActionPerformed(evt);
            }
        });

        jButtonNivelInapoi.setText("Inapoi");
        jButtonNivelInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNivelInapoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelNivelLayout = new javax.swing.GroupLayout(jPanelNivel);
        jPanelNivel.setLayout(jPanelNivelLayout);
        jPanelNivelLayout.setHorizontalGroup(
            jPanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNivelLayout.createSequentialGroup()
                .addContainerGap(202, Short.MAX_VALUE)
                .addGroup(jPanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNivelLayout.createSequentialGroup()
                        .addGroup(jPanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonMediu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonUsor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonGreu, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(335, 335, 335))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNivelLayout.createSequentialGroup()
                        .addComponent(jLabelSpanzuratoare1, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(195, 195, 195))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelNivelLayout.createSequentialGroup()
                        .addComponent(jButtonNivelInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))))
        );
        jPanelNivelLayout.setVerticalGroup(
            jPanelNivelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelNivelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelSpanzuratoare1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonUsor, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonMediu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButtonGreu, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonNivelInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jPanelCardLayout.add(jPanelNivel, "card4");

        jPanelRecorduri.setMaximumSize(new java.awt.Dimension(787, 345));
        jPanelRecorduri.setMinimumSize(new java.awt.Dimension(787, 345));
        jPanelRecorduri.setPreferredSize(new java.awt.Dimension(787, 345));

        jLabelRecorduri.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabelRecorduri.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelRecorduri.setText("Recorduri:");

        jLabelLoc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoc1.setText("1.");

        jLabelLoc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoc2.setText("2.");

        jLabelLoc4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoc4.setText("4.");

        jLabelLoc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoc3.setText("3.");

        jLabelLoc5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelLoc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelLoc5.setText("5.");

        jLabelScorLoc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScorLoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNumeLoc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeLoc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNumeLoc4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeLoc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNumeLoc5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeLoc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNumeLoc1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeLoc1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelScorLoc3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScorLoc3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelScorLoc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScorLoc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelNumeLoc2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelNumeLoc2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelScorLoc4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScorLoc4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabelScorLoc5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelScorLoc5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jButtonRecorduriInapoi.setText("Inapoi");
        jButtonRecorduriInapoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRecorduriInapoiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelRecorduriLayout = new javax.swing.GroupLayout(jPanelRecorduri);
        jPanelRecorduri.setLayout(jPanelRecorduriLayout);
        jPanelRecorduriLayout.setHorizontalGroup(
            jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                .addContainerGap(200, Short.MAX_VALUE)
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                        .addComponent(jLabelRecorduri, javax.swing.GroupLayout.PREFERRED_SIZE, 390, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorduriLayout.createSequentialGroup()
                        .addComponent(jLabelLoc5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNumeLoc5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelScorLoc5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorduriLayout.createSequentialGroup()
                        .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                                .addComponent(jLabelLoc1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNumeLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                                .addComponent(jLabelLoc2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabelNumeLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelScorLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelScorLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorduriLayout.createSequentialGroup()
                        .addComponent(jLabelLoc3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNumeLoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelScorLoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorduriLayout.createSequentialGroup()
                        .addComponent(jLabelLoc4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabelNumeLoc4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelScorLoc4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(jButtonRecorduriInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32))
        );
        jPanelRecorduriLayout.setVerticalGroup(
            jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelRecorduri, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScorLoc1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelScorLoc2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelNumeLoc2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeLoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScorLoc3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelLoc4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNumeLoc4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelScorLoc4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelRecorduriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                        .addComponent(jButtonRecorduriInapoi, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(20, 20, 20))
                    .addGroup(jPanelRecorduriLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanelRecorduriLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabelNumeLoc5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabelScorLoc5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelLoc5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        jPanelCardLayout.add(jPanelRecorduri, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelCardLayout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonUsorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUsorActionPerformed
      
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereUsor();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Usor");
        
        //cardLayout.next(jPanelCardLayout);
    }//GEN-LAST:event_jButtonUsorActionPerformed

    private void jButtonMediuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMediuActionPerformed

        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereMediu();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Mediu");
        //cardLayout.next(jPanelCardLayout);
    }//GEN-LAST:event_jButtonMediuActionPerformed

    private void jButtonGreuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGreuActionPerformed

        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Joc");
        int lungimeCuv=cuv.AlegereGreu();
        if(lungimeCuv==3){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            index=3;
        }
        else if(lungimeCuv==4){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            index=4;
        }
        else if(lungimeCuv==5){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            index=5;
        }
        else if(lungimeCuv==6){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            index=6;
        }
        else if(lungimeCuv==7){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            index=7;
        }
        else if(lungimeCuv==8){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            index=8;
        }
        else if(lungimeCuv==9){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            index=9;
        }
        else if(lungimeCuv==10){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            index=10;
        }
        else if(lungimeCuv==11){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            index=11;
        }
        else if(lungimeCuv==12){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            index=12;
        }
        else if(lungimeCuv==13){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            index=13;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            index=14;
        }
        else if(lungimeCuv==15){
            jLabelCuvant1.setVisible(true);
            jLabelCuvant2.setVisible(true);
            jLabelCuvant3.setVisible(true);
            jLabelCuvant4.setVisible(true);
            jLabelCuvant5.setVisible(true);
            jLabelCuvant6.setVisible(true);
            jLabelCuvant7.setVisible(true);
            jLabelCuvant8.setVisible(true);
            jLabelCuvant9.setVisible(true);
            jLabelCuvant10.setVisible(true);
            jLabelCuvant11.setVisible(true);
            jLabelCuvant12.setVisible(true);
            jLabelCuvant13.setVisible(true);
            jLabelCuvant14.setVisible(true);
            jLabelCuvant15.setVisible(true);
            index=15;
        }
        cuvant = cuv.getCuvant();
        juc.setNivel("Greu");
        //cardLayout.next(jPanelCardLayout);
    }//GEN-LAST:event_jButtonGreuActionPerformed

    private void jButtonIesire1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIesire1ActionPerformed

        SalvareLista(System.getProperty("user.dir")+"\\Salvare.bin");
        System.exit(0);
    }//GEN-LAST:event_jButtonIesire1ActionPerformed

    private void jButtonStart1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStart1ActionPerformed
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Nivel");
    }//GEN-LAST:event_jButtonStart1ActionPerformed

    private void jButtonRecorduri1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecorduri1ActionPerformed
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Recorduri");
    }//GEN-LAST:event_jButtonRecorduri1ActionPerformed

    private void jButtonRecorduriInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRecorduriInapoiActionPerformed
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Meniu");
    }//GEN-LAST:event_jButtonRecorduriInapoiActionPerformed

    private void jButtonNivelInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNivelInapoiActionPerformed
        CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
        cardLayout.show(jPanelCardLayout, "Card Meniu");
    }//GEN-LAST:event_jButtonNivelInapoiActionPerformed

    private void jButtonJocInapoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJocInapoiActionPerformed
        int valoare = jOptionPaneInapoiJoc.showConfirmDialog(this, "Doriti sa parasiti jocul ?", "Mesaj", JOptionPane.YES_NO_OPTION);
        jOptionPaneInapoiJoc.setVisible(true);
        if (valoare == jOptionPaneInapoiJoc.YES_OPTION) {
            CardLayout cardLayout = (CardLayout) jPanelCardLayout.getLayout();
            cardLayout.show(jPanelCardLayout, "Card Meniu");
            setariInitiale();
            juc.setCuvinteCompletate();
            juc.setScor();
            jLabel3.setText("0");
            jLabelNrVieti.setText("3");
            juc.setNrVieti(3);
        }else if(valoare == jOptionPaneInapoiJoc.NO_OPTION){
            jOptionPaneInapoiJoc.setVisible(false);
        }
        
    }//GEN-LAST:event_jButtonJocInapoiActionPerformed

    private void jButtonFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonF.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonF.getText());
                    cuv.setLitereC(1);
                }
                jButtonF.setEnabled(false);
                jButtonF.setBorder(null);
                
            }
        }
        if(!cuv.getCuvant().contains(jButtonF.getText())){
            jButtonF.setEnabled(false);
            jButtonF.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();
                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
                }
            }

        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
        
    }//GEN-LAST:event_jButtonFActionPerformed

    private void jButtonQActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonQActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonQ.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonQ.getText());
                    cuv.setLitereC(1);
                }
            jButtonQ.setEnabled(false);
            jButtonQ.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonQ.getText())){
            jButtonQ.setEnabled(false);
            jButtonQ.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonQActionPerformed

    private void jButtonWActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonW.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonW.getText());
                    cuv.setLitereC(1);
                }
            jButtonW.setEnabled(false);
            jButtonW.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonW.getText())){
            jButtonW.setEnabled(false);
            jButtonW.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        } 
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonWActionPerformed

    private void jButtonEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonE.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonE.getText());
                    cuv.setLitereC(1);
                }
            jButtonE.setEnabled(false);
            jButtonE.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonE.getText())){
            jButtonE.setEnabled(false);
            jButtonE.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }  
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonEActionPerformed

    private void jButtonRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonR.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonR.getText());
                    cuv.setLitereC(1);
                }
            jButtonR.setEnabled(false);
            jButtonR.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonR.getText())){
            jButtonR.setEnabled(false);
            jButtonR.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonRActionPerformed

    private void jButtonTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonT.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonT.getText());
                    cuv.setLitereC(1);
                }
            jButtonT.setEnabled(false);
            jButtonT.setBorder(null);
           
            }
        }
        if(!cuv.getCuvant().contains(jButtonT.getText())){
            jButtonT.setEnabled(false);
            jButtonT.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonTActionPerformed

    private void jButtonYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonYActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonY.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonY.getText());
                    cuv.setLitereC(1);
                }
            jButtonY.setEnabled(false);
            jButtonY.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonY.getText())){
            jButtonY.setEnabled(false);
            jButtonY.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonYActionPerformed

    private void jButtonUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonU.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonU.getText());
                    cuv.setLitereC(1);
                }
            jButtonU.setEnabled(false);
            jButtonU.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonU.getText())){
            jButtonU.setEnabled(false);
            jButtonU.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonUActionPerformed

    private void jButtonIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonI.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonI.getText());
                    cuv.setLitereC(1);
                }
            jButtonI.setEnabled(false);
            jButtonI.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonI.getText())){
            jButtonI.setEnabled(false);
            jButtonI.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                   if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
       
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonIActionPerformed

    private void jButtonOActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonO.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonO.getText());
                    cuv.setLitereC(1);
                }
            jButtonO.setEnabled(false);
            jButtonO.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonO.getText())){
            jButtonO.setEnabled(false);
            jButtonO.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonOActionPerformed

    private void jButtonPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonP.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonP.getText());
                    cuv.setLitereC(1);
                }
            jButtonP.setEnabled(false);
            jButtonP.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonP.getText())){
            jButtonP.setEnabled(false);
            jButtonP.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonPActionPerformed

    private void jButtonAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonA.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonA.getText());
                    cuv.setLitereC(1);
                }
            jButtonA.setEnabled(false);
            jButtonA.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonA.getText())){
            jButtonA.setEnabled(false);
            jButtonA.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                   if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonAActionPerformed

    private void jButtonSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSActionPerformed
        for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonS.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonS.getText());
                    cuv.setLitereC(1);
                }
            jButtonS.setEnabled(false);
            jButtonS.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonS.getText())){
            jButtonS.setEnabled(false);
            jButtonS.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonSActionPerformed

    private void jButtonDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonD.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonD.getText());
                    cuv.setLitereC(1);
                }
            jButtonD.setEnabled(false);
            jButtonD.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonD.getText())){
            jButtonD.setEnabled(false);
            jButtonD.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonDActionPerformed

    private void jButtonGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonG.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonG.getText());
                    cuv.setLitereC(1);
                }
            jButtonG.setEnabled(false);
            jButtonG.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonG.getText())){
            jButtonG.setEnabled(false);
            jButtonG.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonGActionPerformed

    private void jButtonHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonH.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonH.getText());
                    cuv.setLitereC(1);
                }
            jButtonH.setEnabled(false);
            jButtonH.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonH.getText())){
            jButtonH.setEnabled(false);
            jButtonH.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonHActionPerformed

    private void jButtonJActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonJActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonJ.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonJ.getText());
                    cuv.setLitereC(1);
                }
            jButtonJ.setEnabled(false);
            jButtonJ.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonJ.getText())){
            jButtonJ.setEnabled(false);
            jButtonJ.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonJActionPerformed

    private void jButtonKActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonK.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonK.getText());
                    cuv.setLitereC(1);
                }
                jButtonK.setEnabled(false);
                jButtonK.setBorder(null);
                
            
            }
            
        }
        if(!cuv.getCuvant().contains(jButtonK.getText())){
            jButtonK.setEnabled(false);
            jButtonK.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                   if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
                }
            }
            
        }
        
         
          if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonKActionPerformed

    private void jButtonLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonL.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonL.getText());
                    cuv.setLitereC(1);
                }
            jButtonL.setEnabled(false);
            jButtonL.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonL.getText())){
            jButtonL.setEnabled(false);
            jButtonL.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonLActionPerformed

    private void jButtonZActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonZActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonZ.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonZ.getText());
                    cuv.setLitereC(1);
                }
            jButtonZ.setEnabled(false);
            jButtonZ.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonZ.getText())){
            jButtonZ.setEnabled(false);
            jButtonZ.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonZActionPerformed

    private void jButtonXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonXActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonX.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonX.getText());
                    cuv.setLitereC(1);
                }
            jButtonX.setEnabled(false);
            jButtonX.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonX.getText())){
            jButtonX.setEnabled(false);
            jButtonX.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonXActionPerformed

    private void jButtonCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonC.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonC.getText());
                    cuv.setLitereC(1);
                }
            jButtonC.setEnabled(false);
            jButtonC.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonC.getText())){
            jButtonC.setEnabled(false);
            jButtonC.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                   SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonCActionPerformed

    private void jButtonVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonV.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonV.getText());
                    cuv.setLitereC(1);
                }
            jButtonV.setEnabled(false);
            jButtonV.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonV.getText())){
            jButtonV.setEnabled(false);
            jButtonV.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonVActionPerformed

    private void jButtonBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonB.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonB.getText());
                    cuv.setLitereC(1);
                }
            jButtonB.setEnabled(false);
            jButtonB.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonB.getText())){
            jButtonB.setEnabled(false);
            jButtonB.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                   SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonBActionPerformed

    private void jButtonNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonN.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonN.getText());
                    cuv.setLitereC(1);
                }
            jButtonN.setEnabled(false);
            jButtonN.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonN.getText())){
            jButtonN.setEnabled(false);
            jButtonN.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                   SetariNrGreseli();
                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
    }//GEN-LAST:event_jButtonNActionPerformed

    private void jButtonMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMActionPerformed
          for(int i=0;i<index;i++){
            if(cuv.getCuvant().charAt(i)==jButtonM.getText().charAt(0)){
                if(i==0){
                    jLabelCuvant1.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==1){
                    jLabelCuvant2.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==2){
                    jLabelCuvant3.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==3){
                    jLabelCuvant4.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==4){
                    jLabelCuvant5.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==5){
                    jLabelCuvant6.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==6){
                    jLabelCuvant7.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==7){
                    jLabelCuvant8.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==8){
                    jLabelCuvant9.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==9){
                    jLabelCuvant10.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==10){
                    jLabelCuvant11.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==11){
                    jLabelCuvant12.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==12){
                    jLabelCuvant13.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==13){
                    jLabelCuvant14.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
                if(i==14){
                    jLabelCuvant15.setText(jButtonM.getText());
                    cuv.setLitereC(1);
                }
            jButtonM.setEnabled(false);
            jButtonM.setBorder(null);
            
            }
        }
        if(!cuv.getCuvant().contains(jButtonM.getText())){
            jButtonM.setEnabled(false);
            jButtonM.setBorder(null);
            juc.setGreseli(juc.getGreseli()+1);
            UpdateImagini();
            
            if(juc.getGreseli()==6){
                cuv.setLitereC();
                if(juc.getNrVieti()==1){
                    SetariNrGreseli();

                }
                else{
                    juc.setNrVieti(juc.getNrVieti()-1);
                    JOptionPane.showMessageDialog(
                        this,
                        "Ati pierdut o viata. Mai aveti insa inca "+juc.getNrVieti()+" vieti.",
                        "Ati pierdut o viata",
                        JOptionPane.ERROR_MESSAGE
                    );
                    int viata = juc.getNrVieti();
                    String cViata = String.valueOf(viata);
                    jLabelNrVieti.setText(cViata);
                    setariInitiale();

                    if(juc.getNivel().equals("Usor")){
                        ButonUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        ButonMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        ButonGreu();
                    }
            }
            }
            
        }
        if(cuv.getLitereC()==cuv.getCuvant().length()){
                    if(juc.getNivel().equals("Usor")){
                        juc.setScorUsor();
                    }
                    else if(juc.getNivel().equals("Mediu")){
                        juc.setScorMediu();
                    }
                    else if(juc.getNivel().equals("Greu")){
                        juc.setScorGreu();
                    }
                    String scor = String.valueOf(juc.getScor());
                    jLabel3.setText(scor);
                    juc.setCuvinteCompletate(1);
                    setariInitiale();
                    if(juc.getCuvinteCompletate()%5==0 && juc.getCuvinteCompletate()<15 && (!juc.getNivel().equals("Greu"))){
                        int valoare = jOptionPaneIntrebareNivel.showConfirmDialog(this, "Ati reusit sa completati 5 cuvinte la acest nivel.Nu doriti sa treceti la un nivel superior?", "Intrebare", JOptionPane.YES_NO_OPTION);
                            jOptionPaneIntrebareNivel.setVisible(true);
                            if (valoare == jOptionPaneIntrebareNivel.YES_OPTION) {
                                if(juc.getNivel().equals("Usor")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }else if(valoare == jOptionPaneIntrebareNivel.NO_OPTION){
                                if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                            }
                    }else if(juc.getNivel().equals("Usor")){
                                    jButtonUsorActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Mediu")){
                                    jButtonMediuActionPerformed(evt);
                                }
                                else if(juc.getNivel().equals("Greu")){
                                    jButtonGreuActionPerformed(evt);
                                }
                    
                }
        
    }//GEN-LAST:event_jButtonMActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        SalvareLista(System.getProperty("user.dir")+"\\Salvare.bin");
        System.exit(0);
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            incarcareContacte(System.getProperty("user.dir")+"\\Salvare.bin");
        } catch (IOException ex) {
            Logger.getLogger(Interfata2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Interfata2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        JWindow window = new JWindow();
        window.getContentPane().add(
            new JLabel("", new ImageIcon(System.getProperty("user.dir")+"\\src\\poza1.png"), SwingConstants.CENTER));
        window.setBounds(275,40,300,300);
        window.setVisible(true);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
        }
        window.setVisible(false);
        
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfata2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfata2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonA;
    private javax.swing.JButton jButtonB;
    private javax.swing.JButton jButtonC;
    private javax.swing.JButton jButtonD;
    private javax.swing.JButton jButtonE;
    private javax.swing.JButton jButtonF;
    private javax.swing.JButton jButtonG;
    private javax.swing.JButton jButtonGreu;
    private javax.swing.JButton jButtonH;
    private javax.swing.JButton jButtonI;
    private javax.swing.JButton jButtonIesire1;
    private javax.swing.JButton jButtonJ;
    private javax.swing.JButton jButtonJocInapoi;
    private javax.swing.JButton jButtonK;
    private javax.swing.JButton jButtonL;
    private javax.swing.JButton jButtonM;
    private javax.swing.JButton jButtonMediu;
    private javax.swing.JButton jButtonN;
    private javax.swing.JButton jButtonNivelInapoi;
    private javax.swing.JButton jButtonO;
    private javax.swing.JButton jButtonP;
    private javax.swing.JButton jButtonQ;
    private javax.swing.JButton jButtonR;
    private javax.swing.JButton jButtonRecorduri1;
    private javax.swing.JButton jButtonRecorduriInapoi;
    private javax.swing.JButton jButtonS;
    private javax.swing.JButton jButtonStart1;
    private javax.swing.JButton jButtonT;
    private javax.swing.JButton jButtonU;
    private javax.swing.JButton jButtonUsor;
    private javax.swing.JButton jButtonV;
    private javax.swing.JButton jButtonW;
    private javax.swing.JButton jButtonX;
    private javax.swing.JButton jButtonY;
    private javax.swing.JButton jButtonZ;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabelCuvant1;
    private javax.swing.JLabel jLabelCuvant10;
    private javax.swing.JLabel jLabelCuvant11;
    private javax.swing.JLabel jLabelCuvant12;
    private javax.swing.JLabel jLabelCuvant13;
    private javax.swing.JLabel jLabelCuvant14;
    private javax.swing.JLabel jLabelCuvant15;
    private javax.swing.JLabel jLabelCuvant2;
    private javax.swing.JLabel jLabelCuvant3;
    private javax.swing.JLabel jLabelCuvant4;
    private javax.swing.JLabel jLabelCuvant5;
    private javax.swing.JLabel jLabelCuvant6;
    private javax.swing.JLabel jLabelCuvant7;
    private javax.swing.JLabel jLabelCuvant8;
    private javax.swing.JLabel jLabelCuvant9;
    private javax.swing.JLabel jLabelImagini;
    private javax.swing.JLabel jLabelLoc1;
    private javax.swing.JLabel jLabelLoc2;
    private javax.swing.JLabel jLabelLoc3;
    private javax.swing.JLabel jLabelLoc4;
    private javax.swing.JLabel jLabelLoc5;
    private javax.swing.JLabel jLabelNrVieti;
    private javax.swing.JLabel jLabelNumeLoc1;
    private javax.swing.JLabel jLabelNumeLoc2;
    private javax.swing.JLabel jLabelNumeLoc3;
    private javax.swing.JLabel jLabelNumeLoc4;
    private javax.swing.JLabel jLabelNumeLoc5;
    private javax.swing.JLabel jLabelRecorduri;
    private javax.swing.JLabel jLabelScorLoc1;
    private javax.swing.JLabel jLabelScorLoc2;
    private javax.swing.JLabel jLabelScorLoc3;
    private javax.swing.JLabel jLabelScorLoc4;
    private javax.swing.JLabel jLabelScorLoc5;
    private javax.swing.JLabel jLabelSpanzuratoar1;
    private javax.swing.JLabel jLabelSpanzuratoare1;
    private javax.swing.JOptionPane jOptionPaneInapoiJoc;
    private javax.swing.JOptionPane jOptionPaneInregistrare;
    private javax.swing.JOptionPane jOptionPaneIntrebareNivel;
    private javax.swing.JOptionPane jOptionPaneSalvare;
    private javax.swing.JPanel jPanelCardLayout;
    private javax.swing.JPanel jPanelCuvant;
    private javax.swing.JPanel jPanelJoc;
    private javax.swing.JPanel jPanelMeniu;
    private javax.swing.JPanel jPanelNivel;
    private javax.swing.JPanel jPanelRecorduri;
    private javax.swing.JPanel jPanelTastatura;
    // End of variables declaration//GEN-END:variables
}
