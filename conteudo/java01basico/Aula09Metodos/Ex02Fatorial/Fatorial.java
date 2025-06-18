package projeto201.conteudo.java01basico.Aula09Metodos.Ex02Fatorial;

import java.util.Scanner;

public class Fatorial {
    static int calculoFatorial(int num){
        int fatorial = 1;
        for (int i = 1; i <= num; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();
        int resultado = calculoFatorial(numero);

        System.out.println("O fatorial de "+numero+" é: "+resultado);

        scanner.close();
    }
}
