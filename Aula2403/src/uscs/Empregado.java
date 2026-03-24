package uscs;

public class Empregado {
    // Atributos
    private String nome;
    private String endereco;
    private double valorHora;
    private int qteHoras;
    
    // Métodos
    
    public void imprimeEmpregado(){
        System.out.println("Nome: " + nome);
        System.out.println("Endereço: " + endereco);
        System.out.println("Valor da hora: " + valorHora);
        System.out.println("Quantidade de hora: " + qteHoras);
    }
    
    public double calculaSalario(){
        return (double)qteHoras * valorHora;
    }
    
    public void imprimeSalario() {
        System.out.print("Nome: " + nome);
        System.out.println("Salario: " + calculaSalario());
    }
    
    // Métodos construtores
    public Empregado(){} // Default
    
    public Empregado(String nome, String endereco, double valorHora, int qteHoras){
        this.nome = nome;
        this.endereco = endereco;
        this.valorHora = valorHora;
        this.qteHoras = qteHoras;
    }
    
    // Getters e Setters
    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public int getQteHoras() {
        return qteHoras;
    }
    public void setQteHoras(int qteHoras) {
        this.qteHoras = qteHoras;
    }
}
