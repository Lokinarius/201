package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex04scanner;

import java.util.Scanner;

public class RegexScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegexScannerService service = new RegexScannerService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU REGEX + SCANNER ---
                    1 - Ler palavras separadas por espaço
                    2 - Ler números de uma frase
                    3 - Ler tokens separados por vírgula
                    4 - Ler email de um texto
                    5 - Ler valores monetários de um texto
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> service.lerPalavras();
                case 2 -> service.lerNumeros();
                case 3 -> service.lerTokensVirgula();
                case 4 -> service.lerEmails();
                case 5 -> service.lerValoresMonetarios();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }


        }while(opcao != 0);

        sc.close();
    }
}
