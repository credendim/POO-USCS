package uscs;

public class Aniversario extends CartaoWeb{
    public Aniversario (String destinatario){
        super(destinatario);
    }
    
    public void showMessage(){
        System.out.println("Para: " + destinatario);
        System.out.println("Feliz aniversario, curta seu dia <3!");
    }
}
