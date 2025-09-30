package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex02random;

import java.util.Random;
import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexRandomService {
    private Scanner sc = new Scanner(System.in);
    private Random random = new Random();

    // 1. Gerar número aleatório (int)
    public void gerarNumeroAleatorio() {
        int numero = random.nextInt();
        System.out.println("Número aleatório gerado: "+ numero);
    }

    // 2. Gerar número aleatório dentro de um intervalo
    public void gerarNumeroIntervalo() {
        System.out.println("Digite o limite inferior: ");
        int min = sc.nextInt();
        System.out.println("Digite o limite superior: ");
        int max = sc.nextInt();

        if(min >= max) {
            System.out.println("Intervalo inválido");
            return;
        }
        int numero = random.nextInt(max - min + 1) + min;
        System.out.println("Numero gerado entre "+ min + " e " + max + ": " + numero );
    }

    // 3. Validar email com Regex
    public void validarEmail() {
        System.out.println("Digite um email: ");
        sc.nextLine();
        String email = sc.nextLine();

        String regex = "^[\\\\w._%+-]+@[\\\\w.-]+\\\\.[a-zA-Z]{2,}$";
        boolean valido = Pattern.matches(regex, email);

        System.out.println(valido ? "Email válido" : "Email inválido.");
    }

    // 4. Validar telefone com Regex (xx)xxxxx-xxxx
    public void validarTelefone() {
        System.out.println("Digite um telefone (formato (xx)xxxxx-xxxx): ");
        sc.nextLine();
        String telefone = sc.nextLine();

        String regex = "^\\\\(\\\\d{2}\\\\)\\\\d{5}-\\\\d{4}$";
        boolean valido = Pattern.matches(regex, telefone);

        System.out.println(valido ? "Telefone válido!" : " Telefone inválido.");
    }

    public void validarNumeros() {
        System.out.println("Digite algo");
        sc.nextLine();
        String entrada = sc.nextLine();

        String regex = "\\d+$";
        boolean valido = Pattern.matches(regex, entrada);

        System.out.println(valido ? "Apenas números." : "Contem outros caracteres.");
    }
}
