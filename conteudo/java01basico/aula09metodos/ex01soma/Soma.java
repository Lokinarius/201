package projeto201.conteudo.java01basico.aula09metodos.ex01soma;

import java.util.Scanner;

public class Soma {
    static int soma(int a, int b){
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o primeiro número: ");
        int a = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = scanner.nextInt();
        System.out.println("O resultado da soma é: " + soma(a,b));
    }
}
