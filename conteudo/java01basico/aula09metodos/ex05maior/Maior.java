package projeto201.conteudo.java01basico.aula09metodos.ex05maior;

import java.util.Scanner;

public class Maior {
    //Metodo maior
    static int maior(int num1, int num2){
        if (num1 > num2){
            System.out.println("O "+num1+" é o maior número");
            return num1;
        } else if (num2 > num1) {
            System.out.println("O "+num2+" é o maior número");
            return num2;
        }else{
            System.out.println("Os dois número são iguais");
            return num1;
        }
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();

        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();
        maior(num1,num2);

        scanner.close();

    }
}
