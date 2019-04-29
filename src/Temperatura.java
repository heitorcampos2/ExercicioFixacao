public class Temperatura {
    
    
    double converterParaCelcius(double f){
        double resultado;
        resultado = (f - 32) * (5.0 / 9);
        
        return resultado;
    }
    double converterParaFarenheit(double c){
        double resultado;
        resultado = (c * (9 / 5)) + 32;
        
        return resultado;
    }
}
