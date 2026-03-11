package uscs;
public class Pessoa {
    //Atributos
    String nomePessoa;
    int idadePessoa;
    
    //Métodos
    //Métuto construtor padrão
    public Pessoa(){}
    
    public Pessoa(int idadePessoa){
        this.idadePessoa = idadePessoa;
    }
    
    public Pessoa(String nomePessoa, int idadePessoa){
        this.nomePessoa = nomePessoa;
        
        if(idadePessoa < 0) {
            System.out.println("Idade Inálida!!!");
            this.idadePessoa = 0;
        } else {
            this.idadePessoa = idadePessoa;
        }
        
    }
    
    public void imprimirPessoa(){
        System.out.println("Nome da pessoa: " + nomePessoa);
        System.out.println("Idade da pessoa: " + idadePessoa);
    }
    
}
