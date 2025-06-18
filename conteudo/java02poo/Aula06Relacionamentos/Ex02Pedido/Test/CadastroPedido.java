package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Test;

import projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Domain.Pedido;
import projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.Domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class CadastroPedido {
    public static List<Pedido> gerarPedido(){
        List<Produto> produtos = CadastroProduto.criarProdutos();
        List<Pedido> pedidos = new ArrayList<>();

        pedidos.add(new Pedido("Ana", "Rua das Flores, 123", produtos.get(0), 2));
        pedidos.add(new Pedido("Bruno", "Av. Central, 456", produtos.get(1), 1));
        pedidos.add(new Pedido("Carlos", "Rua do Sol, 789", produtos.get(2), 3));
        pedidos.add(new Pedido("Diana", "Av. Paulista, 1000", produtos.get(3), 2));
        pedidos.add(new Pedido("Eduardo", "Travessa da Paz, 77", produtos.get(4), 1));
        pedidos.add(new Pedido("Fernanda", "Rua dos Programadores, 404", produtos.get(5), 4));
        pedidos.add(new Pedido("Gabriel", "Rua das Árvores, 55", produtos.get(6), 2));
        pedidos.add(new Pedido("Helena", "Av. Brasil, 250", produtos.get(7), 3));
        pedidos.add(new Pedido("Igor", "Rua Sem Nome, 9", produtos.get(8), 5));
        pedidos.add(new Pedido("Juliana", "Condomínio Tech, Bloco B, Ap. 301", produtos.get(9), 1));

        pedidos.add(new Pedido("Kaio", "Rua do Comércio, 888", produtos.get(0), 2));
        pedidos.add(new Pedido("Larissa", "Vila dos Devs, 333", produtos.get(1), 3));
        pedidos.add(new Pedido("Mateus", "Centro Histórico, 222", produtos.get(2), 1));
        pedidos.add(new Pedido("Natalia", "Av. Independência, 100", produtos.get(3), 4));
        pedidos.add(new Pedido("Otávio", "Rua 13 de Maio, 13", produtos.get(4), 2));
        pedidos.add(new Pedido("Priscila", "Rua do Código, 101", produtos.get(5), 5));
        pedidos.add(new Pedido("Renato", "Travessa DevJava, 98", produtos.get(6), 2));
        pedidos.add(new Pedido("Sabrina", "Rua dos Corvos, 666", produtos.get(7), 3));
        pedidos.add(new Pedido("Thiago", "Rua da Imaginação, 321", produtos.get(8), 4));
        pedidos.add(new Pedido("Vanessa", "Rua Gamer, 2025", produtos.get(9), 1));

        return pedidos;

    }
}
