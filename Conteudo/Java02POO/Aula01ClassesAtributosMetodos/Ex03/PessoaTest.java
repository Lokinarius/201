package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos.Ex03;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome e a idade da pessoa abaixo para saber quantos anos faltam para ela atingir " +
                "100 anos");
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Idade: ");
        int idade = scanner.nextInt();

        scanner.close();

        pessoa.seculo();

    }
}
