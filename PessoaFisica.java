public class PessoaFisica extends Conta {
    private String cpf;

    public PessoaFisica(String cpf, String nome, int numeroConta){
        this.cpf = cpf;
        this.nome = nome;
        this.numeroConta = numeroConta;
    }
    
    public PessoaFisica(){}
}