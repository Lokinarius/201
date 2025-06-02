package Projeto201.Conteudo.Java02POO.Aula05Encapsulamento.Ex05Estoque;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EstoqueTest {
    public static void main(String[] args) {
        // PRODUTOS
        List<Estoque> produtos = new ArrayList<>();
        produtos.add(new Estoque("P001", "Smartphone Samsung", 15));
        produtos.add(new Estoque("P002", "Notebook Dell", 10));
        produtos.add(new Estoque("P003", "Tablet Apple", 8));
        produtos.add(new Estoque("P004", "Monitor LG", 12));
        produtos.add(new Estoque("P005", "Fone de Ouvido JBL", 25));
        produtos.add(new Estoque("P006", "Caixa de Som Bluetooth", 20));
        produtos.add(new Estoque("P007", "Smart TV Samsung 50\"", 7));
        produtos.add(new Estoque("P008", "Console PS5", 5));
        produtos.add(new Estoque("P009", "Controle Xbox", 30));
        produtos.add(new Estoque("P010", "Teclado Mecânico Redragon", 18));
        produtos.add(new Estoque("P011", "Mouse Gamer Logitech", 22));
        produtos.add(new Estoque("P012", "Webcam Full HD", 19));
        produtos.add(new Estoque("P013", "Carregador Portátil", 35));
        produtos.add(new Estoque("P014", "Câmera Digital Canon", 6));
        produtos.add(new Estoque("P015", "Smartwatch Xiaomi", 14));
        produtos.add(new Estoque("P016", "Impressora HP", 9));

        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        int opcao;
        do{
            // Menu
            System.out.println("""
                    ======== MENU =========
                    [1] - Verificar um produto
                    [2] - Adicionar um produto
                    [3] - Remover um produto
                    [0] - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch(opcao){
                case 1:
                    System.out.println("Código do produto: ");
                    String codigoProduto = scanner.nextLine();

                    Estoque produtoSelecionado = null;

                    for(Estoque p : produtos){
                        if(p.getCodigo().equalsIgnoreCase(codigoProduto)){
                            produtoSelecionado = p;
                            break;
                        }
                    }
                    // Produto selecionado
                    int operacao;
                    do {
                        System.out.println("""
                                -------- %s --------
                                [1] - Ver dados do produto em estoque
                                [2] - Adicionar produtos a quantidade total
                                [3] - Remover produtos a quantidade total
                                [0] - Sair
                                """.formatted(produtoSelecionado.getNome()));
                        operacao = scanner.nextInt();
                        scanner.nextLine();

                        // switch
                        switch (operacao){
                            case 1:
                                produtoSelecionado.exibirDados();
                                break;

                            case 2:
                                System.out.println("Digite o numero de "+produtoSelecionado.getNome()+" a serem " +
                                        "adicionados ao estoque: ");
                                int addQtd = scanner.nextInt();
                                scanner.nextLine();
                                produtoSelecionado.adicionarQuantidade(addQtd);
                                break;

                            case 3:
                                System.out.println("Digite o número de "+produtoSelecionado.getNome()+" a serem " +
                                        "removidos do estoque: ");
                                int remQtd = scanner.nextInt();
                                scanner.nextLine();
                                produtoSelecionado.removerQuantidade(remQtd);
                                break;

                            case 0:
                                System.out.println("Saindo do produto");
                                break;

                            default:
                                System.out.println("Opção inválida");
                        }
                    }while(operacao != 0);

                case 2:
                    System.out.println("Digite o código do novo produto: ");
                    String novoCodigo = scanner.nextLine();

                    System.out.println("Digite o nome do novo produto: ");
                    String novoNome = scanner.nextLine();

                    System.out.println("Digite a quantidade inicial: ");
                    int novaQtd = scanner.nextInt();
                    scanner.nextLine();

                    Estoque novoProduto = new Estoque(novoCodigo,novoNome,novaQtd);
                    produtos.add(novoProduto);
                    System.out.println(novoNome+" adicionado ao estoque ");
                    break;

                case 3:
                    System.out.println("Digite o código do produto a ser removido: ");
                    String codigoRemover = scanner.nextLine();

                    Estoque produtoRemover = null;
                    for(Estoque p: produtos){
                        if(p.getCodigo().equalsIgnoreCase(codigoRemover)){
                            produtoRemover = p;
                            break;
                        }
                    }

                    if(produtoRemover != null){
                        produtos.remove(produtoRemover);
                        System.out.println("Produto removido");
                    }else{
                        System.out.println("Produto não encontrado");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida");
            }
        }while (opcao!=0);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}