package Projeto201.Conteudo.Java01BASICO.Aula02ManipulacaoDeDados.EX05Substituicao;

import java.util.Scanner;

public class Substuicao {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite uma frase: ");
        String frase = scanner.nextLine();
        String substituicao = frase.replaceAll("[aeiouAEIOU]","*");

        // SAÍDA DE DADOS
        System.out.println("Suas vogais foram roubadas!");
        System.out.println("agora esta é sua frase:");
        System.out.println(substituicao);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
