import java.util.Scanner;

public class Test_LoginSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Senha validacao = new Senha();

        System.out.print("Informe seu Login: ");
        String login = entrada.nextLine();
        System.out.format(validacao.validarEmail(login));

        System.out.print("Informe sua Senha: ");
        String senha = entrada.nextLine();
        System.out.format(validacao.validacaoSenha(senha));
    }
}
