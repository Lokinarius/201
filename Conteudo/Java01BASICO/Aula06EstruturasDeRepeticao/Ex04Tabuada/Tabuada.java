package Projeto201.Conteudo.Java01BASICO.Aula06EstruturasDeRepeticao.Ex04Tabuada;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o número o qual você quer a tabuada: ");
        int num = scanner.nextInt();

        // SAÍDA DE DADOS
        for(int n = 1; n <= 10; n++){
            int mult = num * n;
            System.out.println(num+" x "+n+" = "+mult);
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
