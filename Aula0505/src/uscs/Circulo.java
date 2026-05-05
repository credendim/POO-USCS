package uscs;

public class Circulo implements FormaGeometrica {
    // Atributos
    public double raio;
    public String cor;
    
    // Métodos Construtores
    public Circulo(){};
    
    public Circulo(double raio, String cor){
        this.raio = raio;
        this.cor = cor;
    };
    
    // Métodos
    @Override
    public double area(){
        return FormaGeometrica.PIFG * (raio * raio);
    };
    
    @Override
    public double perimetro(){
        return (2 * FormaGeometrica.PIFG) * raio;
    };
    
    @Override
    public String cor(){
        return cor;
    };
}
