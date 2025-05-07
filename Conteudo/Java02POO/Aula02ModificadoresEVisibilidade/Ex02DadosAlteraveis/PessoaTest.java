package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex02DadosAlteraveis;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner();

        System.out.println("Quantas pessoas deseja cadastrar? ");
        int totPessoas = scanner.nextInt();
        scanner.nextLine();
        Pessoa[] pessoas = new Pessoa[totPessoas];

        for (int i = 0; i < totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+(i+1)+":");
            Pessoa pessoa = new Pessoa();

            // Nome
            System.out.println("Nome: ");
            pessoa.setNome(scanner.nextLine());

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
                        pessoa.setSexo(sexoChar);
                    }else{
                        System.out.println("Digite 'M' ou 'F'.");
                    }
                }else{
                    System.out.println("O campo está vazio");
                }
            }

            // Idade
            System.out.println("Idade: ");
            pessoa.setIdade(scanner.nextInt());

            // Altura
            System.out.println("Altura: ");
            pessoa.setAltura(scanner.nextDouble());

            scanner.nextLine();
            pessoas[i] = pessoa;
        }

        // MENU INTERATIVO
        int opcao;
        do{

        }while(opcao != o);

        scanner.close();
    }
}
