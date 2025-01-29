package Projeto201.Conteudo.Java01BASICO.Aula05EstruturasCondicionais.Ex04VogalOuConsoante;

import java.util.Scanner;

public class VogalOuConsoante {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADAS DE DADOS
        System.out.println("Digite uma letra: ");
        String letra = scanner.next().toLowerCase();

        // SAÍDA DE DADOS
        if (letra.length() != 1 || !Character.isLetter(letra.charAt(0))) {
            System.out.println("Digite apenas uma letra");
        } else {
            if ("aeiou".contains(letra)) {
                System.out.println("A letra digitada é uma vogal.");
            } else {
                System.out.println("A letra digitada é uma consoante.");
            }
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
