package projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.Ex05CadastroDeUsuariosESenhas;

import java.util.regex.Pattern;

public class Senha {
    public static boolean senhaValida(String senha){
        if(senha.length()<8) return false;
        boolean maiscula = Pattern.compile("[A-Z]").matcher(senha).find();
        boolean minuscula = Pattern.compile("[a-z]").matcher(senha).find();
        boolean numero = Pattern.compile("[0-9]").matcher(senha).find();
        boolean charEspecial = Pattern.compile("[!@#$%&*()_+=|<>?{}\\\\[\\\\]~-]").matcher(senha).find();

        return maiscula && minuscula && numero && charEspecial;
    }
}
