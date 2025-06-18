package projeto201.conteudo.java01basico.Aula05EstruturasCondicionais.Ex02Maior;

import java.util.Scanner;

public class Maior {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADAS DE DADOS
        System.out.println("Informe o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Informe o segundo número: ");
        int num2 = scanner.nextInt();
        System.out.println("Informe o terceiro número: ");
        int num3 = scanner.nextInt();

        // SAÍDA DE DADOS
        if (num1 > num2 && num1 > num3){
            System.out.println("O "+num1+" foi o maior número informado");
        } else if (num2 > num1 && num2 > num3) {
            System.out.println("O "+num2+" foi o maior número informado");
        } else if (num3 > num1 && num3 > num2) {
            System.out.println("O "+num3+" foi o maior número informado");
        } else {
            System.out.println("Foram informados pelo menos dois valores iguais");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
