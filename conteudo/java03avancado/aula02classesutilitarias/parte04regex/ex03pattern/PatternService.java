package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex03pattern;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternService {
    private Scanner sc = new Scanner(System.in);

    // 1. Validar email
    public void validarEmail() {
        System.out.println("Digite um email:");
        sc.nextLine();
        String email = sc.nextLine();

        Pattern pattern = Pattern.compile("^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);

        System.out.println(matcher.matches()?"Email válido!":"Email inválido.");
    }

    // 2. Validar CPF (formato simples: 000.000.000-00)
    public void validarCPF() {
        System.out.println("Digite um CPF: ");
        sc.nextLine();
        String cpf = sc.nextLine();

        Pattern pattern = Pattern.compile("^\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}$");
        Matcher matcher = pattern.matcher(cpf);

        System.out.println(matcher.matches()?"CPF válido!" : "CPF inválido.");
    }

    // 3. Validar senha forte (min 8 caracteres, 1 maiúscula, 1 minúscula, 1 numero, 1 especial)
    public void validarSenhaForte() {
        System.out.println("Digite uma senha: ");
        sc.nextLine();
        String senha = sc.nextLine();

        Pattern pattern = Pattern.compile("^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
        Matcher matcher = pattern.matcher(senha);

        System.out.println(matcher.matches() ? "Senha forte!" : "Senha fraca.");
    }

    // 4. Encontrar números dentro de um texto
    public void encontrarNumerosTexto() {
        System.out.println("Digite um texto: ");
        sc.nextLine();
        String texto = sc.nextLine();

        Pattern pattern = Pattern.compile("\\d+");
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Número encontrados.");
        while(matcher.find()){
            System.out.println("+ " + matcher.group());
        }
    }

    // 5. Encontrar palavras que começam com maiúscula
    public void encontrarPalavrasMaiusculas() {
        System.out.println("Digite um texte: ");
        sc.nextLine();
        String texto = sc.nextLine();

        Pattern pattern = Pattern.compile("\\b[A-Z][a-z]*\\b");
        Matcher matcher = pattern.matcher(texto);

        System.out.println("Palavras que começam com maiúscula: ");
        while ( matcher.find()){
            System.out.println("-> "+ matcher.group());
        }
    }
}
