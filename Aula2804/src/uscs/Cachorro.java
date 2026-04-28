package uscs;

public class Cachorro extends Animal {
    // Atributos
    
    // Métodos
    public Cachorro(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O Cachorro " + getNome() + " esta latindo");
    }
}
