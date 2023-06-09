public class PessoaJuridica extends Conta{
    public PessoaJuridica(String numeroConta, String nome, String cpfCnpj, double saldo){
        this.numeroConta = numeroConta;
        this.nome = nome;
        this.cpfCnpj = cpfCnpj;
        this.saldo = saldo;
    }
}