package projeto201.conteudo.java01basico.Aula10ExerciciosCombinados.Ex05SomaMatriz;

import java.util.Scanner;

public class SomaMatriz {

    // METODO PARA EXIBIR MATRIZ
    public static void exibirMatriz(int[][] matriz) {
        for (int[] linha : matriz) {
            for (int valor : linha) {
                System.out.println(valor+" ");
            }
            System.out.println();
        }
    }

    // METODO PRINCIPAL
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matriz = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        
        int somaMatriz = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                somaMatriz += matriz[i][j];
            }
        }

        System.out.println("Matriz 3x3:");
        exibirMatriz(matriz);
        System.out.println("Soma dos elementos: "+somaMatriz);
        System.out.println("--------------------------------");

        int[][] matrizUser = new int[3][3];
        int somaUser = 0;

        System.out.println("Insira novos valores para a matriz");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("Digite o valor para posição ["+i+"]["+j+"]: ");
                matrizUser[i][j] = scanner.nextInt();
                somaUser += matrizUser[i][j];
            }
        }

        System.out.println("\n Matriz digitada pelo usuário: ");
        exibirMatriz(matrizUser);
        System.out.println("Soma dos elementos: "+somaUser);
    }
}
