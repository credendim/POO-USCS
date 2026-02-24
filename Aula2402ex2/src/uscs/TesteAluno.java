package uscs;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.nome = "Maria Tereza";
        a1.idade = -176;
        a1.matricula = 12345;
        a1.notaN1 = 5.0;
        a1.notaN2 = 9.5;
        a1.notaN3 = 1.7;
        a1.imprimirAluno();
        System.out.println("A maior nota: " + a1.selecionarMaiorNota());
    } 
}
