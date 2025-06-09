package Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Test;

import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Domain.Pedido;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoTest {
    public static void main(String[] args) {
        // DADOS
        List<Pedido> pedidos = new ArrayList<>(CadastroPedido.gerarPedido());

        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        int opcao;
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
                    System.out.println("Digite o número do pedido: ");
                    int indice = scanner.nextInt();
                    scanner.nextLine();

                case 2:


                case 3:


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
