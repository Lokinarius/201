package projeto201.conteudo.java01basico.aula05estruturascondicionais.Ex01PositivoNegativoZero;

import java.util.Scanner;

public class PositivoNegativoZero {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADAS DE DADOS
        System.out.println("Digite um número: ");
        int num = scanner.nextInt();

        // SAÍDA DE DADOS
        if (num > 0){
            System.out.println("O número informado é positivo");
        } else if (num < 0) {
            System.out.println("O número informado é negativo");
        } else {
            System.out.println("Você informou um zero");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();

    }
}
