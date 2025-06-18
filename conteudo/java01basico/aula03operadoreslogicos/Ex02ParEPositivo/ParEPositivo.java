package projeto201.conteudo.java01basico.aula03operadoreslogicos.Ex02ParEPositivo;

import java.util.Scanner;
// O perador ternário é um tipo de condicional mais simples que pode ser extremamente útil, especialmente se feito em
// uma operação lógica simples

public class ParEPositivo {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();


        // VERIFICAÇÃO BOOLEANA
        boolean positivo = numero > 0;
        boolean negativo = numero < 0;
        boolean par = numero %2 == 0;

        // SAÍDA DE DADOS
        System.out.println(positivo?"O número digitado é positivo":
                negativo?"O número digitado é negativo":
                "O número digitado é zero");
        System.out.println(par?"O número digitado é par":
                "O número digitado é impar");

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
