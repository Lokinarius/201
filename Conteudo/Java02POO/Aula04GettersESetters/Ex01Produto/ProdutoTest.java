package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex01Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        // Abertura de scanner
        Scanner scanner = new Scanner(System.in);
        Produto[] produtos = new Produto[5];

        // Entrada de dados
        System.out.println("======= Cadastro de produtos ======");
        for (int i = 0; i < produtos.length; i++) {
            System.out.println(i+1+"º Produto");

            System.out.println("Nome: ");
            String nome = scanner.nextLine();

            double preco = 0;
            boolean precoValido = false;
            while(!precoValido){
                System.out.println("Preço: R$");
                String entrada = scanner.nextLine();
                preco = Double.parseDouble(entrada);
                if (preco > 0){
                    precoValido = true;
                }else {
                    System.out.println("Preço inválido!");
                }
            }
            produtos[i] = new Produto(nome,preco);
            System.out.println();
        }
        // Saída de dados
        System.out.println("=== Lista de Produtos Cadastrados ===");
        for(Produto produto : produtos){
            produto.exibirDados();
        }

        // Fechamento de scanner
        scanner.close();
    }
}
