package projeto201.conteudo.java01basico.aula08arrays.Ex03MaiorEMenorArray;

import java.util.Scanner;

public class MaiorEMenor {
    public static void main(String[] args) {
        // ABERTURA DE DADOS
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Informe a quantidade de elementos do array");
        int total = scanner.nextInt();
        int[] num = new int[total];
        int maior = num[0];
        int menor = num[0];
        for(int i = 0; i < num.length;i++){
            System.out.println("Digite o "+(i+1)+"ª número");
            num[i] = scanner.nextInt();
            // lógica para maior e menor número
            if (num[i] > maior){
                maior = num[i];
            }
            if (num[i] < menor){
                menor = num[i];
            }

        }
        // SAÍDA DE DADOS
        System.out.println("O maior número informado foi "+maior+"e o menor número informado foi "+menor);

        // FECHAMENTO DO SCANNER
        scanner.close();
    }
}
