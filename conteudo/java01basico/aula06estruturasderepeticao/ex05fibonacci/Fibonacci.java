package projeto201.conteudo.java01basico.aula06estruturasderepeticao.ex05fibonacci;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite quantos termos da sequência de Fibonacci deseja ver: ");
        int termos = scanner.nextInt();

        int anterior = 0, atual = 1, proximo;

        System.out.print("Sequência de Fibonacci: " + anterior + ", " + atual);

        for (int i = 2; i < termos; i++) {
            proximo = anterior + atual;
            System.out.print(", " + proximo);
            anterior = atual;
            atual = proximo;
        }

        System.out.println();
        scanner.close();
    }
}
