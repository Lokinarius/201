package projeto201.conteudo.java01basico.Aula08Arrays.Ex04ArrayCrescente;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayCrescente {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        // tamanho do array
        System.out.println("Informe a quantidade de elementos do array: ");
        int total = scanner.nextInt();
        int num[] = new int[total];
        // elementos do array
        for(int i = 0; i < total;i++){
            System.out.println("Digite o "+(i + 1)+"ª número: ");
            num[i] = scanner.nextInt();
        }
        // Ordenamento do array
        Arrays.sort(num);
        System.out.println("Números em ordem crescente: ");
        for (int n : num){
            System.out.println(n+" ");
        }
        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
