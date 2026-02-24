package uscs;

public class Aluno {
    // Atributos
    String nome;
    int idade;
    int matricula;
    double notaN1;
    double notaN2;
    double notaN3; 
    
    // Métodos
    void imprimirAluno(){
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Matricula: " + matricula);
        System.out.println("Nota N1: " + notaN1);
        System.out.println("Nota N2: " + notaN2);
        System.out.println("Nota N3: " + notaN3);
    }
    
    // Por estar ultilizando double devo retornar um double também
    double selecionarMaiorNota(){
        if(notaN1 > notaN2){
            if(notaN1 > notaN3) {
                return notaN1;
            } else {
                return notaN3;
            }
        } else {
            if(notaN2 > notaN3) {
                return notaN2;
            } else {
                return notaN3;
            }
        }
    }
}
