package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos;

import java.util.ArrayList;
import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // CADASTRO
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        System.out.println("Quantas pessoas deseja cadastrar? ");
        int totPessoas = scanner.nextInt();
        scanner.nextLine();
        for (int i = 1; i <= totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+i+":");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();
            scanner.nextLine();

            Pessoa pessoa = new Pessoa(nome,idade);
            System.out.println();
        }
        // FECHAMENTO DE SCANNER
        scanner.close();

        // SAÍDA DE DADOS
        System.out.println("=== Pessoas Cadastradas ===");
        for(Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("----------------");
        }
    }
}
