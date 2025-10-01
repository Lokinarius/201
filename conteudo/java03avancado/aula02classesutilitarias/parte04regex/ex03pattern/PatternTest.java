package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex03pattern;

import java.util.Scanner;

public class PatternTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PatternService service = new PatternService();
        int opcao;

        do{
            System.out.println("""
                \n--- MENU PATTERN (Regex) ---
                1 - Validar email
                2 - Validar CPF
                3 - Validar senha forte
                4 - Encontrar números em um texto
                5 - Encontrar palavras que começam com maiúscula
                0 - Sair
                """);
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> service.validarEmail();
                case 2 -> service.validarCPF();
                case 3 -> service.validarSenhaForte();
                case 4 -> service.encontrarNumerosTexto();
                case 5 -> service.encontrarPalavrasMaiusculas();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao != 0);

    }

}
