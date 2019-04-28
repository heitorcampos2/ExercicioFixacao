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
                
       
        f5.mostra();/*imprime os atributos*/
        /////////////////////////
        
        Data df4 = new Data();
        df4.dia = 15;
        df4.mes = 02;
        df4.ano = 2018;  
        
        Data df5 = new Data();
        df5.dia = 15;
        df5.mes = 02;
        df5.ano = 2018; 
        
        f4.mostra();
        System.out.println("Data de entrada: "+df4.dia+"/"+df4.mes+"/"+df4.ano);
        
        f5.mostra();
        System.out.println("Data de entrada: "+df5.dia+"/"+df5.mes+"/"+df5.ano);
        
        if(f4 equals(f5)){
        System.out.println("Iguais");
        }
        
    }
}