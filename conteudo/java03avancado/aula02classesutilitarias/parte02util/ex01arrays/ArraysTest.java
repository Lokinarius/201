package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte02util.ex01arrays;

import java.util.Scanner;

public class ArraysTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArraysService service = new ArraysService();
        int opcao;

        do {
            System.out.println("""
                \n--- MENU ARRAYS ---
                1 - Ordenar array
                2 - Buscar elemento(binarySearch)
                3 - Copiar array
                4 - Preencher array
                5 - Comparar arrays
                0 - Sair
                """);
            opcao = scanner.nextInt();

            switch (opcao){
                case 1 -> service.ordenarArray();
                case 2 -> service.buscarElemento();
                case 3 -> service.copiarArray();
                case 4 -> service.preencherArray();
                case 5 -> service.compararArrays();
                case 0 -> System.out.println("Saindo... ");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        scanner.close();
    }
}
