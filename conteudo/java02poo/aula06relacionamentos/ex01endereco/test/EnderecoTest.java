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
        pessoas.add(new Pessoa("Alice", 12345678967L, new Endereco("Sobral", "Centro", "Rua das Flores", 101)));
        pessoas.add(new Pessoa("Bruno", 98765432154L, new Endereco("Fortaleza", "Meireles", "Av. Beira Mar", 200)));
        pessoas.add(new Pessoa("Carla", 11122233322L, new Endereco("Juazeiro", "Salesianos", "Rua São Pedro", 55)));
        pessoas.add(new Pessoa("Daniel", 44455566614L, new Endereco("Crato", "Pimenta", "Rua das Palmeiras", 78)));
        pessoas.add(new Pessoa("Eduarda", 77788899916L, new Endereco("Tianguá", "Centro", "Rua Projetada", 32)));
        pessoas.add(new Pessoa("Felipe", 12131415178L, new Endereco("Sobral", "Dom Expedito", "Rua Nova", 8)));
        pessoas.add(new Pessoa("Gabriela", 16171819290L, new Endereco("Fortaleza", "Aldeota", "Av. Santos Dumont",
                999)));

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
                    long cpfPessoa = scanner.nextLong();
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
                                    long novoNumero = scanner.nextLong();
                                    scanner.nextLine();

                                    pessoaSelecionada.getEndereco().setCidade(novaCidade);
                                    pessoaSelecionada.getEndereco().setBairro(novoBairro);
                                    pessoaSelecionada.getEndereco().setRua(novaRua);
                                    pessoaSelecionada.getEndereco().setNumero((int) novoNumero);

                                    System.out.println(" Endereço atualizado !\n");
                                    break;

                                case 0:
                                    System.out.println("Retornando ao menu principal...\n");
                                    break;

                                default:
                                    System.out.println("opção inválida\n");

                            }
                        }while(operacao != 0);
                    }else {
                        System.out.println("Pessoa não encontrada \n");
                    }
                    break;

                case 2:
                    System.out.println("Digite o nome da nova pessoa a ser cadastrada: ");
                    String novoNome = scanner.nextLine();

                    System.out.println("Digite o CPF da nova pessoa: ");
                    long novoCpf = scanner.nextLong();
                    scanner.nextLine();

                    // Validação para cpf duplicado
                    boolean cpfExiste = false;
                    for(Pessoa p : pessoas){
                        if(p.getCpf() == novoCpf){
                            cpfExiste = true;
                            break;
                        }
                    }
                    if(cpfExiste){
                        System.out.println("Já existe uma pessoa cadastrada com este CPF!");
                        break;
                    }

                    System.out.println("Digite a Cidade onde ela vive: ");
                    String cidade = scanner.nextLine();

                    System.out.println("Digite o Bairro onde ela mora: ");
                    String bairro = scanner.nextLine();

                    System.out.println("Digite a rua onde ela mora: ");
                    String rua = scanner.nextLine();

                    System.out.println("Digite o número do endereço: ");
                    int numero = scanner.nextInt();
                    scanner.nextLine();

                    pessoas.add(new Pessoa(novoNome, novoCpf, new Endereco(cidade, bairro, rua, numero)));
                    System.out.println(novoNome+" adicionada com sucesso!\n");
                    break;

                case 3:
                    System.out.println("Digite o CPF da pessoa a ser removida");
                    long cpfRemover = scanner.nextLong();
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
                        System.out.println("Pessoa removida\n");
                    }else{
                        System.out.println("Pessoa não encontrada\n");
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
