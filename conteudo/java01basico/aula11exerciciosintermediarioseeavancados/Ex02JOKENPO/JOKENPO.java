package projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.Ex02JOKENPO;

import java.util.Random;
import java.util.Scanner;

public class JOKENPO {
    // Escolhas
    public static String jokepo(int opcao){
        switch(opcao){
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            default: return "Invalido";
        }
    }

    // Programa principal
    public static void main(String[] args) {
        // Imports
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Cabeçalho
        System.out.println("---- JO - KEN - PO ----");
        System.out.println("\nEscolha :");
        System.out.println("[1] - Pedra");
        System.out.println("[2] - Papel");
        System.out.println("[3] - Tesoura");

        // Escolha
        int escolha = scanner.nextInt();
        if(escolha < 1 || escolha > 3){
            System.out.println("Escolha inválida! Tente novamente");
            return;
        }
        int escolhaMaquina = random.nextInt(3) + 1;
        System.out.println("Você escolheu: "+jokepo(escolha));
        System.out.println("A máquina escolheu: "+jokepo(escolhaMaquina));

        // Resultado
        if(escolha == escolhaMaquina){
            System.out.println("Empate!");
        } else if (
                (escolha == 1 && escolhaMaquina == 3) ||
                (escolha == 2 && escolhaMaquina == 1) ||
                (escolha == 3 && escolhaMaquina == 2)
        ) {
            System.out.println("Você venceu!");
        }else{
            System.out.println("Você perdeu!");
        }
        scanner.close();
    }
}
