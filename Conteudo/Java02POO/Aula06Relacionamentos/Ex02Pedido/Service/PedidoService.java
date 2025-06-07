package Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Service;

import Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex02Pedido.Domain.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoService {
    private List<Pedido> pedidos = new ArrayList<>();

    // ADICIONAR PEDIDO
    public void adicionar(Pedido pedido){
        pedidos.add(pedido);
        System.out.println("Pedido adicionado com sucesso!");
    }

    // REMOVER PEDIDO
    public void removerPedido(int indice){
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
