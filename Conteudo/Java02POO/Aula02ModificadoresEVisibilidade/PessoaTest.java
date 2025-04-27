package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade;

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
        for (int i = 1; i < totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+i+": ");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            System.out.println("Idade: ");
            int idade = scanner.nextInt();

            System.out.println("Sexo: ");
            String sexo = scanner.nextLine();

            System.out.println("Altura: ");
            double altura = scanner.nextDouble();
        }
        // FECHAMENTO DO SCANNER
        scanner.close();

        // SAÍDA DE DADOS
        System.out.println("=== Pessoas Cadastradas ===");
        for (Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("-------------------");
        }
    }
}
