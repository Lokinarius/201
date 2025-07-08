package projeto201.conteudo.java02poo.aula04gettersesetters.ex02contabancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Quantos usuários deseja cadastrar? ");
        int totUser = Integer.parseInt(scanner.nextLine());

        ContaBancaria[] contas = new ContaBancaria[totUser];

        // CADASTRO
        for (int i = 0; i < totUser; i++) {
            System.out.println("\nCadastro da pessoa "+(i+1)+": ");

            System.out.println("Nome do usuário: ");
            String nome = scanner.nextLine();

            System.out.println("Número da conta: ");
            int numeroConta = Integer.parseInt(scanner.nextLine());

            double saldo = 0;
            boolean saldoValido = false;

            while(!saldoValido){
                System.out.println("Saldo da conta: ");
                String entrada = scanner.nextLine();
                try {
                    saldo = Double.parseDouble(entrada);
                    if (saldo > 0) {
                        saldoValido = true;
                    } else {
                        System.out.println("Saldo negativo!");
                    }
                } catch (NumberFormatException e) {
                    System.out.println("Formato inválido! Digite um número decimal.");
                }
            }
            contas[i] = new ContaBancaria(nome, numeroConta, saldo);
            System.out.println();
        }

        // MENU
        int opcao;
        do{
            //menu
            System.out.println("""
                    ============= MENU ============
                    [1] - Ver dados de uma conta
                    [2] - Ver todas as contas"
                    [0] - Sair
                    ===============================
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // switch
            switch(opcao){
                case 1:
                    System.out.println("Buscar por nome ou conta?[1/2] ");
                    int tipoDeBusca = scanner.nextInt();
                    scanner.nextLine();
                    boolean encontrado = false;

                    // tipo de busca
                    if (tipoDeBusca == 1){
                        // procurando nome
                        System.out.println("Digite o nome do proprietário: ");
                        String nomeBusca = scanner.nextLine();

                        for (ContaBancaria conta : contas){
                            if(conta.usuario.equalsIgnoreCase(nomeBusca)){
                                conta.exibirDados();
                                encontrado = true;
                                break;
                            }
                        }
                    } else if (tipoDeBusca == 2) {
                        // procurando pelo número da conta
                        System.out.println("Digite o número da conta");
                        int numeroBusca = scanner.nextInt();
                        scanner.nextLine();

                        for(ContaBancaria conta: contas){
                            conta.exibirDados();
                            encontrado = true;
                            break;
                        }
                    }else{
                        System.out.println("Opção de busca inválida");
                    }
                    break;

                case 2:
                    System.out.println("\n --- Todas contas cadastradas --- ");
                    for(ContaBancaria conta : contas){
                        conta.exibirDados();
                        System.out.println("---------------------------");
                    }
                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
