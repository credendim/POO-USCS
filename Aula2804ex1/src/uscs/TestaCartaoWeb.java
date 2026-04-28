package uscs;

public class TestaCartaoWeb {

    public static void main(String[] args) {
        CartaoWeb cartao1 = new DiaDosNamorados("Jonathan");
        CartaoWeb cartao2 = new Natal("Miguel");
        CartaoWeb cartao3 = new Aniversario("Kennedy");
        
        cartao1.showMessage();
        cartao2.showMessage();
        cartao3.showMessage();
    }
    
}
