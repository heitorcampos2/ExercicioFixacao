//sistema de gerenciamento de funcionarios do banco do Heitor
public class FuncionarioV3 {
    double salario;
    String nome;
    String departamento;
    Data dataDeEntrada;
    String rg;
    boolean ativo = true; //cada funcioanrio cadastrado deve inicar como ativo
//  dataDeEntrada.mostrar();
    //    aumento q o funcionario irá receber
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
    
    void mostrar(){
        System.out.println("Sistema Gerenciador de Funcionários do Banco do Heitor\n ****************************************************\nNome: "+
               nome+"\nRG: "+
               rg+"\nDepartamento: "+
               departamento+"\nSalário: "+
               salario+"\nData de entrada: "+
               dataDeEntrada.dia+"/"+dataDeEntrada.mes+"/"+dataDeEntrada.ano+
               ativo+"\n****************************************************");
               
       
    }
    
}
