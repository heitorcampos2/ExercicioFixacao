//sistema de gerenciamento de funcionarios do banco do Heitor
public class FuncionarioV4 {
    double salario;
    String nome;
    String departamento;
    Data dataDeEntrada;
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
     System.out.println("Sistema Gerenciador de Funcionários do Banco do Heitor\n ******************************************************");
     System.out.println("Nome: "+nome);
     System.out.println("RG: "+rg);
     System.out.println("Departamento: "+departamento);
     System.out.println("Salário: R$"+salario);
  // dataDeEntrada.mostrar;
     System.out.println("Status: "+ativo);
    }
    //////////////////////////////////////
 /*  boolean equals(FuncionarioV4 outro){
        if(this.nome.equals(outro.nome)){
            if(this.rg.equals(outro.rg)){
            return true;
            }
        return false;
        }
    }*/
 /*   boolean equals(FuncionarioV4 outro){
        if(this.nome.equals(outro.nome) && (this.rg.equals(outro.rg))){
            return true;
            }
            return false;
        }*/
       boolean equals(FuncionarioV4 outro) {
           
       if(this.nome.equals(outro.nome) && (this.rg.equals(outro.rg))){
           System.out.println("\nALERTA: Funcionário(a) " + this.nome + " já cadastrado(a) no sistema[IGUAL]\n");
           return true;
           
       }
       else {
            return false;
       }
       }    
    
    /////////////////////////////////////    
}    
    
