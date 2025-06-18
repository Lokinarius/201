package projeto201.conteudo.java01basico.Aula07ComandosDeControle.Ex03Switch;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        while(true){
            System.out.println("Escolha uma classe de RPG");
            System.out.println("[1] Guerreiro");
            System.out.println("[2] Mago");
            System.out.println("[3] Ladino");
            System.out.println("[4] Clérigo");

            int escolha = scanner.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("Você escolheu  ser um Guerreiro");
                    return;
                case 2:
                    System.out.println("Você escolheu  ser um Mago");
                    return;
                case 3:
                    System.out.println("Você escolheu  ser um Ladino");
                    return;
                case 4:
                    System.out.println("Você escolheu  ser um Clérigo");
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
