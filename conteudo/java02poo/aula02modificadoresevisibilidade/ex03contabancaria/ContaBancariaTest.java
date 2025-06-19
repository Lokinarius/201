package projeto201.conteudo.java02poo.aula02modificadoresevisibilidade.ex03contabancaria;

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
            conta.usuario = scanner.nextLine();

            System.out.println("Número da conta: ");
            conta.conta = scanner.nextInt();

            System.out.println("Saldo da conta: ");
            conta.saldo = scanner.nextDouble();
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
                    System.out.println("Buscar por nome ou uma conta? ");
                    int tipoDeBusca = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;

                    // tipo de busca
                    if (tipoDeBusca == 1){
                        // prucarando o nome
                        System.out.println("Digite o nome do usuário: ");
                        String nomeBusca = scanner.nextLine();
                        for (ContaBancaria conta : contas){
                            if (conta.usuario.equalsIgnoreCase(nomeBusca)){
                                conta.exibirSaldo();
                                encontrado = true;
                                break;
                            }
                        }
                    } else if (tipoDeBusca == 2) {
                        // procurando o número da conta
                        System.out.println("Digite o número da conta: ");
                        int numeroBusca = scanner.nextInt();
                        for (ContaBancaria conta : contas){
                            if (conta.conta == numeroBusca){
                                conta.exibirSaldo();
                                encontrado = true;
                                break;
                            }
                        }
                    }else{
                        System.out.println("Opção de busca inválida");
                    }

                    // não encontrado
                    if (!encontrado){
                        System.out.println("Conta não existe");
                    }
                    break;

                case 2:
                    System.out.println("\n--- Todas as Contas Cadastradas ---");
                    for (ContaBancaria conta : contas){
                        conta.exibirSaldo();
                        System.out.println("----------------------");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }

        }while(opcao != 0);

        scanner.close();

    }
}
