package Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Service;

import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Domain.Pedido;
import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Domain.Produto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    // ADICIONAR PEDIDO
    public void adicionar(Scanner scanner){
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a gategoria do produto: ");
        String categoria = scanner.nextLine();

        System.out.println("Digite o preço do produto: ");
        double preco = scanner.nextDouble();

        System.out.println("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        scanner.nextLine();

        Produto novoProduto = new Produto(nomeProduto,categoria,preco);
        Pedido novoPedido = new Pedido(nome,endereco, novoProduto, quantidade);
        pedidos.add(novoPedido);

        System.out.println("Pedido adicionado!");

    }

    // REMOVER PEDIDO
    public void removerPedido(int indice){
        System.out.println("Digite o número");
        if(indice >= 0 && indice < pedidos.size()){
            pedidos.remove(indice);
            System.out.println("Pedido removido com sucesso!");
        }else{
            System.out.println("Número do pedido não encontrado");
        }
    }

    // BUSCAR PEDIDO
    public Pedido buscarPedido(int indice){
        if(indice >= 0 && indice < pedidos.size()){
            return pedidos.get(indice);
        }
        return null;
    }

    // LISTAR PEDIDOS
    public void listarPedidos(){
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido " +(i+1)+": ");
            pedidos.get(i).exibirDados();
        }
    }

}
