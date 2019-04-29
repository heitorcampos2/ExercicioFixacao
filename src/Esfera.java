public class Esfera {
    
    double raio;
    double volume;
    
    void calculeVolume(){
        volume = (4.0 / 3.0) * (Math.PI) * (Math.pow(raio,3));
        System.out.println("Esfera:\nRaio: "+raio+"cm\nVolume: "+volume+"cm");
    }
    
}
