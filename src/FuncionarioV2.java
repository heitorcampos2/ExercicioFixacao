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
    
    void mostra(){
        System.out.println("Sistema Gerenciador de Funcionários do Banco do Heitor\n ****************************************************");
        System.out.println("\nNome: "+nome+"\nRG: "+rg+"\nDepartamento: "departamento+"\nSalário: "+salario+"\nData de entrada: "+datadeentrada+"\nEstatus: "+ativo+"\n****************************************************");
    }
}
