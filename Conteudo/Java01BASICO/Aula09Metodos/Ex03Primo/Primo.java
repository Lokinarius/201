package Projeto201.Conteudo.Java01BASICO.Aula09Metodos.Ex03Primo;

import java.util.Scanner;

public class Primo {
    static boolean primo(int num){
        if( num < 2) return false;
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para verificar se ele é primo: ");
        int numero = scanner.nextInt();

        if(primo(numero)) {
            System.out.println(numero+ " é primo");
        }else{
            System.out.println(numero+" não é primo");
        }

        scanner.close();
    }
}
