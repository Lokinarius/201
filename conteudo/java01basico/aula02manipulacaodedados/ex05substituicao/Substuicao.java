package projeto201.conteudo.java01basico.aula02manipulacaodedados.ex05substituicao;

import java.util.Scanner;
// Método replace() e replaceAll() servem para substituição de dados

public class Substuicao {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        String substituicao = frase.replaceAll("[aáàâãeéêiíoóôõuAÁÀÂEÉÊIÍOÔÕU]","*");

        // SAÍDA DE DADOS
        System.out.println("Suas vogais foram roubadas!");
        System.out.println("agora esta é sua frase:");
        System.out.println(substituicao);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
