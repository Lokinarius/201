package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex03string;

import java.util.Scanner;

public class TestString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceString service = new ServiceString();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU STRING ---
                    1 - Exibir tamanho
                    2 - Exibir caractere em posição
                    3 - Comparar strings
                    4 - Buscar substring
                    5 - Modificar texto
                    6 - Dividir texte
                    0 - Sair
                    """);
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao){
                case 1 -> service.exibirTamanho();
                case 2 -> service.exibirCaractere();
                case 3 -> service.compararStrings();
                case 4 -> service.buscarSubstring();
                case 5 -> service.modificarTexto();
                case 6 -> service.dividirTexto();
                case 0 -> System.out.println("Saindo... ");
                default -> System.out.println("Opção invalida");
            }
        }while (opcao != 0);

        sc.close();
    }
}
