//sistema de gerenciamento de funcionarios do banco do Heitor
public class FuncionarioV2 {
    double salario;
    String nome;
    String departamento;
    String dataDeEntrada;
    String rg;
    boolean ativo = true; //cada funcioanrio cadastrado deve inicar como ativo
    String mostra;
    
    //    aumento q o funcionario irá receber
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
    
    void mostrar(){
      //  System.out.println(nome,rg,departamento,salario,dataDeEntrada,ativo);
       System.out.println("Sistema Gerenciador de Funcionários do Banco do Heitor\n ****************************************************\nNome: "+
               nome+"\nRG: "+
               rg+"\nDepartamento: "+
               departamento+"\nSalário: R$"+
               salario+"\nData de entrada: "+
               dataDeEntrada+"\nEstatus: "+
               ativo+"\n****************************************************");
    }
}