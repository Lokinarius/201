package Projeto201.Conteudo.Java01BASICO.Aula04OperadoresRelacionais.Ex01MaiorEMenor;

import java.util.Scanner;
//  Os Operadores relacionais possuem uma estrutura mais elaborada que um ternario, possuem uma melhor legibilidade,
//  e maoir facilidade de manutenção
public class MaiorEMenor {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o primeiro número: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o segundo número: ");
        int num2 = scanner.nextInt();


        // SAÍDA DE DADOS
        if (num1 > num2) {
            System.out.println("O número "+num1+" é maior que o número "+num2);
        } else if (num2 < num1) {
            System.out.println("O número "+num2+" é maior que o número "+num1);
        }else {
            System.out.println("Os dois números são iguais");
        }

        // FECHAMENTO DO SCANNER
        scanner.close();
    }
}
