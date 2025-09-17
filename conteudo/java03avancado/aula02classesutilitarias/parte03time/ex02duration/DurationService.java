package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex02duration;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

public class DurationService {
    private Scanner sc = new Scanner(System.in);

    // 1.Criar duração
    public void criarDuracao() {
        System.out.println("Digite horas, minutos e segundos");
        long horas = sc.nextLong();
        long minutos = sc.nextLong();
        long segundos = sc.nextLong();

        Duration d = Duration.ofHours(horas).plusMinutes(minutos).plusSeconds(segundos);
        System.out.println("Duration criada: " + d);
    }

    // 2.Duração entre dois horários
    public void duracaoEntreHorarios() {
        System.out.println("Digite hora e minuto inicial (ex: 14 30): ");
        LocalTime inicio = LocalTime.of(sc.nextInt(),sc.nextInt());

        System.out.println("Digite hora e minuto final (ex: 16 45): ");
        LocalTime fim = LocalTime.of(sc.nextInt(), sc.nextInt());

        Duration d = Duration
    }

    // 3.adicionar tempo a uma duração
    public void adicionarTempo() {
    }

    // 4.Substituir tempo de uma duração
    public void subtrairTempo() {
    }

    // 5.Converter duração
    public void converterDuracao() {
    }
}
