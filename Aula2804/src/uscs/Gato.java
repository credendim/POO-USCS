package uscs;

public class Gato extends Animal {
    // Atributos
    
    // Métodos
    public Gato(String nome, int idade){
        super(nome, idade);
    }
    
    @Override
    public void emitirSom(){
        System.out.println("O gato " + getNome() + " esta miando");
    }
}
