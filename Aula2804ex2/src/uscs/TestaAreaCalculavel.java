package uscs;

public class TestaAreaCalculavel {
    public static void main(String[] args) {
        Quadrado quadrado1 = new Quadrado(5.0);
        Circulo circulo1 = new Circulo(1.0);
        Retangulo retangulo1 = new Retangulo(2.0, 5.0);
        
        System.out.println("A área do quadrado de lado " + quadrado1.getLado() + " é: " + quadrado1.calculaArea());
        System.out.println("O perimetro do quadrado de lado " + quadrado1.getLado() + " é: " + quadrado1.calculaPerimetro());
        System.out.println("A área do quadrado de lado " + circulo1.getRaio() + " é: " + circulo1.calculaArea());
        System.out.println("O perimetro do circulo de lado " + quadrado1.getLado() + " é: " + quadrado1.calculaPerimetro());
        System.out.println("A área do retangulo de lado 1 " + retangulo1.getLado1() + " e lado 2 " + retangulo1.getLado2() + " é: " + retangulo1.calculaArea());
        System.out.println("O perimetro do retangulo de lado 1 " + retangulo1.getLado1() + " e lado 2 " + retangulo1.getLado2() + " é: " + retangulo1.calculaPerimetro());
    }
    
}
