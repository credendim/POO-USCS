package uscs;

public class Quadrado implements AreaCalculavel{
    // Atributos
    private double lado;
    
    // Métodos
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    public double getLado(){
        return lado;
    }
    
    @Override
    public double calculaArea(){
       return lado * lado; 
    }
    
    @Override
    public double calculaPerimetro(){
        return lado * 4;
    } 
}
