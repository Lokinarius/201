package projeto201.conteudo.java01basico.aula09metodos.ex02fatorial;

import java.util.Scanner;

public class Fatorial {
    static int calculoFatorial(int num){
        int fatorial = 1;
        for (int i = 2; i <= num; i++){
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para calcular o fatorial: ");
        int numero = scanner.nextInt();

        if(numero < 0){
            System.out.println("Fatorial não é definido para números negativos.");
        }else{
            int resultado = calculoFatorial(numero);
            System.out.println("O fatorial de "+numero+" é:"+resultado);
        }

        scanner.close();
    }
}
