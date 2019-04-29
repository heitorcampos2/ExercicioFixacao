public class Produto {
    
    String nome;
    double preco;
    
    void diminuir10(double p){
        p = preco/10;
        preco = preco - p;
    }
    
    void aumenta25(double p){
        p =preco * 0.25;
        preco = preco + p;
    }
    
}
