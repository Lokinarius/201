package projeto201.conteudo.java02poo.aula01classesatributosmetodos.ex05produto;

import java.util.Scanner;

public class ProdutoTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[CADASTRO DE PRODUTO]");
        Produto produto = new Produto();

        System.out.println("Digite o nome do produto: ");
        produto.nome = scanner.nextLine();
        System.out.println("Digite o preço do produto: \nR$");
        produto.preco = scanner.nextDouble();
        scanner.nextLine();

        String resp;
        while(true){
            System.out.println("O produto tem algum desconto [s/n]");
            resp = scanner.nextLine();

            if(resp.equalsIgnoreCase("s")||resp.equalsIgnoreCase("n")){
                break;
            }else{
                System.out.println("Resposta invalida");
            }
        }
        if(resp.equalsIgnoreCase("s")){
            System.out.println("De quantos % o desconto a ser aplicado? ");
            int desconto = scanner.nextInt();
            scanner.nextLine();

            if(desconto < 1 || desconto > 100){
                System.out.println("O desconto deve ser entre 1% a 100%");
            }else{
                produto.desconto = desconto;
                produto.aplicarDesconto();
            }
        }else{
            System.out.println("Sem desconto aplicado.");
        }
        scanner.close();
    }
}
