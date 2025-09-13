package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex05system;

import java.util.Scanner;

public class SystemTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SystemService service = new SystemService();
        int opcao;

        do {
            System.out.println("""
                    \n--- MENU SYSTEM ---
                    1 - Mostrar tempo atual
                    2 - Mostrar propriedades do sistema
                    3 - Mostrar variáveis de ambiente
                    4 - Mostrar saída de erro
                    5 - Encerrar programa
                    0 - Sair(sem System.exit)
                    """);
            opcao = scanner.nextInt();

            switch(opcao){
                case 1 -> service.mostrarTempo();
                case 2 -> service.mostrarPropriedades();
                case 3 -> service.mostrarVariaveisAmbiente();
                case 4 -> service.demonstrarErro();
                case 5 -> service.encerrarPrograma();
                case 0 -> System.out.println("Saindo normalmente...");
                default -> System.out.println("Opção invalida");

            }
        }while(opcao != 0);

        scanner.close();
    }
}
