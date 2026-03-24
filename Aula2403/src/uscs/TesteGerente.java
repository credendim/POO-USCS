package uscs;

public class TesteGerente {
    public static void main(String[] args) {
        Empregado e1 = new Empregado("Antonio", "Rua Brasil, 130", 50.00, 230);
        Gerente g1 = new Gerente("Carlos", "Rua Silvio Torres, 36", 50.00, 230, "Ana", 2000.00);
        
        g1.imprimeEmpregado();
        g1.calculaGerenteSalario();
    }
    /*
        “Antonio”, endereço: “Rua Brasil, 130”, valor hora =
        R$50,00 , 230 horas trabalhadas. Imprimir os dados do empregado. Imprimir o
        salário do empregado. Criar um gerente chamado “Carlos”, endereço: “Rua Silvio
        Torres, 36”, valor hora = R$ 50,00, quantidade de horas trabalhadas = 230,
        secretária “Ana” e bônus = R2.000,00. Imprimir os dados do gerente e seu
        salário.
    */
}