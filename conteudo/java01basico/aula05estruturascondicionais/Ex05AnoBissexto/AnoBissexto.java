package projeto201.conteudo.java01basico.aula05estruturascondicionais.Ex05AnoBissexto;

import java.util.Scanner;

public class AnoBissexto {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADAS DE DADOS
        System.out.println("Digite um ano: ");
        int ano = scanner.nextInt();

        // SAÍDA DE DADOS
        if ((ano %4 == 0) && ((ano %100 != 0) || (ano %400 == 0))){
            System.out.println("O ano "+ano+"  é um ano bissexto");
        } else {
            System.out.println("O ano "+ano+" não é um ano bissexto");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
