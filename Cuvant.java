import java.util.Random;
public class Cuvant {
    private String cuvant;
    private int litereCompletate=0;
    String [] cuvinteUsoare = {"SILVER","MATERIAL","ABOUT","AFRAID","MEMORY","SHORT","EQUAL",
                               "SMILE","BABY","CHILD","FOOD","BLOOD","GENERAL","PAPER","STRONG",
                               "PROFIT","RESPECT","CREDIT","CUP","MAN","WOMAN"};
    String [] cuvinteMedii = {"ADVERTISEMENT","ADJUSTMENT","ADDITION","BEAUTIFUL","STATEMENT",
                              "OBSERVATION","SUGGESTION","THOUGHT","THREAD","THUNDER","GOVERNMENT",
                              "STOMACH","STOCKING","COMMITTEE","CHEMICAL","KNOWLEDGE",
                              "DISTRIBUTION"};
    String [] cuvinteGrele = {"INSATIABLE","METICULOUS","OBSEQUITOUS","OBLIVIOUS","PREDILECTION","REPUDIATE",
                               "SALIENT","TRUCULENT","VENERABLE","DEMURE","ABNEGATION","ABROGATE","ADVOCATE","ANTISEPTIC",
                               "DISAFFECTED","EMPIRICAL","PREPONDERANCE","QUIXOTIC","REQUISITION"};
    
    public int AlegereUsor(){
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(21);
        cuvant = cuvinteUsoare[randomInt];
        System.out.println(cuvant);
        return cuvinteUsoare[randomInt].length();
    }
    public int AlegereMediu(){
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(17);
        cuvant = cuvinteMedii[randomInt];
        System.out.println(cuvant);
        return cuvinteMedii[randomInt].length();
    }
    public int AlegereGreu(){
        Random randomGen = new Random();
        int randomInt = randomGen.nextInt(19);
        cuvant = cuvinteGrele[randomInt];
        System.out.println(cuvant);
        return cuvinteGrele[randomInt].length();
    }
    public String getCuvant(){
        return cuvant;
    }
    public int getLitereC(){
        return litereCompletate;
    }
    public void setLitereC(int i){
        litereCompletate=litereCompletate+i;
        System.out.println(litereCompletate);
    }
    public void setLitereC(){
        litereCompletate=0;
        System.out.println(litereCompletate);
    }
    
        
                              
}
