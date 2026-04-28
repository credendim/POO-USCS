package uscs;

public class DiaDosNamorados extends CartaoWeb{
    // Atributos
    
    // Métodos
    public DiaDosNamorados(String destinatario){
        super(destinatario);
    }
    
    @Override
    public void showMessage(){
        System.out.println("Para: " + destinatario);
        System.out.println("Eu te amo <3.");
    }
}
