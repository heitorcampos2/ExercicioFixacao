public class Porta {
    String cor;
    double dimensaoX;
    double dimensaoY;
    double dimensaoZ;
    boolean aberta;
    ////////////////////
    void abre(){
        aberta = true;
    }
    ////////////////////
    void fecha(){
        aberta = false;
    }
    ////////////////////
    void pinta(String t){
        cor = t;
    }
    ////////////////////
    boolean estaAberta(){
        if (aberta == true)
            System.out.println ("Porta aberta");
        else 
            System.out.println ("Porta fechada");
            return aberta;
    }
    ////////////////////
}
