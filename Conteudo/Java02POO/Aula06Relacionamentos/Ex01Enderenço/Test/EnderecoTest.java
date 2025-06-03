package Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex01Enderenço.Test;

import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex01Enderenço.Domain.Endereco;
import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex01Enderenço.Domain.Pessoa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EnderecoTest {
    public static void main(String[] args) {
        // DADOS
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Alice", 123456789, new Endereco("Sobral", "Centro", "Rua das Flores", 101)));
        pessoas.add(new Pessoa("Bruno", 987654321, new Endereco("Fortaleza", "Meireles", "Av. Beira Mar", 200)));
        pessoas.add(new Pessoa("Carla", 111222333, new Endereco("Juazeiro", "Salesianos", "Rua São Pedro", 55)));
        pessoas.add(new Pessoa("Daniel", 444555666, new Endereco("Crato", "Pimenta", "Rua das Palmeiras", 78)));
        pessoas.add(new Pessoa("Eduarda", 777888999, new Endereco("Tianguá", "Centro", "Rua Projetada", 32)));
        pessoas.add(new Pessoa("Felipe", 121314151, new Endereco("Sobral", "Dom Expedito", "Rua Nova", 8)));
        pessoas.add(new Pessoa("Gabriela", 161718192, new Endereco("Fortaleza", "Aldeota", "Av. Santos Dumont", 999)));

        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        int opcao;
        do{
            // Menu
            System.out.println("""
                    ======= \tMENU \t=======
                    [1] - Verificar o endereço de uma pessoa
                    [2] - Adicionar uma pessoa ao sistema
                    [3] - Remover uma pessoa do sistema
                    [0] - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:

                case 2:
                    System.out.println("Digite o nome da nova pessoa a ser cadastrada: ");
                    String novoNome = scanner.nextLine();

                    System.out.println("Digite o CPF da nova pessoa: ");
                    int novoCpf = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Digite a Cidade onde ela vive: ");
                    String novaCidade = scanner.nextLine();

                    System.out.println("Digite o Bairro onde ela mora: ");
                    String novoBairro = scanner.nextLine();

                    System.out.println("Digite a rua onde ela mora: ");
                    String novaRua = scanner.nextLine();

                    System.out.println("Digite o número do endereço: ");
                    int novoNumero = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa novaPessoa = new Pessoa(novoNome,novoCpf,new Endereco(novaCidade,novoBairro,novaRua,
                            novoNumero));
                    pessoas.add(novaPessoa);
                    System.out.println(novoNome+" Adicionada a lista");
                    break;

                case 3:
                    System.out.println("Digite o CPF da pessoa a ser removida");
                    int cpfRemover = scanner.nextInt();

                    Endereco pessoaRemover = null;
                    for(Pessoa p: pessoas){
                        if(p.getCpf().equalsIgnoreCase(cpfRemover)){
                            pessoaRemover = p;
                            break;
                        }
                    }

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");

            }

        }while(opcao != 0);

        // FECHAMENTO DE SCANNER
        scanner.close();

    }
}
