package Projeto201.Conteudo.Java01BASICO.Aula07ComandosDeControle.Ex04SwitchCase;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Digite um número de 1 a 7, para ver seu respectivo dia da semana");
            int sem = scanner.nextInt();
            switch (sem){
                case 1:
                    System.out.println("Domingo");
                    return;
                case 2:
                    System.out.println("Segunda-Feira");
                    return;
                case 3:
                    System.out.println("Terça-Feira");
                    return;
                case 4:
                    System.out.println("Quarta-Feira");
                    return;
                case 5:
                    System.out.println("Quinta-Feira");
                    return;
                case 6:
                    System.out.println("Sexta-Feira");
                    return;
                case 7:
                    System.out.println("Sábado");
                    return;
                default:
                    System.out.println("Opção inválida");
            }
        }
    }
}
