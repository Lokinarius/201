package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex02duration;

import java.time.Duration;
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

        Duration d = Duration.between(inicio,fim);
        System.out.println("Duração entre os horários: " + d);
        System.out.println("Em minutos: " + d.toMinutes());
    }

    // 3.adicionar tempo a uma duração
    public void adicionarTempo() {
        Duration d = Duration.ofMinutes(90);
        System.out.println("Duração original: " + d);
        Duration nova = d.plusMinutes(30).plusSeconds(45);
        System.out.println("Após adicionar 30min e 45s: " + nova);
    }

    // 4.Substituir tempo de uma duração
    public void subtrairTempo() {
        Duration d = Duration.ofHours(2);
        System.out.println("Duration original: " + d);
        Duration nova = d.minusMinutes(45);
        System.out.println("Após subtrair 45min: " + nova);
    }

    // 5.Converter duração
    public void converterDuracao() {
        Duration d = Duration.ofSeconds(3675);
        System.out.println("Duração: " + d);
        System.out.println("Em horas: " + d.toHours());
        System.out.println("Em minutos: " + d.toMinutes());
        System.out.println("Em segundos: " + d.toSeconds());
    }
}
