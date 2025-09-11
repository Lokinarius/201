package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex02wrapper;

import java.util.Scanner;

public class TestWrapper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceWrapper service = new ServiceWrapper();
        int opcao;

        do{
            System.out.println("""
                    \n === MENU WRAPPER ===
                    1 - Boxing e Unboxing
                    2 - Conversões (String e Número)
                    3 - Uso em coleções
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> service.boxingUnboxing();
                case 2 -> service.conversao();
                case 3 -> service.colecoes();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao != 0);

        sc.close();
    }
}
