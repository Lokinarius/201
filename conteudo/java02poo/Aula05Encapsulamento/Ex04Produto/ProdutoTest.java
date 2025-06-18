package projeto201.conteudo.java02poo.Aula05Encapsulamento.Ex04Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        // PRODUTOS
        Produto[] produtos = new Produto[20];
        produtos[0]  = new Produto("Smartphone Samsung", "P001", "Smartphone", 2500.0);
        produtos[1]  = new Produto("Notebook Dell", "P002", "Notebook", 4200.0);
        produtos[2]  = new Produto("Tablet Apple", "P003", "Tablet", 3300.0);
        produtos[3]  = new Produto("Monitor LG", "P004", "Monitor", 1500.0);
        produtos[4]  = new Produto("Fone de Ouvido JBL", "P005", "Acessório", 400.0);
        produtos[5]  = new Produto("Caixa de Som Bluetooth", "P006", "Acessório", 550.0);
        produtos[6]  = new Produto("Smart TV Samsung 50\"", "P007", "Televisão", 3200.0);
        produtos[7]  = new Produto("Console PS5", "P008", "Console", 4500.0);
        produtos[8]  = new Produto("Controle Xbox", "P009", "Console", 350.0);
        produtos[9]  = new Produto("Teclado Mecânico Redragon", "P010", "Periférico", 250.0);
        produtos[10] = new Produto("Mouse Gamer Logitech", "P011", "Periférico", 300.0);
        produtos[11] = new Produto("Webcam Full HD", "P012", "Periférico", 200.0);
        produtos[12] = new Produto("Carregador Portátil", "P013", "Acessório", 180.0);
        produtos[13] = new Produto("Câmera Digital Canon", "P014", "Câmera", 2900.0);
        produtos[14] = new Produto("Smartwatch Xiaomi", "P015", "Wearable", 600.0);
        produtos[15] = new Produto("Impressora HP", "P016", "Impressora", 700.0);
        produtos[16] = new Produto("Headset Gamer Razer", "P017", "Acessório", 550.0);
        produtos[17] = new Produto("Roteador Wi-Fi TP-Link", "P018", "Rede", 300.0);
        produtos[18] = new Produto("HD Externo Seagate 2TB", "P019", "Armazenamento", 450.0);
        produtos[19] = new Produto("Placa de Vídeo RTX 3060", "P020", "Hardware", 2900.0);

        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        int opcao;
        do{
            // Menu
            System.out.println("""
                    ============ MENU ============
                    [1] - Verificar um produto
                    [0] - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch(opcao){
                case 1:
                    System.out.println("Código do produto: ");
                    String codigoProduto = scanner.nextLine();

                    Produto produtoSelecionado = null;

                    for(Produto produto : produtos){
                        if(produto.getCodigo().equalsIgnoreCase(codigoProduto)){
                            produtoSelecionado = produto;
                            break;
                        }
                    }

                    if(produtoSelecionado == null){
                        System.out.println("Produto inexistente");
                        break;
                    }

                    // Produto Selecionado
                    int operacao;
                    do {
                        System.out.println("""
                                --- %s ---
                                [1] - Verificar dados do produto
                                [2] - Verificar preço do produto
                                [0] - Sair do produto
                                """.formatted(produtoSelecionado.getNome()));
                        operacao = scanner.nextInt();
                        scanner.nextLine();

                        // switch
                        switch(operacao){
                            case 1:
                                produtoSelecionado.exibirDados();

                            case 2:
                                System.out.println("Preço do produto: R$ %s".formatted(produtoSelecionado.getPreco()));
                                System.out.println("Deseja fazer uma alteração no preço do produto? ");
                                String resposta = scanner.nextLine();

                                if(resposta.equalsIgnoreCase("s")){
                                    System.out.println("""
                                            Escolha o tipo de alteração:
                                            [1] - Aumentar preço
                                            [2] - Aplicar desconto
                                            """);
                                    int alteracao = scanner.nextInt();
                                    if (alteracao != 1 && alteracao != 2){
                                        System.out.println("Digite 1 ou 2 para realizar uma alteração");
                                        scanner.nextLine();
                                        break;
                                    }

                                    System.out.println("Informe a porcentagem da alteração");
                                    double porcentagem = scanner.nextDouble();
                                    scanner.nextLine();

                                    if(porcentagem < 0 ){
                                        System.out.println("Entrada invalida");
                                        break;
                                    }

                                    if(alteracao == 2){
                                        porcentagem *= -1;
                                        System.out.println("Aplicando desconto de "+Math.abs(porcentagem)+"%");
                                    }else{
                                        System.out.println("Aplicando aumento de "+porcentagem+"%");
                                    }

                                    produtoSelecionado.alterarPreco(porcentagem);
                                    System.out.println("Novo preço: R$ %s".formatted(produtoSelecionado.getPreco()));
                                }

                            case 0:
                                System.out.println("Saindo do menu do produto...");
                                break;
                            default:
                                System.out.println("Opção inválida");
                        }
                    }while(operacao != 0);
                    break;
                case 0:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }while (opcao!=0);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
