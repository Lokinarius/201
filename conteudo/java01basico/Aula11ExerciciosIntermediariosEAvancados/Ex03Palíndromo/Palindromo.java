package projeto201.conteudo.java01basico.Aula11ExerciciosIntermediariosEAvancados.Ex03Palíndromo;

import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite uma palavra");
        String palavra = scanner.nextLine();
        String palavraFormatada = palavra.replaceAll("\\s+","").toLowerCase();
        StringBuilder inverso = new StringBuilder(palavraFormatada).reverse();

        if(palavraFormatada.equals(inverso.toString())){
            System.out.println("É um palíndromo.");
        }else{
            System.out.println("Não é um palíndromo.");
        }
        scanner.close();
    }
}
