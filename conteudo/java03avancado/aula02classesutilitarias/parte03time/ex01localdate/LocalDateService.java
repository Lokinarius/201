package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex01localdate;

import java.time.LocalDate;
import java.util.Scanner;

public class LocalDateService {
    private Scanner sc = new Scanner(System.in);

    // 1.Data atual
    public void dataAtual() {
        LocalDate hoje = LocalDate.now();
        System.out.println("Data de hoje: " + hoje);
    }

    // 2.Criar data específica
    public void criarData() {
        System.out.println("Digite ano, mês e dia");
        int ano = sc.nextInt();
        int mes = sc.nextInt();
        int dia = sc.nextInt();

        LocalDate data = LocalDate.of(ano,mes,dia);
        System.out.println("Data criada: " + data);
    }

    // 3. adicionar tempo
    public void adicionarTempo() {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);
        System.out.println("Digite dias, meses e anos para adicionar: ");
        int dias = sc.nextInt();
        int meses = sc.nextInt();
        int anos = sc.nextInt();

        LocalDate novaData = hoje.plusDays(dias).plusMonths(meses).plusYears(anos);
        System.out.println("Nova data: " + novaData);
    }

    public void subtrairTempo() {
        LocalDate hoje = LocalDate.now();
        System.out.println("Hoje: " + hoje);
        System.out.println("Digite dias, meses e anos para adicionar: ");
        int dias = sc.nextInt();
        int meses = sc.nextInt();
        int anos = sc.nextInt();

        LocalDate novaData = hoje.minusDays(dias).minusMonths(meses).minusYears(anos);
        System.out.println("Nova data: " + novaData);
    }

    // 5. Comparar datas
    public void compararDatas() {
        System.out.println("Digite ano, mês e dia da primeira data: ");
        LocalDate d1 = LocalDate.of(sc.nextInt(),sc.nextInt(), sc.nextInt());

        System.out.println("Digite ano, mês e dia da segunda data: ");
        LocalDate d2 = LocalDate.of(sc.nextInt(), sc.nextInt(), sc.nextInt());

        if (d1.isBefore(d2)){
            System.out.println(d1 + " é antes de " + d2);
        } else if (d1.isAfter(d2)) {
            System.out.println(d1 + " é depois de " + d2);
        }
    }

    // 6.Checar ano bissexto
    public void checarBissexto() {
        System.out.println("Digite o ano: ");
        int ano = sc.nextInt();
        LocalDate data = LocalDate.of(ano, 1,1);
        System.out.println("Ano " + ano + " é bissexto? " + data.isLeapYear());
    }
}
