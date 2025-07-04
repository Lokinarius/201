package projeto201.conteudo.java02poo.aula01classesatributosmetodos.ex02dadoscomscanner;

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
        for (int i = 0; i < totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+(i+1)+": ");

            Pessoa pessoa = new Pessoa();

            System.out.println("Nome: ");
            pessoa.nome = scanner.nextLine();

            System.out.println("Sexo: ");
            String sexoI = scanner.nextLine();
            if(!sexoI.isEmpty()){
                pessoa.sexo = sexoI.charAt(0);
            }

            System.out.println("Idade: ");
            pessoa.idade = scanner.nextInt();

            System.out.println("Altura: ");
            pessoa.altura = scanner.nextDouble();
            scanner.nextLine();

            pessoas.add(pessoa);

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
