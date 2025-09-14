package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte02util.ex02collections;

import java.util.Scanner;

public class CollectionsTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CollectionsService service = new CollectionsService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU COLLECTIONS ---
                    1 - Ordenar lista
                    2 - Busca elemento (binarySearch)
                    3 - Encontrar maior e menor
                    4 - Substituir elementos
                    5 - Preencher lista
                    6 - Copiar lista
                    7 - Embaralhar lista
                    8 - Inverter lista
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> service.ordenarLista();
                case 2 -> service.buscarElementos();
                case 3 -> service.encontrarMaxMin();
                case 4 -> service.substituirElementos();
                case 5 -> service.preecherLista();
                case 6 -> service.copiarLista();
                case 7 -> service.embaralharLista();
                case 8 -> service.inverterLista();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        }while(opcao != 0);

        sc.close();
    }
}
