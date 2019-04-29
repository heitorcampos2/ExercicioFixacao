public class MainProduto {
    public static void main(String[] args){
        Produto p1 = new Produto();
        p1.nome = "Monster Energy - ASSAULT";
        p1.preco = 10;
        
        System.out.println("Produto: "+p1.nome);
        System.out.println("Preço: "+p1.preco);
        
       p1.aumenta25();
        System.out.println("Produto: "+p1.nome);
        System.out.println("Preço: "+p1.preco+"\n");
////////////////////////////////////////////////////////////////
        Produto p2 = new Produto();
        p2.nome = "Monster Energy - ULTRA";
        p2.preco = 10;
        
        System.out.println("Produto: "+p2.nome);
        System.out.println("Preço: "+p2.preco);      
        
        p2.diminuir10();
        System.out.println("Produto: "+p2.nome);
        System.out.println("Preço: "+p2.preco);       
        
        
    }
}
