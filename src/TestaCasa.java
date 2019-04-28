public class TestaCasa {
    public static void main(String[] args){
        
        Casa a = new Casa();
        a.cor = "vemelha";
        a.porta1 = true;
        a.porta2 = false;
        a.porta3 = true;
        
        System.out.println("\nCor da casa: "+a.cor);
        System.out.println("Portas abertas: "+a.quantasPortasEstaoAbertas());
        
        a.pinta("Azul");
        System.out.println("\nCor da casa: "+a.cor);
        System.out.println("Portas abertas: "+a.quantasPortasEstaoAbertas());
        
        Casa b = new Casa();
        b.cor = "amarelo";
        b.porta1 = false;
        b.porta2 = false;
        b.porta3 = false;
        
        System.out.println("\nCor da casa: "+b.cor);
        System.out.println("Portas abertas: "+b.quantasPortasEstaoAbertas());
        
        b.pinta("verde escuro");
        System.out.println("\nCor da casa: "+b.cor);
        System.out.println("Portas abertas: "+b.quantasPortasEstaoAbertas());
    }
}
