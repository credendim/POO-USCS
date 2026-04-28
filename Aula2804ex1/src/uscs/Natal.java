package uscs;

public class Natal extends CartaoWeb {
    // Atributos
    
    // Métodos
    public Natal(String destinatario){
        super(destinatario);
    }
    
    public void showMessage(){
        System.out.println("Para: " + destinatario);
        System.out.println("Te desejo um incrivel natal abençoado por Deus nosso pai amado, e seu filho Jesus que morreu por nós na cruz <3.");
    }
}
