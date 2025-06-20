package projeto201.conteudo.java02poo.aula06relacionamentos.ex01endereco.test;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex01endereco.domain.Endereco;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex01endereco.domain.Pessoa;

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
                    System.out.println("CPF da pessoa: ");
                    int cpfPessoa = scanner.nextInt();
                    scanner.nextLine();

                    Pessoa pessoaSelecionada = null;

                    for(Pessoa p: pessoas){
                        if(p.getCpf() == cpfPessoa){
                            pessoaSelecionada = p;
                            break;
                        }
                    }

                    if(pessoaSelecionada != null){
                        int operacao;
                        do{
                            System.out.println("\n==== DADOS DA PESSOA ====");
                            pessoaSelecionada.exibirDados();

                            System.out.println("""
                                    --------------------------------
                                    [1] - Alterar dados do endereço
                                    [0] - Sair
                                    --------------------------------
                                    """);
                            operacao = scanner.nextInt();
                            scanner.nextLine();

                            switch (operacao){
                                case 1:
                                    System.out.println("Digite a nova cidade: ");
                                    String novaCidade = scanner.nextLine();

                                    System.out.println("Digite o novo bairro: ");
                                    String novoBairro = scanner.nextLine();

                                    System.out.println("Digite a nova rua: ");
                                    String novaRua = scanner.nextLine();

                                    System.out.println("Digite o novo número: ");
                                    int novoNumero = scanner.nextInt();
                                    scanner.nextLine();

                                    pessoaSelecionada.getEndereco().setCidade(novaCidade);
                                    pessoaSelecionada.getEndereco().setBairro(novoBairro);
                                    pessoaSelecionada.getEndereco().setRua(novaRua);
                                    pessoaSelecionada.getEndereco().setNumero(novoNumero);

                                    System.out.println(" Endereço atualizado !");
                                    break;

                                case 0:
                                    System.out.println("Retornando ao menu principal...");
                                    break;

                                default:
                                    System.out.println("opção inválida");

                            }
                        }while(operacao != 0);
                    }else {
                        System.out.println("Pessoa não encontrada ");
                    }
                    break;

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
                    scanner.nextLine();

                    Pessoa pessoaRemover = null;
                    for(Pessoa p: pessoas){
                        if(p.getCpf() == cpfRemover){
                            pessoaRemover = p;
                            break;
                        }
                    }

                    if(pessoaRemover != null){
                        pessoas.remove(pessoaRemover);
                        System.out.println("Pessoa removida");
                    }else{
                        System.out.println("Pessoa não encontrada");
                    }
                    break;

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
