public class TestaFuncionarioV4 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV4 f4 = new FuncionarioV4 ();
        f4.nome = "Jucélia Cordeiro Diniz";
        f4.rg = "19.859.547";
        f4.departamento = "Gerenciamento de Vendas";
        f4.salario = 4900.00;
        f4.ativo = true;           
        
        Data df4 = new Data();
        df4.dia = 15;
        df4.mes = 02;
        df4.ano = 2018;  
        /////////////////////////
        FuncionarioV4 f5 = new FuncionarioV4 ();
        f5.nome = "Jucélia Cordeiro Diniz";
        f5.rg = "19.859.547";
        f5.departamento = "Gerenciamento de Vendas";
        f5.salario = 4900.00;
        f5.ativo = true;
        
        Data df5 = new Data();
        df5.dia = 15;
        df5.mes = 02;
        df5.ano = 2018; 
        /////////////////////////
        f4.mostra();
        System.out.println("Data de entrada: "+df4.dia+"/"+df4.mes+"/"+df4.ano);
        
        f5.mostra();
        System.out.println("Data de entrada: "+df5.dia+"/"+df5.mes+"/"+df5.ano);
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
         f4.equals(f5);
     /*   if(f4.nome.equals(f5.nome)){
            if(f4.rg.equals(f5.rg)){
                    System.out.println("\nALERTA: Funcionário(a) " + f4.nome + " já cadastrado(a) no sistema[IGUAL]\n");
            }
        }*/
        ///////////////////////////////////////////////////////////////////////////////////////////////////////
    }
}