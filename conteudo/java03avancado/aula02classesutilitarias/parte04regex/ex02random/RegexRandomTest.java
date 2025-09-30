package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex02random;

import java.util.Scanner;

public class RegexRandomTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        RegexRandomService service = new RegexRandomService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU REGEX & RANDOM ---
                    1 - Gerar número aleatório (int)
                    2 - Gerar número aleatório dentro de um intervalo
                    3 - Validar email com Regex
                    4 - Validar telefone com Regex
                    5 - Validar apenas números em uma string
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> service.gerarNumeroAleatorio();
                case 2 -> service.gerarNumeroIntervalo();
                case 3 -> service.validarEmail();
                case 4 -> service.validarTelefone();
                case 5 -> service.validarNumeros();
                case 0 -> System.out.println("Sainda...");
                default -> System.out.println("Opção inválida");
            }
        }while (opcao != 0);
    }
}
