package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex02DadosAlteraveis;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoas deseja cadastrar? ");
        int totPessoas = scanner.nextInt();
        scanner.nextLine();
        Pessoa[] pessoas = new Pessoa[totPessoas];

        for (int i = 0; i < totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+(i+1)+":");
            Pessoa pessoa = new Pessoa();

            // Nome
            System.out.println("Nome: ");
            pessoa.nome = scanner.nextLine();

            // Sexo
            char sexoChar = '\0';
            boolean sexoValido = false;
            while (!sexoValido){
                System.out.println("Sexo: ");
                String sexoI = scanner.nextLine();
                if (!sexoI.isEmpty()){
                    sexoChar = Character.toUpperCase(sexoI.charAt(0));
                    if(sexoChar == 'M' || sexoChar == 'F'){
                        sexoValido = true;
                        pessoa.sexo = sexoChar;
                    }else{
                        System.out.println("Digite 'M' ou 'F'.");
                    }
                }else{
                    System.out.println("O campo está vazio");
                }
            }

            // Idade
            System.out.println("Idade: ");
            pessoa.idade = scanner.nextInt();

            // Altura
            System.out.println("Altura: ");
            pessoa.altura = scanner.nextDouble();

            scanner.nextLine();
            pessoas[i] = pessoa;
        }

        // MENU INTERATIVO
        int opcao;
        do{
            // Menu
            System.out.println("\n==== MENU ====");
            System.out.println("[1] - Exibir todas pessoas");
            System.out.println("[2] - Alterar idade");
            System.out.println("[3] - Alterar nome");
            System.out.println("[0] - Sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:
                    System.out.println("=== Lista de Pessoas Cadastradas ===");
                    for (int i = 0; i < pessoas.length; i++) {
                        System.out.println("Pessoa "+(i+1)+":");
                        pessoas[i].exibirDados();
                        System.out.println("-------------------");
                    }
                    break;
                case 2:
                    System.out.println("Digite a posição da pessoa: ");
                    int posIdade = scanner.nextInt() - 1;
                    if (posIdade >= 0 && posIdade < totPessoas){
                        System.out.println("Nova idade: ");
                        int novaIdade = scanner.nextInt();
                        pessoas[posIdade].alterarIdade(novaIdade);
                    }else{
                        System.out.println("Posição invalida.");
                    }
                    break;
                case 3:
                    System.out.println("Digite a posição da pessoa: ");
                    int posNome = scanner.nextInt() - 1;
                    scanner.nextLine();
                    if(posNome >= 0 && posNome < totPessoas){
                        System.out.println("Novo nome: ");
                        String novoNome = scanner.nextLine();
                        pessoas[posNome].alterarNome(novoNome);
                    }else{
                        System.out.println("Posição invalida.");
                    }
                    break;
                case 0:
                    System.out.println("Encerrando o programa.");
                    break;
                default:
                    System.out.println("Opção invalida.");
            }
        }while(opcao != 0);

        // Fechamento de scanner
        scanner.close();
    }
}
