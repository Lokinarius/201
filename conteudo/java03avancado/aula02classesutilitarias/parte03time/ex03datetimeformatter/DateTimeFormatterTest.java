package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex03datetimeformatter;

import java.util.Scanner;

public class DateTimeFormatterTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatterService service = new DateTimeFormatterService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU DATETIMEFORMATTER ---
                    1 - Formatar data no padrão BR (dd/MM/yyyy)
                    2 - Formatar data no padrão US (MM-dd-yyyy)
                    3 - Formatar data e hora personalizada
                    4 - Ler data a partir de texto
                    5 - Ler data e hora a partir de texto
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> service.formatarDataBR();
                case 2 -> service.formatarDataUS();
                case 3 -> service.formatarDataHoraCustom();
                case 4 -> service.lerDataTexto();
                case 5 -> service.lerDataHoraTexto();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        sc.close();
    }
}
