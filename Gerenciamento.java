import java.util.ArrayList;

public class Gerenciamento {
    PessoaFisica contaPF;
    PessoaJuridica contaPJ;
    private String tipo;

    public Gerenciamento(String tipo, String cpfCnpj, String nome, int numeroConta){
        if (tipo.equals("1")) {
            contaPF = new PessoaFisica(cpfCnpj, nome, numeroConta);
        }
        else{
            contaPJ = new PessoaJuridica(cpfCnpj, nome, numeroConta);
        }
    }

    public void CriaConta(){};

    public void Saque(){};

    public void Depósito(){};

    public void Emprestimo(){};

    public void SairConta(){}
    
}
