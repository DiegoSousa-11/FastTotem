import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Senha {
    private static final String EMAIL_REGEX = "(?:[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)\\.){3}(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])";
    private static final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

    public static boolean emailValidator(String email) {
        if (email == "") {
           System.out.println(" E-mail precisa ser preenchido");
        }
        Matcher matcher = EMAIL_PATTERN.matcher(email);
        return matcher.matches();
    }


    private static final String PASSWORD_REGEX = "^(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{6,10}$";
    /* ^         # start of the string
 (?=.*\d)        # a digit must occur at least once
 (?=.*[a-z])     # a lower case letter must occur at least once
 (?=.*[A-Z])     # an upper case letter must occur at least once
 .{6,10}          # 6-10 character password, both inclusive
 $               # end of the string*/
    private static final Pattern PASSWORD_PATTERN = Pattern.compile(PASSWORD_REGEX);
    public static boolean validacaoSenha(String senha) {
        if (senha == "") {
            System.out.println(" Senha precisa ser preenchida");
        }
        Matcher matcher = PASSWORD_PATTERN.matcher(senha);
        return matcher.matches();
    }
}