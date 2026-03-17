package uscs;

public class TestaPessoa {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        Pessoa p4 = new Pessoa();
        p1.setNome("Ana Souza");
        p1.setIdade(31);
        p2.setNome("Bia Nunes");
        p2.setIdade(25);
        p3.setNome("Paulo Santos");
        p3.setIdade(45);
        p4.setNome("Rui Matos");
        p4.setIdade(13);
        p1.imprimePessoa();
        p2.imprimePessoa();
        p3.imprimePessoa();
        p4.imprimePessoa();
    }
}

/*
Ana Souza com 31 anos, a Bia
Nunes com 25 anos, Paulo Santos com 45 anos e Rui Matos com
13 anos.
*/