package projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.service;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.domain.CadastroPedido;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.domain.Pedido;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.domain.Produto;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex02pedido.domain.CadastroProduto;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PedidoService {
    private List<Pedido> pedidos;

    public PedidoService() {
        this.pedidos = CadastroPedido.gerarPedido();
    }

    // LISTAR PEDIDOS
    public void listarPedidos(){
        if(pedidos.isEmpty()){
            System.out.println("Nenhum produto cadastrado");
            return;
        }
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.println("Pedido " +(i+1)+": ");
            pedidos.get(i).exibirDados();
        }
    }

    // BUSCAR PEDIDO
    public Pedido buscarPedido(int indice){
        if(indice >= 0 && indice < pedidos.size()){
            return pedidos.get(indice);
        }
        return null;
    }

    // ADICIONAR PEDIDO
    public void adicionar(Scanner scanner){
        System.out.println("Digite o nome do cliente: ");
        String nome = scanner.nextLine();

        System.out.println("Digite o endereço: ");
        String endereco = scanner.nextLine();

        System.out.println("Digite o nome do produto: ");
        String nomeProduto = scanner.nextLine();

        System.out.println("Digite a categoria do produto: ");
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
}
