import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {

    boolean tamanho;
    boolean minusculo;
    boolean maiusculo;
    boolean digito;

    public String validarEmail(String email) {
        String validacaoLoginOk = "";
        for (int i = 0; i < email.length(); i++) {
            if (Character.isDigit(email.charAt(i)) && Character.isLetter(email.charAt('@')) && email != null) {
                digito = true;
            }

            if (digito) {
                validacaoLoginOk = "E-mail é válido \n";
            } else {
                validacaoLoginOk = "Este e-mail não é válido \n";
            }
        }
            return validacaoLoginOk;
        }


    public String validacaoSenha(String senha) {
        String validacaoOk = "";
        if (senha.length() >= 8) {
            tamanho = true;
        }
        for (int i = 0; i < senha.length(); i++) {
            if (Character.isDigit(senha.charAt(i))) {
                digito = true;
            } else if (Character.isUpperCase(senha.charAt(i))) {
                maiusculo = true;
            } else if (Character.isLowerCase(senha.charAt(i))) {
                minusculo = true;
            }
        }
        if (minusculo && maiusculo && tamanho && digito) {
            validacaoOk = "A senha é válida";
        } else {
            validacaoOk = "A senha não é válida.";
        }
        return validacaoOk;
    }
}


