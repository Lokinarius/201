package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex03datetimeformatter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateTimeFormatterService {
    private Scanner sc = new Scanner(System.in);

    // 1.Formatar data no padrão BR
    public void formatarDataBR() {
        LocalDate hoje = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("Data formatada (BR): " + hoje.format(formatter));
    }

    // 2.Formatar data no padrão US
    public void formatarDataUS() {
        LocalDate hoje =LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        System.out.println("Data formatada (US): " + hoje.format(formatter));
    }

    // 3.Formatar data e hora personalizada
    public void formatarDataHoraCustom() {
        LocalDateTime agora = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println("Data e hora e personalizada: " + agora.format(formatter));

    }

    // 4.Ler dataa partir de texto
    public void lerDataTexto() {
        System.out.println("Digite uma data no formato dd/MM/yyyy");
        String entrada = sc.next();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(entrada, formatter);
        System.out.println("Data lida: " + data);
    }

    // 5.Ler data e hora a partir de texto
    public void lerDataHoraTexto() {
        System.out.println("Digite data e hora no formato dd/MM/yyyy HH:mm:  ");
        sc.nextLine();
        String entrada = sc.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime datahora = LocalDateTime.parse(entrada, formatter);
        System.out.println("Data e hora lida: " + datahora);
    }
}
