package uscs;

public class TestaFormaGeometrica {
    public static void main(String[] args) {
        FormaGeometrica q1 = new Quadrado(4.0, "Laranja");
        FormaGeometrica c1 = new Circulo(5.0, "Azul");
        FormaGeometrica r1 = new Retangulo(5.0, 6.0, "Verde");
        
        System.out.println("A area do quadrado é: " + q1.area());
        System.out.println("O perimetro do quadrado é: " + q1.perimetro());
        System.out.println("A cor do quadrado é: " + q1.cor());
        System.out.println("A area do circulo é: " + c1.area());
        System.out.println("O perimetro do circulo é: " + c1.perimetro());
        System.out.println("A cor do circulo é: " + c1.cor());
        System.out.println("A area do retangulo é: " + r1.area());
        System.out.println("O perimetro do retangulo é: " + r1.perimetro());
        System.out.println("A cor do retangulo é: " + r1.cor());
    }
}
