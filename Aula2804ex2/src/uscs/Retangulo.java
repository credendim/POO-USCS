package uscs;

public class Retangulo implements AreaCalculavel {
    // Atributos
    private double lado1;
    private double lado2;
    
    // Métodos
    public Retangulo(double lado1, double lado2){
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double getLado1(){
        return lado1;
    }
    
    public double getLado2(){
        return lado2;
    }
    
    @Override
    public double calculaArea(){
       return lado1 * lado2; 
    }
    
    @Override
    public double calculaPerimetro(){
        return (lado1 * 2) + (lado2 * 2);
    } 
}
