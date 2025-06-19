package projeto201.conteudo.java01basico.aula04operadoresrelacionais.ex02divisivel;

import java.util.Scanner;

public class Divisivel {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o número a ser dividido: ");
        int num1 = scanner.nextInt();
        System.out.println("Digite o número a dividir: ");
        int num2 = scanner.nextInt();

        // SAÍDA DE DADOS
        if(num1 %num2 == 0){
            System.out.println("O número "+num1+" é divisível por "+num2+" e o seu resultado é "+num1/num2);
        }else{
            System.out.println("O número "+num1+"não é divisivel por "+num2);
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
