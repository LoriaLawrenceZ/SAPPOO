import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Gerenciamento {
    Scanner sc = new Scanner(System.in, "latin1");

    private List<Conta> contas;
    private String escolha = "";
    private String numeroConta = "";
    private String nome = "";
    private String cpfCnpj = "";

    public Gerenciamento(){
        contas = new ArrayList<>();
    }

    public void CriarConta(){
        System.out.println("------------------------------------------------\n[A] - Pessoa Física | [B] - Pessoa Jurídica");
        escolha = sc.next().toLowerCase();

        while (!escolha.equalsIgnoreCase("A") & !escolha.equalsIgnoreCase("B")){
            System.out.println("\nInsira um valor válido\n[A] - Pessoa Física | [B] - Pessoa Jurídica");
        }

        if (escolha.equalsIgnoreCase("A")){
            numeroConta = contas.get(contas.size() - 1).numeroConta + 1;

            System.out.println("------------------------------\nNome:");
            nome = sc.next();

            System.out.println("------------------------------\nCPF:         [12345678909]");
            cpfCnpj = sc.next();

            for (Conta conta : contas) {
                while (cpfCnpj == conta.cpfCnpj) {
                    System.out.println("-----------------------------------------------------------------\nJá existe uma conta cadastrada nesse CPF\nInsira um novo CPF");
                    cpfCnpj = sc.next();
                }
            }

            PessoaFisica conta = new PessoaFisica(numeroConta, nome, cpfCnpj, 100);

            contas.add(conta);
        }
        else {
            numeroConta = contas.get(contas.size() - 1).numeroConta + 1;

            System.out.println("------------------------------\nNome:");
            nome = sc.next();

            System.out.println("------------------------------\nCPF:");
            cpfCnpj = sc.next();

            for (Conta conta : contas) {
                while (cpfCnpj == conta.cpfCnpj) {
                    System.out.println("-----------------------------------------------------------------\nJá existe uma conta cadastrada nesse CNPJ\nInsira um novo CNPJ");
                    cpfCnpj = sc.next();
                }
            }

            PessoaJuridica conta = new PessoaJuridica(numeroConta, nome, cpfCnpj, 100);

            contas.add(conta);
        }

    }

    public void Validacao(){
        System.out.println("-----------------------------------------------------------------\nInsira seu CPF/CNPJ ou Número da Conta");
        cpfCnpj = sc.next();
        
        for(Conta conta : contas) {
            if(cpfCnpj.equalsIgnoreCase(conta.getCpfCnpj())){
                AcessarConta();
            }
            else{
                System.out.println("Conta não encontrada.");
            }
        }
    }
    public void AcessarConta(){
    }
    /*
    void exibirSaldo();
    void realizarSaque(double valor);
    void realizarDeposito(double valor);
    void solicitarEmprestimo(double valor);
    void sairDaConta();
    */
}