public class TestaFuncionarioV4 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV4 f4 = new FuncionarioV4 ();
        f4.nome = "Ediléia Cardoso da Silva";
        f4.rg = "16.859.547";
        f4.departamento = "Gerenciamento de Vendas";
        f4.salario = 4900.00;
        f4.ativo = true;
                
       
        f4.mostrar();/*imprime os atributos*/
        /////////////////////////
        FuncionarioV4 f5 = new FuncionarioV4 ();
        f5.nome = "Ediléia Cardoso da Silva";
        f5.rg = "16.859.547";
        f5.departamento = "Gerenciamento de Vendas";
        f5.salario = 4900.00;
        f5.ativo = true;
                
       
        f5.mostrar();/*imprime os atributos*/
        /////////////////////////
        
        Data d = new Data();
        d.dia = 15;
        d.mes = 02;
        d.ano = 2018;
        
        if(f4 equals(f5)){
        System.out.println("Iguais");
        }
        
    }
}