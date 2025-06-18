package projeto201.conteudo.java01basico.Aula03OperadoresLogicos.Ex05Adulto;

import java.util.Scanner;

public class Adulto {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Qual a sua idade? ");
        int idade = scanner.nextInt();

        // VERIFICAÇÃO DE IDADE
        String mensagem = (idade >= 18 && idade < 60)
                ? "Você é maior de idade"
                : (idade < 18)
                ? "Você é menor de idade"
                : "Você é idoso";


        // SAÍDA DE DADOS
        System.out.println(mensagem);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }

}
