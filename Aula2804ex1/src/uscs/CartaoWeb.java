package uscs;

public abstract class CartaoWeb {
    // Atributos
    protected String destinatario;
    
    // Métodos
    public CartaoWeb(String destinatario){
        this.destinatario = destinatario;
    }
    
    public abstract void showMessage();
}
