package projeto201.conteudo.java01basico.aula08arrays.ex02somarray;

import java.util.Scanner;

public class SomaArray {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Informe a quantidade de elementos do array");
        int total = scanner.nextInt();
        // Preenchemento de Array
        int[] num = new int[total];
        for(int i = 0; i < num.length;i++){
            System.out.println("Digite o "+(i+1)+"ª número");
            num[i] = scanner.nextInt();
        }

        // SOMA
        int soma = 0;
        for(int i = 0; i < num.length;i++){
            soma += num[i];
        }

        // SAÍDA DE DADOS
        System.out.println("A soma de todos os elementos do array é: "+soma);
    }
}
