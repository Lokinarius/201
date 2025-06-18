package projeto201.conteudo.java02poo.Aula01ClassesAtributosMetodos.Ex05Produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[CADASTRO DE PRODUTO]");
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        String nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: \nR$");
        double preco = scanner.nextDouble();

        System.out.println("O produto tem algum desconto? [S/N]");
        String resp = scanner.nextLine();
        if (!resp.equalsIgnoreCase("s") && !resp.equalsIgnoreCase("n")){
            System.out.println("Responda S ou N");
        }else{
            if (resp.equalsIgnoreCase("s")){
                System.out.println("De quantos % o desconto a ser aplicado?");
                int desconto = scanner.nextInt();
                scanner.nextLine();

                if(desconto < 1 || desconto > 100){
                    System.out.println("O desconto deve ser entre 1 e 100%");
                }else{
                    produto.aplicarDesconto();
                }
            }else{
                System.out.println("Sem desconto aplicado.");
            }
        }
    }
}
