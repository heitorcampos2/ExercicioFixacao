public class TestaFuncionarioV2 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV2 f2 = new FuncionarioV2 ();
        f2.nome = "Edilnânio Costa da Silva Neto";
        f2.rg = "16.859.547";
        f2.departamento = "Gerente";
        f2.salario = 3900.00;
        f2.datadeentrada = "05/03/2019";
        f2.ativo = true;
        /*
        f2.bonifica(0.1); //aumenta salário em 10%
        f2.demite();      //demite o funcionário
        /////////////////////////
        System.out.println("Sistema Gerenciador de Funcionários do Banco do Heitor\n ****************************************************");
        System.out.println( "\nNome: "+f2.nome+
                            "\nRG: "+f2.rg+
                            "\nDepartamento: "+f2.departamento+
                            "\nSalário: "+f2.salario+
                            "\nData de entrada: "+f2.datadeentrada+
                            "\nEstatus: "+f2.ativo+"\n****************************************************");
    }*/
        f2.mostrar();//imprime os atributos
                       
 }

