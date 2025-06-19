package projeto201.conteudo.java01basico.aula09metodos.ex04media;

import java.util.Scanner;

public class Media {
    // Metodo soma
    static int soma(int[] notas){
        int soma = 0;
        for(int nota: notas){
            soma += nota;
        }
        return soma;
    }

    // Metodo media
    static double media(int[] notas){
        return soma(notas)/ notas.length;
    }

    public static void main(String[] args) {
        //scanner
        Scanner scanner = new Scanner(System.in);

        //declaração do array
        int[] notas = new int[4];

        //entrada de dados para o loop
        System.out.println("Digite suas 4 notas: ");
        for(int i = 0; i < notas.length; i++){
            System.out.println((i + 1)+"ª nota: ");
            notas[i] = scanner.nextInt();
        }
        scanner.close();

        System.out.println("\n A media das notas foi de "+media(notas));

    }
}
