public class TestaPessoa {
    public static void main(String[] args){
        Pessoa p0 = new Pessoa();
        p0.nome = "Jonas Batista dos Salntos Insolente de Souza";
        p0.idade = 17;
        
        System.out.println("Nome: "+p0.nome+"\nIdade: "+p0.idade);
        
        p0.fazAniversario();
        
        System.out.println("Nome: "+p0.nome+"\nIdade: "+p0.idade);
        
        p0.fazAniversario();
        
        System.out.println("Nome: "+p0.nome+"\nIdade: "+p0.idade);
        
    }
}
