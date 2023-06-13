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