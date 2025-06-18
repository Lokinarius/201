package projeto201.conteudo.java02poo.Aula05Encapsulamento.Ex03ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        // CONTAS
        ContaCorrente[] contas = new ContaCorrente[20];
        contas[0]  = new ContaCorrente("Leonardo", "01928375", "9283", 1500.0);
        contas[1]  = new ContaCorrente("William", "23455552", "0637", 1500.0);
        contas[2]  = new ContaCorrente("Honório", "92837456", "5739", 1500.0);
        contas[3]  = new ContaCorrente("Sabrina", "17264384", "3847", 1500.0);
        contas[4]  = new ContaCorrente("Brenda", "02193745", "0749", 1500.0);
        contas[5]  = new ContaCorrente("Carla", "12345678", "1985", 1500.0);
        contas[6]  = new ContaCorrente("João", "87654321", "2294", 1500.0);
        contas[7]  = new ContaCorrente("Lucas", "56789012", "3345", 1500.0);
        contas[8]  = new ContaCorrente("Fernanda", "34567890", "2944", 1500.0);
        contas[9]  = new ContaCorrente("Marcos", "45678901", "5501", 1500.0);
        contas[10] = new ContaCorrente("Paula", "98765432", "6666", 1500.0);
        contas[11] = new ContaCorrente("Thiago", "10293847", "7577", 1500.0);
        contas[12] = new ContaCorrente("Camila", "56473829", "8648", 1500.0);
        contas[13] = new ContaCorrente("Rafael", "38475629", "9279", 1500.0);
        contas[14] = new ContaCorrente("Isabela", "01928364", "1212", 1500.0);
        contas[15] = new ContaCorrente("Eduardo", "39485736", "3112", 1500.0);
        contas[16] = new ContaCorrente("Juliana", "95837264", "0605", 1500.0);
        contas[17] = new ContaCorrente("Daniel", "28475638", "7864", 1500.0);
        contas[18] = new ContaCorrente("Patrícia", "37485920", "0190", 1500.0);
        contas[19] = new ContaCorrente("Bruno", "92837465", "0000", 1500.0);

        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        int opcao;
        do {
            // Menu
            System.out.println("""
                    =========== MENU ==========
                    [1] - Acessar uma conta
                    [0] - Sair
                    ===========================
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:
                    System.out.println("Número da conta: ");
                    String numeroConta = scanner.nextLine();

                    System.out.println("Senha: ");
                    String senhaDigitada = scanner.nextLine();

                    ContaCorrente contaSelecionada = null;

                    for(ContaCorrente conta : contas) {
                        if (conta.getConta().equals(numeroConta) &&
                            conta.getSenha().equals(senhaDigitada)){
                            contaSelecionada = conta;
                            break;
                        }
                    }

                    if(contaSelecionada == null){
                        System.out.println("Número da conta ou senha incorreta!");
                        break;
                    }

                    // Conta logada
                    int operacao;
                    do{
                        System.out.println("""
                                --- Conta de %s ----
                                [1] - Ver dados da conta
                                [2] - Ver saldo
                                [3] - Depositar
                                [4] - Sacar
                                [0] - Sair da conta
                                ---------------------
                                """.formatted(contaSelecionada.getUsuario()));
                        operacao = scanner.nextInt();
                        scanner.nextLine();

                        // switch
                        switch(operacao){
                            case 1:
                                contaSelecionada.exibirDados();
                                break;
                            case 2:
                                System.out.println("Saldo atual: R$ %d".formatted(contaSelecionada.getSaldo()));
                            case 3:
                                System.out.println("Digite o valor para depósito: ");
                                double valorDeposito = scanner.nextDouble();
                                scanner.nextLine();
                                contaSelecionada.depositar(valorDeposito);
                                break;
                            case 4:
                                System.out.println("Digite o valor para saque: ");
                                double valorSaque = scanner.nextDouble();
                                scanner.nextDouble();
                                contaSelecionada.sacar(valorSaque);
                                break;
                            case 0:
                                System.out.println("Saindo da conta");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }

                    }while (operacao != 0);
                    break;

                case 0:
                    System.out.println("Encerrando o sistema. ");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }

        }while(opcao != 0);

        // FECHAMENTO DE SCANNER
        scanner.close();

    }
}
