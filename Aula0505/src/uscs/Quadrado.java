package uscs;

public class Quadrado implements FormaGeometrica {
    // Atributos
    public double lado;
    public String cor;
    
    // Métodos construtores
    public Quadrado(){};
    
    public Quadrado(double lado, String cor){
        this.lado = lado;
        this.cor = cor;
    };
    
    // Métodos 
    @Override
    public double area(){
        return lado * lado;
    };
    
    @Override
    public double perimetro(){
        return lado * 4;
    };
    
    @Override
    public String cor(){
        return cor;
    };
}
