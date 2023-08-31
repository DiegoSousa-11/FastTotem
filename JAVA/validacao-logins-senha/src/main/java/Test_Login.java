import java.util.Scanner;

public class Senha {
    public static void main(String[] args) {

        boolean tamanho = false;
        boolean minusculo = false;
        boolean maiusculo = false;
        boolean digito = false;

        Scanner entrada = new Scanner(System.in);


        System.out.print("Informe uma senha: ");
        String senha = entrada.nextLine();

        if (senha.length() >= 8) {
            tamanho = true;

       for (int i = 0; i < senha.length(); i++) {
                // o caractere atual é um dígito?
                if (Character.isDigit(senha.charAt(i))) {
                    digito = true;
                }
                // é um caractere maiúsculo?
                else if (Character.isUpperCase(senha.charAt(i))) {
                    maiusculo = true;
                }
                // é um caractere minúsculo?
                else if (Character.isLowerCase(senha.charAt(i))) {
                    minusculo = true;
                }
            }
        }
       if (minusculo && maiusculo && tamanho && digito) {
            System.out.println("A senha é válida.");
        } else {
            System.out.println("A senha não é válida.");
        }
    }
}

