//sistema de gerenciamento de funcionarios do banco do Heitor
public class FuncionarioV2 {
    double salario;
    String nome;
    String departamento;
    String datadeentrada;
    String rg;
    boolean ativo = true; //cada funcioanrio cadastrado deve inicar como ativo
    
    //    aumento q o funcionario irá receber
    void bonifica(double aumento){
        salario = salario + (salario * aumento);
        
    }
    void demite(){
        ativo = false;
    }    
    
    void mostrar(){
        system.out.println();
    }
}
