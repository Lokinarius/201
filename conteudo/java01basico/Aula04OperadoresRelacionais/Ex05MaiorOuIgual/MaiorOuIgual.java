package projeto201.conteudo.java01basico.Aula04OperadoresRelacionais.Ex05MaiorOuIgual;

import java.util.Scanner;

public class MaiorOuIgual {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();

        //

        // SAÍDA DE DADOS
        if( num1 >= num2){
            System.out.println("O primeiro número é maior ou igual ao segundo número");
        }else{
            System.out.println("O primeiro número é menor que o segundo número");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
