package uscs;

public class Aluno {
    // Atributos
    String nome;
    int codmat;
    String cpf;
    char sexo;
    double nota_P1;
    double nota_P2;
    double nota_P3;
    
    // Métodos
    public Aluno(){}
    public Aluno(String nome, int codmat, String cpf, char sexo, double nota_P1, double nota_P2, double nota_P3){
        this.nome = nome;
        this.codmat = codmat;
        this.cpf = cpf;
        this.sexo = sexo;
        this.nota_P1 = nota_P1;
        this.nota_P2 = nota_P2;
        this.nota_P3 = nota_P3;
    }
    
    public void imprimeAluno() {
        System.out.println("Nome do Aluno: " + nome);
        System.out.println("Sexo do Aluno: " + codmat);
        System.out.println("Nome do Aluno: " + cpf);
        System.out.println("Nome do Aluno: " + sexo);
        System.out.println("Nome do Aluno: " + nota_P1);
        System.out.println("Nome do Aluno: " + nota_P2);
        System.out.println("Nome do Aluno: " + nota_P3);
    }
    
    public void imprimeSexo() {
        if (sexo == 'M') {
            System.out.println("O Aluno: " + nome + " é masculino");
        } else {
            System.out.println("A Aluna: " + nome + " é feminina");
        }
    }
    
    public double mediaAluno(double nota_P1, double nota_P2, double nota_P3) {
        double media;
        
        if (nota_P1 > nota_P2) {
            if (nota_P2 > nota_P3) {
                media = (nota_P1 + nota_P2) / 2;
                return media;
            } else {
                media = (nota_P1 + nota_P3) / 2;
                return media;
            }
        } else if (nota_P2 > nota_P1) {
            if (nota_P1 > nota_P3) {
                media = (nota_P2 + nota_P1) / 2;
                return media;
            } else {
                media = (nota_P2 + nota_P3) / 2;
                return media;
            }
        } else {
            if (nota_P1 > nota_P2) {
                media = (nota_P3 + nota_P1) / 2;
                return media;
            } else {
                media = (nota_P3 + nota_P2) / 2;
                return media;
            }
        }
    }
    
    public String resultado(){
        String resultado = "";
        if (mediaAluno(nota_P1, nota_P2, nota_P3) >= 6) {
            System.out.println("Aprovado");
            resultado = "Aprovado";
            return resultado;
        } else if (mediaAluno(nota_P1, nota_P2, nota_P3) <= 6){
            System.out.println("Reprovado");
            resultado = "Reprovado";
            return resultado;
        } else {
            System.out.println("Média invalida!!!!");
            return resultado;
        }
    }
}
