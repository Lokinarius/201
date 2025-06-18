package projeto201.conteudo.java01basico.Aula10ExerciciosCombinados.Ex01MediaTurma;

import java.util.Scanner;

public class MediaTurma {

    // Metodo Media Aluno
    public static double calcularMediaAluno(double[] notas){
        double soma = 0;
        for(double nota: notas){
            soma+= nota;
        }
        return soma/ notas.length;
    }

    // Metodo Media Turma
    public static double calcularMediaTurma(double[] mediaAluno){
        double somaMedia = 0;
        for(double media: mediaAluno){
            somaMedia += media;
        }
        return somaMedia / mediaAluno.length;
    }

    // Programa principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Numero de alunos e notas
        System.out.println("Digite o número de alunos");
        int totAlunos = scanner.nextInt();
        System.out.println("Digite o número de notas por aluno:");
        int totNotas = scanner.nextInt();
        double[][] notas = new double[totAlunos][totNotas];
        double[] mediaAluno = new double[totAlunos];

        // Notas
        for (int i = 0; i < totAlunos; i++) {
            System.out.println("Aluno "+(i+1)+":");
            for (int j = 0; j < totNotas; j++) {
                System.out.println("Digite a nota "+(j+1)+":");
                notas[i][j] = scanner.nextDouble();
                if(notas[i][j] < 0 || notas[i][j] > 10){
                    System.out.println("Digite uma nota entre 0 e 10");
                    j--;
                }
            }
            mediaAluno[i] = calcularMediaAluno(notas[i]);
        }
        // Saída de dados
        // Media do aluno
        System.out.println("\nMédia de cada aluno: ");
        for (int i = 0; i < totAlunos; i++) {
            System.out.println("Aluno "+(i+1)+": "+mediaAluno[i]);
        }
        //Media geral
        double mediaTurma = calcularMediaTurma(mediaAluno);
        System.out.println("\nA média da turma é: "+mediaTurma);

        scanner.close();
    }
}
