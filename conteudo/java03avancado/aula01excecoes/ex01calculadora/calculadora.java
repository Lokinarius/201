package projeto201.conteudo.java03avancado.aula01excecoes.ex01calculadora;

import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try{
            // CALCULADORA
            System.out.println("Digite o primeiro número: ");
            int num1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int num2 = scanner.nextInt();

            System.out.println("Escolha a operação (+, -, *, /)");
            char operacao = scanner.next().charAt(0);

            int resultado = 0;

            switch(operacao){
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    resultado = num1 / num2;
                    break;
                default:
                    System.out.println("Operação inválida");
                    return;
            }
            System.out.println("Resultado: "+resultado);

        }catch(ArithmeticException e){
            System.out.println("Erro: Não é possível dividir por zero.");
        }catch (Exception e){
            System.out.println("Erro inesperado: "+ e.getMessage());
        }finally{
            System.out.println("Saindo...");
            scanner.close();
        }
    }
}
