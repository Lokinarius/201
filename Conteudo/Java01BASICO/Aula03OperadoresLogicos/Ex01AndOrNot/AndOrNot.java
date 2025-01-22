package Projeto201.Conteudo.Java01BASICO.Aula03OperadoresLogicos.Ex01AndOrNot;

import java.util.Scanner;

public class AndOrNot {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite 1 para verdadeiro e 0 para falso");
        System.out.println("Digite o primeiro número: ");
        int primeiro = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int segundo = scanner.nextInt();

        // CHAVES
        boolean primeirachave = (primeiro == 1);
        boolean segundachave = (segundo == 1);

        // OPERAÇÕES LÓGICAS
        boolean e = primeirachave && segundachave;
        boolean ou = primeirachave || segundachave;
        boolean naoum = !primeirachave;
        boolean naodois = !primeirachave;

        // SAÍDA DE DADOS
        System.out.println("A operação lógica AND entre "+primeirachave+" e "+segundachave+" é "+e);
        System.out.println("A operação lógica OR entre "+primeirachave+" e "+segundachave+" é "+ou);
        System.out.println("A operação lógica NOT de "+primeirachave+" é "+naoum);
        System.out.println("A operação lógica NOT de "+segundachave+" é "+naodois);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
