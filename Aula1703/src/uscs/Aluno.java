package uscs;

public class Aluno {
        // Atributos
        private String nome;
        private int idade;
        private int matricula;
        private double notan1;
        private double notan2;
        
        // Métodos
        public Aluno(){} //Construtor default
        
        public Aluno(String nome, int idade, int matricula, double notan1, double notan2){
            this.nome = nome;
            if(idade < 0 || idade > 150) {
                System.out.println("Idade Invalida");
            } else {
                this.idade = idade;
            }
            this.matricula = matricula;
            this.notan1 = notan1;
            this.notan2 = notan2;
        }
        
        public String getNome(){
            return nome;
        }
        public void setNome(String nome){
            this.nome = nome;
        }
        
        public int getIdade(){
            return idade;
        }
        public void setIdade(int idade){
            if(idade < 0 || idade > 150) {
                System.out.println("Idade Invalida");
            } else {
                this.idade = idade;
            }
        }
        
        public int getMatricula() {
            return matricula;
        }
        public void setMatricula(int matricula) {
            this.matricula = matricula;
        }
        
        public double getNotan1() {
            return notan1;
        }
        public void setNotan1(double notan1) {
            this.notan1 = notan1;
        }
        
        public double getNotan2() {
            return notan2;
        }
        public void setNotan2(double notan2){
            this.notan2 = notan2;
        }
        
        public void imprimirAluno(){
            System.out.println("Nome: " + nome + " - idade: " + idade + " - Matr: " + matricula);
            System.out.println("Nota n1: " + notan1 + " - Nota n2: " + notan2);
        }
        
        public boolean calcularMedia(){
            double media = (notan1 + notan2) / 2;
            
            if(media >= 6) {
                return true;
            } else {
                return false;
            }
        }
}
