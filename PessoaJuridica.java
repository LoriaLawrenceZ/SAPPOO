public class PessoaJuridica extends Conta{
    private String cnpj;

    public PessoaJuridica(String cnpj, String nome, int numeroConta){
        this.cnpj = cnpj;
        this.nome = nome;
        this.numeroConta = numeroConta;
    }
    
    public PessoaJuridica(){}
}