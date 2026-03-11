package uscs;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa("João Grandão", -32);
        
        p1.nomePessoa = "Ana Souza";
        p1.idadePessoa = -31;
        
        p2.nomePessoa = "Bia Nunes";
        p2.idadePessoa = -25;
        
        p3.nomePessoa = "Paulo Santos";
        p3.idadePessoa = -45;
        
        p1.imprimirPessoa();
        p2.imprimirPessoa();
        p3.imprimirPessoa();
        p4.imprimirPessoa();
    }
    
}
