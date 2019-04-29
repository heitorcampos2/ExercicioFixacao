public class Produto {
    
    String nome;
    double preco;
    
    void diminuir10(){
       preco = preco - (preco * 0.10);
       System.out.println("\n>>>> EVENTO: Desconto de 10%\n");       
    }
    
    void aumenta25(){
      preco = preco * 1.25;
      System.out.println("\n>>>> EVENTO: Aumento de 25%\n");
    }
    
}
