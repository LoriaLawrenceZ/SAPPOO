public class PessoaFisica extends Conta{
    public PessoaFisica(String numeroConta, String nome, String cpfCnpj, double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.saldo = saldo;
    }
}