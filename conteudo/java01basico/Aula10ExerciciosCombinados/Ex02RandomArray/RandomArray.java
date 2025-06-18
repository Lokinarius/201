package projeto201.conteudo.java01basico.Aula10ExerciciosCombinados.Ex02RandomArray;

import java.util.Random;

public class RandomArray {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();

        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100);
        }

        System.out.println("Números aleatórios dentro de um array: ");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }
    }
}
