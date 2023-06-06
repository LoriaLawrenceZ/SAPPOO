public abstract class Conta {
    //-----===ATRIBUTOS===-----//
    protected int numeroConta;
    protected String nome;
    protected double saldo;

    //-----===CONSTRUTOR===-----//
    public Conta(int numeroConta, String nome){
        this.numeroConta = numeroConta;
        this.nome = nome;
    }
    public Conta(){}
    
    //-----===Getters and Setters===-----//
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    //-----===MÉTODOS===-----//

}