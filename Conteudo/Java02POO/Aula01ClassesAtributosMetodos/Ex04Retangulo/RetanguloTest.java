package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos.Ex04Retangulo;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule a área de um retangulo:");
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o tamanho da base do retângulo: ");
        int base = scanner.nextInt();

        System.out.println("Digite o tamanho da altura do retângulo: ");
        int altura = scanner.nextInt();

        scanner.close();
        
        retangulo.calculaArea();
    }
}
