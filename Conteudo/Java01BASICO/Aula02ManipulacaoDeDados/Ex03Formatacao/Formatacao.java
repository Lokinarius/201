package Projeto201.Conteudo.Java01BASICO.Aula02ManipulacaoDeDados.Ex03Formatacao;
import java.util.Scanner;
// A partir de uma formatação em uma string pode-se manipular o resultado final apresentado

public class Formatacao {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um numero real: ");
        double numero = scanner.nextDouble();
        String formatado = String.format("%.2f",numero);

        // SAÍDA DE DADOS
        System.out.println("O número com apenas duas casa decimais é "+formatado);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
