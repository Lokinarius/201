package projeto201.conteudo.java01basico.aula02manipulacaodedados.ex01conversao;
import java.util.Scanner;
// A classe integer é bastante util para realizar uma conversão entre tipos primitivos

public class Conversao {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        String resultado1 = Integer.toString(numero1);
        System.out.println("Digite outro numero: ");
        int numero2 = scanner.nextInt();
        String resultado2 = Integer.toString(numero2);

        // SAÍDA DE DADOS
        System.out.println("A soma entre "+numero1+" e "+numero2+" é "+resultado1+resultado2+"... Espera, isso está " +
                "certo?");

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
