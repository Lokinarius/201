package projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.test;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.domain.Pedido;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.service.PedidoService;

import java.util.Scanner;

public class PedidoTest {
    public static void main(String[] args) {
        // SACANNER E SERVICE
        Scanner scanner = new Scanner(System.in);
        PedidoService pedidoService = new PedidoService();
        int opcao;

        // ENTRADA DE DADOS
        do{
            // Menu
            System.out.println("""
                    ======\tMENU\t======
                    [1] - Listar todos pedidos
                    [2] - Adicionar um pedido ao sistema
                    [3] - Remover um pedido
                    [0] - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:
                    System.out.println("====\t[LISTANDO PEDIDOS]\t====");
                    pedidoService.listarPedidos();
                    break;

                case 2:
                    System.out.println("====\t[ADICIONANDO NOVO PEDIDO]\t====");
                    pedidoService.adicionar(scanner);
                    break;

                case 3:
                    System.out.println("====\t[REMOVENDO PEDIDO]\t====");
                    System.out.println("Digite o índice em que o pedido está: ");
                    int indiceBuscar = scanner.nextInt();
                    scanner.nextLine();

                    Pedido pedido = pedidoService.buscarPedido(indiceBuscar - 1);
                    if (pedido != null){
                        pedido.exibirDados();

                        System.out.println("Deseja remover este pedido?");
                        String confirmar = scanner.nextLine();

                        if(confirmar.equalsIgnoreCase("s")){
                            pedidoService.removerPedido(indiceBuscar -1);
                        }else{
                            System.out.println("Remoção cancelada.");
                        }
                    }else{
                        System.out.println("Pedido não encontrado");
                    }
                    break;

                case 0:
                    System.out.println("Saindo do programa...");
                    break;

                default:
                    System.out.println("Opção inválida\n");
            }
        }while(opcao != 0);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
