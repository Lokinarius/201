package Projeto201.Conteudo.Java01BASICO.Aula02ManipulacaoDeDados.Ex04Caracteres;

import java.util.Scanner;

public class Caracteres {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite uma frase: ");
        String texto = scanner.nextLine();
        int caracteres = texto.length();

        // SAÍDA DE DADOS
        System.out.println("A froque você digitou foi: \""+texto+"\",e ela possui "+caracteres+" caracteres.");

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
