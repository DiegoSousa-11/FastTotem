import java.util.Scanner;

public class Test_LoginSenha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Senha validacao = new Senha();
        String senha;
        String login;

        do {
            System.out.print("Informe seu Login: ");
            login = entrada.nextLine();

            System.out.print("Informe sua Senha: ");
            senha = entrada.nextLine();

            if (Senha.emailValidator(login) && (Senha.validacaoSenha(senha))) {
                System.out.println("*----------*----------*----------* \n" +
                      "   Login realizado com Sucesso! \n" +
                      "*----------*----------*----------*");
            } else if (Senha.emailValidator(login) != true) {
                System.out.println(" E-mail inválido \n Tente Novamente");
            } else if (Senha.validacaoSenha(senha) != true){
                System.out.println(" Senha inválida \n Tente Novamente");
            }
        }
        while (Senha.emailValidator(login) != true || Senha.validacaoSenha(senha) != true);
    }
}

