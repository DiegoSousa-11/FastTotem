public class Senha {

    boolean tamanho = false;
    boolean minusculo = false;
    boolean maiusculo = false;
    boolean digito = false;


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
        if (minusculo && maiusculo && tamanho && digito){
            validacaoOk = "A senha é válida";
        } else{
            validacaoOk ="A senha não é válida.";
        }
        return validacaoOk;
    }
}


