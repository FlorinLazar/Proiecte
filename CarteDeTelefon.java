/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proiectfinaljava;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Florin
 */
public class CarteDeTelefon extends AbstractTableModel implements Serializable {
    private String[] columnNames = { "Nume", "Prenume", "Cnp","Nr Tel" };
    private List<Abonat> colectie = new ArrayList<>();
    private int index;
    
    public CarteDeTelefon(){}
    public CarteDeTelefon(List l){
        colectie.addAll(l);
    }
    //serializare
    public void SalvareLista(String s){
        try{
            FileOutputStream fos = new FileOutputStream(s);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(colectie);
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
        List<Abonat> recoveredContacts = (ArrayList<Abonat>) input.readObject();
        colectie = recoveredContacts;
        fireTableDataChanged();
        }
    }

    public void addAbonat(Abonat a){
        colectie.add(a);
        fireTableDataChanged();
    }
    
    public void addAbonatList(List l){
        colectie.addAll(l);
        fireTableDataChanged();
    }
    
    public void SortareNumeAscendent(){
        Collections.sort(colectie,Abonat.NumeAlfabeticCrescator);
        fireTableDataChanged();
    }
    
    public void SortareNumeDescendent(){
        Collections.sort(colectie,Abonat.NumeAlfabeticDescrescator);
        fireTableDataChanged();
    }
    
    public void SortarePrenumeAscendent(){
        Collections.sort(colectie,Abonat.PrenumeAlfabeticCrescator);
        fireTableDataChanged();
    }
    public void SortarePrenumeDescendent(){
        Collections.sort(colectie,Abonat.PrenumeAlfabeticDescrescator);
        fireTableDataChanged();
    }
    public void SortareCnpAscendent(){
        Collections.sort(colectie,Abonat.CNPCrescator);
        fireTableDataChanged();
    }
    public void SortareCnpDescendent(){
        Collections.sort(colectie,Abonat.CNPDescrescator);
        fireTableDataChanged();
    }
    public void SortareNumarAscendent(){
        Collections.sort(colectie,Abonat.NrTelCrescator);
        fireTableDataChanged();
    }
    public void SortareNumarDescendent(){
        Collections.sort(colectie,Abonat.NrTelDescrescator);
        fireTableDataChanged();
    }
    public Abonat getAbonatAt(int row){
        return (Abonat)colectie.get(row);
    }
    public Abonat removeAbonatAt(int row){
        Abonat a = (Abonat)colectie.remove(row);
        fireTableDataChanged();
        return a;
    }
    public void Adaugare(Abonat a){
        colectie.add(a);
    }
    public void Stergere(Abonat a){
        colectie.remove(a);
    }
    public void Stergere(int i){
        colectie.remove(i);
    }
    public void Modificare(int contor, String nume, String prenume, String cnp, String nrtel){
        if(!nume.equals("") && prenume.equals("") && cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(nume, colectie.get(contor).getPrenume(),colectie.get(contor).getCnp(),colectie.get(contor).getNumar());
            colectie.set(contor,abt);
        }else if(!prenume.equals("") && nume.equals("") && cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , prenume, colectie.get(contor).getCnp(), colectie.get(contor).getNumar());
            colectie.set(contor, abt);
            //fireTableDataChanged();
        }
        else if(nume.equals("") && prenume.equals("") && !cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , colectie.get(contor).getPrenume(), cnp, colectie.get(contor).getNumar());
            colectie.set(contor, abt);
            //fireTableDataChanged();
        }
        else if(nume.equals("") && prenume.equals("") && cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , colectie.get(contor).getPrenume(), colectie.get(contor).getCnp(), nrtel);
            colectie.set(contor, abt);
            //fireTableDataChanged();
        }
        else if(!nume.equals("") && !prenume.equals("") && cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(nume , prenume, colectie.get(contor).getCnp(), colectie.get(contor).getNumar());
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && prenume.equals("") && !cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(nume , colectie.get(contor).getPrenume(), cnp, colectie.get(contor).getNumar());
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && prenume.equals("") && cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(nume , colectie.get(contor).getPrenume(), colectie.get(contor).getCnp(), nrtel);
            colectie.set(contor, abt);
        }
        else if(nume.equals("") && !prenume.equals("") && !cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , prenume, cnp, colectie.get(contor).getNumar());
            colectie.set(contor, abt);
        }
        else if(nume.equals("") && !prenume.equals("") && cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , prenume, colectie.get(contor).getCnp(), nrtel);
            colectie.set(contor, abt);
        }
        else if(nume.equals("") && prenume.equals("") && !cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , colectie.get(contor).getPrenume(), cnp, nrtel);
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && !prenume.equals("") && !cnp.equals("") && nrtel.equals("")){
            Abonat abt = new Abonat(nume , prenume, cnp, colectie.get(contor).getNumar());
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && !prenume.equals("") && cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(nume , prenume, colectie.get(contor).getCnp(), nrtel);
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && prenume.equals("") && !cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(nume, colectie.get(contor).getPrenume(), cnp, nrtel);
            colectie.set(contor, abt);
        }
        else if(nume.equals("") && !prenume.equals("") && !cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(colectie.get(contor).getNume() , prenume, cnp, nrtel);
            colectie.set(contor, abt);
        }
        else if(!nume.equals("") && !prenume.equals("") && !cnp.equals("") && !nrtel.equals("")){
            Abonat abt = new Abonat(nume , prenume, cnp, nrtel);
            colectie.set(contor, abt);
        }
            
        
        fireTableDataChanged();
    }
    //cautare dupa toate cele 4 campuri introduse, apoi dupa 3, 2 si 1
    public int Cautare(String nume, String prenume, String cnp, String nrtel){
        for(int i=0;i<colectie.size();i++){
            if(colectie.get(i).getNume().equals(nume) && colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getCnp().equals(cnp) && colectie.get(i).getNumar().equals(nrtel)){
                index = colectie.indexOf(colectie.get(i));
                break;
            }else if((colectie.get(i).getNume().equals(nume) && colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getCnp().equals(cnp) && nrtel.equals("")) 
                      || (colectie.get(i).getNume().equals(nume) && colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getNumar().equals(nrtel) && cnp.equals(""))
                      || (colectie.get(i).getNume().equals(nume) && colectie.get(i).getCnp().equals(cnp) && colectie.get(i).getNumar().equals(nrtel) && prenume.equals(""))
                      || (colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getCnp().equals(cnp) && colectie.get(i).getNumar().equals(nrtel) && nume.equals(""))){
                
                      index=colectie.indexOf(colectie.get(i));
                      break;
            }else if((colectie.get(i).getNume().equals(nume) && colectie.get(i).getPrenume().equals(prenume) && cnp.equals("") && nrtel.equals(""))
                      || (colectie.get(i).getNume().equals(nume) && colectie.get(i).getCnp().equals(cnp) && prenume.equals("") && nrtel.equals("") )
                      || (colectie.get(i).getNume().equals(nume) && colectie.get(i).getNumar().equals(nrtel) && prenume.equals("") && cnp.equals("") )
                      || (colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getCnp().equals(cnp) && nume.equals("") && nrtel.equals(""))
                      || (colectie.get(i).getPrenume().equals(prenume) && colectie.get(i).getNumar().equals(nrtel) && nume.equals("") && cnp.equals(""))
                      || (colectie.get(i).getCnp().equals(cnp) && colectie.get(i).getNumar().equals(nrtel) && nume.equals("") && prenume.equals(""))){
                      
                      index = colectie.indexOf(colectie.get(i));
                      break;
            }else if((colectie.get(i).getNume().equals(nume) && prenume.equals("") && cnp.equals("") && nrtel.equals(""))
                      ||(colectie.get(i).getPrenume().equals(prenume) && nume.equals("") && cnp.equals("") && nrtel.equals(""))
                      ||(colectie.get(i).getCnp().equals(cnp) && nume.equals("") && prenume.equals("") && nrtel.equals(""))
                      ||(colectie.get(i).getNumar().equals(nrtel) && nume.equals("") && prenume.equals("") && cnp.equals(""))){
                
                      index = colectie.indexOf(colectie.get(i));
                      break;
                
            }else{
                index = -1;
                
            }
        }
        return index;
    }
    public List GetColectie(){
        return colectie;
    }

    @Override
    public int getRowCount() {
        return colectie.size();
    }

    @Override
    public int getColumnCount() {
       return columnNames.length;
    }
    
    public String getColumnName(int col){
        return columnNames[col];
    }

    @Override
    public String getValueAt(int row, int col) {

               Abonat object = colectie.get(row);

               switch (col) {
               case 0:
                    return object.getNume();
               case 1:
                    return object.getPrenume();
               case 2:
                    return object.getCnp();
               case 3:
                    return object.getNumar();
               default:
                   return "unknown";
               }
          }
}




