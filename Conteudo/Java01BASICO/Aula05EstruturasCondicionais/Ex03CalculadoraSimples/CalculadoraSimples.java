package Projeto201.Conteudo.Java01BASICO.Aula05EstruturasCondicionais.Ex03CalculadoraSimples;

import java.util.Scanner;

public class CalculadoraSimples {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADAS DE DADOS
        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Escolha uma operação( +, -, *, /): ");
        String operacao = scanner.next();

        // SAÍDA DE DADOS
        switch (operacao){
            case "+":
                System.out.println("Soma: "+(num1 - num2));
                break;
            case "-":
                System.out.println("Subtração: "+(num1 - num2));
                break;
            case "*":
                System.out.println("Multiplicação: "+(num1 * num2));
                break;
            case "/":
                if (num2 != 0){
                    System.out.println("Divisão: "+(num1 / num2));
                    break;
                } else {
                    System.out.println("Não é possível dividir por zero");
                }
            default:
                System.out.println("Opção de operação invalida");
        }


        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
