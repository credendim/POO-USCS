package uscs;

public class Retangulo implements FormaGeometrica {
    // Atributos
    public double lado1;
    public double lado2;
    public String cor;
    // Métodos construtores
    public Retangulo(){};
    
    public Retangulo(double lado1, double lado2, String cor){
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.cor = cor;
    };
    
    // Métodos
    public double area(){
        return lado1 * lado2;
    };
    
    public double perimetro(){
        return (lado1 * 2) + (lado2 * 2);
    };
    
    public String cor(){
        return cor;
    };
}
