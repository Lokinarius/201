package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex02duration;

import java.util.Scanner;

public class DurationTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DurationService service = new DurationService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU DURATION ---
                    1 - Criar duração em horas/minutos/segundos
                    2 - Calcular duração entre dois horários
                    3 - Adicionar tempo a uma duração
                    4 - Subtair tempo de uma duaração
                    5 - Converter duração para minutos/segundos/horas
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> service.criarDuracao();
                case 2 -> service.duracaoEntreHorarios();
                case 3 -> service.adicionarTempo();
                case 4 -> service.subtrairTempo();
                case 5 -> service.converterDuracao();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);
        sc.close();
    }
}
