public abstract class Conta {
    //-----===ATRIBUTOS===-----//
    protected String numeroConta;
    protected String nome;
    protected String cpfCnpj;
    protected double saldo;

    //-----===CONSTRUTOR===-----//
    public Conta(){}
    
    //-----===GETTERS e SETTERS===-----//
    public String getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }
    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }
}