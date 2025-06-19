package projeto201.conteudo.java02poo.aula04gettersesetters.ex02contabancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Quantos usuários deseja cadastras? ");
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

            double saldo = 0;
            boolean saldoValido = false;
            while(!saldoValido){
                System.out.println("Saldo da conta: ");
                String entrada = scanner.nextLine();
                saldo = Double.parseDouble(entrada);
                if (saldo > 0){
                    saldoValido = true;
                }else{
                    System.out.println("Saldo negativo!");
                }
            }
            contas[i] = new ContaBancaria(conta.usuario, conta.conta,conta.saldo);
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
                    System.out.println("Buscar por nome ou conta? ");
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
                        for(ContaBancaria conta: contas){
                            conta.exibirDados();
                            encontrado = true;
                            break;
                        }
                    }else{
                        System.out.println("Opção de busca inválida");
                    }
                case 2:
                    System.out.println("\n --- Todas contas cadastradas --- ");
                    for(ContaBancaria conta : contas){
                        conta.exibirDados();
                        System.out.println("---------------------------");
                    }
                    break;
                case 0:
                    System.out.println("Saindo...");
                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
