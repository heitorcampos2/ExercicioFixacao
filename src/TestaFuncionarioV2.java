public class TestaFuncionarioV2 {
    public static void main(String[] args){
        //////////////////////////
        FuncionarioV2 f2 = new FuncionarioV2 ();
        f2.nome = "Edilnânio Costa da Silva Neto";
        f2.rg = "16.859.547";
        f2.departamento = "Gerente";
        f2.salario = 3900.00;
        f2.dataDeEntrada = "05/03/2019";
        f2.ativo = true;

        f2.mostrar();/*imprime os atributos*/
    }
}
    