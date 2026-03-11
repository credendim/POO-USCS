
package uscs;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno a1 = new Aluno("Paulo", 55123, "800912345-12", 'M', 7.0, 6.0, 8.0);
        Aluno x2 = new Aluno("Ana", 991239, "500876123-15", 'F', 2.0, 6.0, 9.0);
        
        a1.imprimeAluno();
        a1.imprimeSexo();
        a1.resultado();
        
        x2.imprimeAluno();
        x2.imprimeSexo();
        x2.resultado();
    } 
}
