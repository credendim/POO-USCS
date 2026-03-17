package uscs;

public class Pessoa {
    // Atributos
    private String nome;
    private int idade;
    
    // Metodos
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    
    public void imprimePessoa(){
        System.out.println("Nome: " + nome + " - idade: " + idade);
    }
}
