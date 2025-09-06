package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
public class BoloAniversario {
    public String parabens(int anoNascimento) {

        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM");
        int idade = hoje.getYear() - anoNascimento;

        String aniversario = "14/09";
        if (hoje.format(formatter).equals(aniversario)) {
            idade++;
        }
        return "Feliz Aniversário! Agora você tem " + idade + " anos!";
    }
    public static void main(String[] args) {
        BoloAniversario b = new BoloAniversario();
        System.out.println(b.parabens(1995));
    }
}
