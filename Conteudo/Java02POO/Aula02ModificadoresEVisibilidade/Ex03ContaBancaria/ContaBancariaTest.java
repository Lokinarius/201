package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex03ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas usuários deseja cadastrar? ");
        int totUser = scanner.nextInt();
        scanner.nextLine();

        ContaBancaria[] contas = new ContaBancaria[totUser];

        // CADASTRO
        for (int i = 0; i < totUser; i++) {
            System.out.println("\nCadastro da pessoa "+(i+1)+": ");
            ContaBancaria conta = new ContaBancaria();

            System.out.println("Nome do usuário: ");
            conta.setUsuario(scanner.nextLine());

            System.out.println("Número da conta: ");
            conta.setConta(scanner.nextInt());

            System.out.println("Saldo da conta: ");
            conta.setSaldo(scanner.nextDouble());
            scanner.nextLine();

            contas[i] = conta;
        }

        // MENU
        int opcao;
        do{
            // menu
            System.out.println("===== MENU =====");
            System.out.println("[1] - Ver dados de uma conta");
            System.out.println("[2] - Ver todas as contas");
            System.out.println("[0] - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            // switch
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 0:
                    break;
                default:
            }

        }while(opcao != 0);

        scanner.close();

    }
}
