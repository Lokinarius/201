package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.test;

import projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.domain.Produto;

import java.util.ArrayList;
import java.util.List;

public class CadastroProduto {
    public static List<Produto> criarProdutos(){
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Mouse Gamer", "Periféricos", 129.90));
        produtos.add(new Produto("Teclado Mecânico RGB", "Periféricos", 259.00));
        produtos.add(new Produto("Monitor 24\" Full HD", "Monitores", 899.99));
        produtos.add(new Produto("Cadeira Gamer Reclinável", "Móveis", 1499.00));
        produtos.add(new Produto("Notebook i7 16GB", "Computadores", 4599.99));
        produtos.add(new Produto("Placa de Vídeo RTX 3060", "Hardware", 2899.00));
        produtos.add(new Produto("SSD 1TB NVMe", "Armazenamento", 499.99));
        produtos.add(new Produto("Fonte 650W 80 Plus Bronze", "Hardware", 379.90));
        produtos.add(new Produto("Headset 7.1 Surround", "Áudio", 319.50));
        produtos.add(new Produto("Webcam Full HD", "Acessórios", 229.99));

        return produtos;
    }
}
