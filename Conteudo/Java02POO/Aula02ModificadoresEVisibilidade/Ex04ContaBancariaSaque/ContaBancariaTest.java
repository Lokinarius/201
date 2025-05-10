package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex04ContaBancariaSaque;

import Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex04ContaBancariaSaque.ContaBancaria;

import java.util.Scanner;

public class ContaBancariaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // CONTAS
        ContaBancaria conta1 = new ContaBancaria("William",1000,"837495",5444.0);
        ContaBancaria conta2 = new ContaBancaria("Silvia",3000,"324567",9982.0);
        ContaBancaria conta3 = new ContaBancaria("Pedro",4000,"998753",2222.0);
        ContaBancaria conta4 = new ContaBancaria("Bárbara",8000,"378593",4000.0);

        // ARRAY DAS CONTAS
        ContaBancaria[] contas = {conta1,conta2,conta3,conta4};

        // MENU INTERATIVO
        int opcao;
        do{
            // MENU
            System.out.println("\n========= MENU =========");
            System.out.println("[1] - Ver dados da conta");
            System.out.println("[2] - Realizar depósito");
            System.out.println("[3] - Realizar saque");
            System.out.println("[0] - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            //SWITCH
            switch(opcao){
                case 1:
                    acessarConta(scanner, contas,"exibir");
                    break;
                case 2:
                    acessarConta(scanner,contas,"depositar");
                    break;
                case 3:
                    acessarConta(scanner,contas,"sacar");
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        // FECHAMENTO DO SCANNER
        scanner.close();
    }

    public static void acessarConta(Scanner scanner, ContaBancaria[] contas, String operacao){
        // Número da conta
        System.out.println("Digite o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine();

        ContaBancaria contaSelecionada = null;
        for(ContaBancaria conta : contas){
            if(conta.getConta() == numeroConta){
                contaSelecionada = conta;
                break;
            }
        }
        if(contaSelecionada == null){
            System.out.println("Conta não encontrada");
            return;
        }

        // Número da Senha
        System.out.println("Digite a senha de 6 digitos: ");
        String senha = scanner.nextLine();

        if (!senha.matches("\\d{6}")){
            System.out.println("A senha deve conter 6 dígitos");
            return;
        }
        if(!contaSelecionada.validarSenha(senha)){
            System.out.println("Senha incorreta. Acesso negado.");
            return;
        }

        // SWITCH
        switch(operacao){
            case "ver":
                contaSelecionada.exibirSaldo();
                break;
            case "depositar":
                System.out.println("Valor do depósito: ");
                double valorDep = scanner.nextDouble();
                scanner.nextLine();
                if (contaSelecionada.depositar(valorDep)){
                    System.out.println("Depósito realizado com sucesso");
                    contaSelecionada.exibirSaldo();
                }else{
                    System.out.println("Valor inválido");
                }
                break;
            case "sacar":
                System.out.println("valor do saque: ");
                double valorSaq = scanner.nextDouble();
                scanner.nextLine();
                if (contaSelecionada.sacar(valorSaq)){
                    System.out.println("saque realizado com sucesso");
                    contaSelecionada.exibirSaldo();
                }else{
                    System.out.println("Valor inválido");
                }
                break;
        }
    }
}
