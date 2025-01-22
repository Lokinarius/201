package Projeto201.Conteudo.Java01BASICO.Aula03OperadoresLogicos.Ex03UmACem;

import java.util.Scanner;

public class UmACem {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // SAÍDA DE DADOS
        if(numero <= 100)

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
