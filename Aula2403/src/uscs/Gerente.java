package uscs;

public class Gerente extends Empregado{
    // Atributos
    private String nomeSecretaria;
    private double bonus;
    
    // Métodos
    public void imprimeGerente(){
        super.imprimeEmpregado();
        System.out.println("Nome secretaria: " + nomeSecretaria);
        System.out.println("Bonus: " + bonus);
    }
    
    public void calculaGerenteSalario(){
        System.out.println("Nome: " + super.getNome());
        System.out.println("Salario: " + (super.calculaSalario()+bonus));
    }
    
    
    // Métodos construtores
    public Gerente(){} // Default
    
    public Gerente(String nome, String endereco, double valorHora, int qteHoras, String nomeSecretaria, double bonus){
        super(nome, endereco, valorHora, qteHoras);
        this.nomeSecretaria = nomeSecretaria;
        this.bonus = bonus;
    }
    
}
