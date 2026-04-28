package uscs;

public abstract class Animal {
    // Atributos
    private String nome;
    private int idade;
    
    // Métodos
    public Animal(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public abstract void emitirSom();
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
}
