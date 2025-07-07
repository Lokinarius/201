package projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.ex01sistemabancario;

import java.util.Scanner;

public class SistemaBancario {
    // CLASSE CONTA BANCARIA
    static class ContaBancaria{
        private String user;
        private double saldo;

        // Metodo construtor
        public ContaBancaria(String user) {
            this.user = user;
            this.saldo = 0.0;
        }

        // Metodo depositar
        public void depositar(double valor){
            if(valor > 0){
                saldo += valor;
                System.out.println("Depósito de R$ "+valor+" realizado!");
            } else {
                System.out.println("Valor inválido!");
            }
        }

        // Metodo sacar
        public void sacar(double valor){
            if(valor>0 && valor <= saldo){
                saldo -= valor;
                System.out.println("Saque de R$ "+valor+" realizado!");
            }else{
                System.out.println("Saldo insuficiente!");
            }
        }

        // Metodo exibir
        public void exibirSaldo(){
            System.out.println("Seu saldo atual é de R$: "+saldo);
        }
    }

    // CLASSE PRINCIPAL
    public static void main(String[] args) {
        // CABEÇALHO
        Scanner scanner = new Scanner(System.in);
        System.out.println("== BANCO LOKINARIUS ==");
        System.out.println("Digite seu usuário: ");
        String nome = scanner.nextLine();

        ContaBancaria conta = new ContaBancaria(nome);

        int escolha;
        do {
            // MENU
            System.out.println("---------- MENU ----------");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - Saldo");
            System.out.println("0 - Sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();

            // SWITCH DE ESCOLHAS
            switch(escolha){
                case 1:
                    System.out.println("Digite o valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 2:
                    System.out.println("Digite o valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 3:
                    conta.exibirSaldo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida.");
            }
        }while(escolha != 0);
        scanner.close();
    }
}
