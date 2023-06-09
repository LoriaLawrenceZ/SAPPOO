import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in, "latin1");
        
        Gerenciamento gerenciar = new Gerenciamento();
        String escolha = "";
    
        do
        {
            System.out.println(
                    "\n------------------------------------------------------------------------------------\n[1] - Acessar conta | [2] - Criar Conta | [S] - Sair");
            escolha = sc.next().toLowerCase();
            switch (escolha) {
                case "1":
                    gerenciar.Validacao();
                break;
                case "2":
                    gerenciar.CriarConta();
                    break;
                case "s":
                    System.out.println("----====Encerrando Programa====----");
                    escolha = "N";
                    break;
                default:
                    System.out.println("Insira um valor válido da próxima vez");
                    escolha = "";
                    break;
            }
        }while(escolha!="N");

        sc.close();
    }
}

/*
1 - Criar uma Aplicação Bancária com funcionalidades:
    1.A - Criar conta Pessoa Física e Pessoa Júridica
    1.B - Permitir busca de conta pelo n° da conta
    1.C - Instanciar saldo
    1.D - Criar método saque
    1.E - Criar métodos depósito
    1.F - Criar método empréstimo
*/