package uscs;

import java.util.Scanner;

public class TesteEx03 {
    public static void main(String[] args) {
        Scanner s1= new Scanner(System.in);
        
        System.out.println("Programa que calcula o imc\n");
        
        System.out.print("Entre com sua altura: ");
        double altura = s1.nextDouble();
        
        System.out.print("Entre com seu peso: ");
        double peso = s1.nextDouble();
        
        double imc = peso / (altura * altura);
        
        System.out.println("O seu IMC é: " + imc);
        
        if(imc > 40) {
            System.out.println("Obesidade (Grau III)");
        } else if(imc > 35){
            System.out.println("Obesidade (Grau II)");
        } else if(imc > 30) {
            System.out.println("Obesidade (Grau I)");
        } else if(imc > 25) {
            System.out.println("Excesso de peso");
        } else if(imc >= 18.5) {
            System.out.println("Peso Normal");
        } else if(imc < 18.5) {
            System.out.println("Excesso de Magreza");
        }
    }

}
