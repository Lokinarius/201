package Projeto201.Conteudo.Java02POO.Aula05Encapsulamento.Ex03ContaCorrente;

import java.util.Scanner;

public class ContaCorrenteTest {
    public static void main(String[] args) {
        // CONTAS
        ContaCorrente[] contas = new ContaCorrente[5];
        contas[0] = new ContaCorrente("Leonardo","01928375","9283",1500.0);
        contas[1] = new ContaCorrente("William","23455552","0637",1500.0);
        contas[2] = new ContaCorrente("Honório","92837456","5739",1500.0);
        contas[3] = new ContaCorrente("Sabrina","17264384","3847",1500.0);
        contas[4] = new ContaCorrente("Brenda","02193745","0749",1500.0);

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
            }

        }while(opcao != 0);



        // SAÍDA DE DADOS

        // FECHAMENTO DE SCANNER
    }
}
