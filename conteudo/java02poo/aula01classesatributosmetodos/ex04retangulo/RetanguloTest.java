package projeto201.conteudo.java02poo.aula01classesatributosmetodos.ex04retangulo;

import java.util.Scanner;

public class RetanguloTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calcule a área de um retangulo:");
        Retangulo retangulo = new Retangulo();

        System.out.println("Digite o tamanho da base do retângulo: ");
        retangulo.base = scanner.nextInt();

        System.out.println("Digite o tamanho da altura do retângulo: ");
        retangulo.altura = scanner.nextInt();

        scanner.close();
        
        retangulo.calculaArea();
    }
}
