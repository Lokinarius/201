package projeto201.conteudo.java01basico.aula10exercicioscombinados.ex04jogodeadivinhacao;

import java.util.Random;
import java.util.Scanner;

public class JogoDeAdvinhacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int numeroOculto = random.nextInt(100);
        int resposta;
        int tentativas = 0;

        System.out.println("JOGO DE ADIVINHAÇÃO");
        System.out.println("Tente adivinhar o número que foi advinhado");

        do{
            System.out.println("Digite seu número: ");
            resposta = scanner.nextInt();
            tentativas++;

            if(resposta > numeroOculto){
                System.out.println("É um número menor");
            } else if (resposta < numeroOculto) {
                System.out.println("É um número maior");
            } else {
                System.out.println("Parabéns! Você acertou o número "+ numeroOculto);
                System.out.println("Você tentou "+tentativas+" vezes");
            }
        }while(resposta != numeroOculto);

        scanner.close();
    }
}
