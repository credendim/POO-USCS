package uscs;

public class Circulo implements AreaCalculavel {
    // Atributos
    private double raio;
    
    // Métodos
    public Circulo(double raio){
        this.raio = raio;
    }
    
    public double getRaio(){
        return raio;
    }
    
    @Override
    public double calculaArea(){
       return AreaCalculavel.PI * (raio * raio); 
    }
    
    @Override
    public double calculaPerimetro(){
        return 2 * AreaCalculavel.PI * raio;
    } 
}
