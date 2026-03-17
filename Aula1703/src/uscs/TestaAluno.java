package uscs;
public class TestaAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana Souza", 31, 1234, 7.0, 3.0);
        Aluno a2 = new Aluno("Bia Nunes", 25, 5678, 3.0, 9.0);
        Aluno a3 = new Aluno("Paulo Santos", 45, 9876, 6.0, 8.0);
        a1.imprimirAluno();
        if(a1.calcularMedia()) {
            System.out.println("O aluno: " + a1.getNome() + " foi aprovado!");
        } else {
            System.out.println("O aluno: " + a1.getNome() + " foi reprovado!");
        }
        
        a2.imprimirAluno();
        if(a2.calcularMedia()) {
            System.out.println("O aluno: " + a2.getNome() + " foi aprovado!");
        } else {
            System.out.println("O aluno: " + a2.getNome() + " foi reprovado!");
        }
        
        a3.imprimirAluno();
        if(a3.calcularMedia()) {
            System.out.println("O aluno: " + a3.getNome() + " foi aprovado!");
        } else {
            System.out.println("O aluno: " + a3.getNome() + " foi reprovado!");
        }
        
    }
}