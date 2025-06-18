package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Test;

import projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Domain.Pedido;
import projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Service.PedidoService;

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
                    [1] - Verificar um pedido
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
                    }else{
                        System.out.println("Pedido não encontrado");
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
