package Default;

/**
 *
 * @author Claudia
 */
public class Produs {
    
    private int cod;
    private double pret;
    private String nume;
    boolean esteBuc;
    
    
public Produs(int Ocod, double Opret, String Onume, boolean OesteBuc){
    cod = Ocod;
    pret = Opret;
    nume = Onume;
    esteBuc = OesteBuc;
}

public Produs(int Ocod,double Opret,boolean OesteBuc){
    this(Ocod, Opret, "No name", true);
}

        
public void setCod(int c){cod = c;}
public int getCod(){return cod;}

public void setPret(double p){pret = p;}
public double getPret() {return pret;}
        
public void setNume(String n) {nume = n;}
public String getNume(){return nume;}


}
