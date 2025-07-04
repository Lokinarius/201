package projeto201.conteudo.java02poo.aula01classesatributosmetodos.ex03cemanos;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome e a idade da pessoa abaixo para saber quantos anos faltam para ela atingir " +
                "100 anos");
        Pessoa pessoa = new Pessoa();

        System.out.println("Nome: ");
        pessoa.nome = scanner.nextLine();

        System.out.println("Idade: ");
        pessoa.idade = scanner.nextInt();

        scanner.close();

        pessoa.seculo();

    }
}
