package projeto201.conteudo.java01basico.aula04operadoresrelacionais.Ex03Iguais;

import java.util.Scanner;

public class Iguais {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        // SAÍDA DE DADOS
        if(num1 == num2){
            System.out.println("Os dois números são iguais");
        }else{
            System.out.println("Os dois números são diferentes");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
