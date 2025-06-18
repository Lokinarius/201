package projeto201.conteudo.java01basico.Aula04OperadoresRelacionais.Ex04Maior;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Digite o terceiro número: ");
        int num3 = scanner.nextInt();

        // Lógica para determinar o maior número
        int maior = num1;
        if (num2 > maior){
            maior = num2;
        }
        if(num3 > maior){
            maior = num3;
        }

        // SAÍDA DE DADOS
        System.out.println("O maior número é: "+maior);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
