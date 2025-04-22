package Projeto201.Conteudo.Java01BASICO.Aula11ExerciciosIntermediariosEAvancados.Ex04ManipulacaoDeArrays;

import java.util.Scanner;

public class ManipulacaoDeDados {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // variaveis
        int totAlunos = 10;
        int totNotas = 2;
        String[] alunos = new String[totAlunos];
        double[][] notas = new double[totAlunos][totNotas];

        // entrada de dados
        for (int i = 0; i < totAlunos; i++) {
            System.out.println("Digite o nome do aluno "+ (i + 1)+": ");
            alunos[i] = scanner.nextLine();

            for (int j = 0; j < totNotas; j++) {
                System.out.println("Digite a nota "+(j+1)+": ");
                notas[i][j] = scanner.nextDouble();
            }
            scanner.nextLine();
        }

        // Saída de dados
        System.out.println("\n--- TABELA DE NOTAS ---");
        System.out.printf("%-15s", "Aluno");
        for (int j = 0; j < totNotas; j++) {
            System.out.printf("Nota %d  ", j + 1);
        }
        System.out.println("Média");

        for (int i = 0; i < totAlunos; i++) {
            System.out.printf("%-15s", alunos[i]);
            double soma = 0;

            for (int j = 0; j < totNotas; j++) {
                System.out.printf("%-8.2f", notas[i][j]);
                soma += notas[i][j];
            }

            double media = soma / totNotas;
            System.out.printf("%.2f\n", media);
        }
        scanner.close();
    }
}
