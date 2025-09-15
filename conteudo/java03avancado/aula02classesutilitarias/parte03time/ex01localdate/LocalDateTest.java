package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte03time.ex01localdate;

import java.util.Scanner;

public class LocalDateTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDateService service = new LocalDateService();
        int opcao;

        do{
            System.out.println("""
                    \n--- MENU LOCALDATE ---
                    1 - Data atual
                    2 - Criar data  específica
                    3 - Adicionar dias/meses/anos
                    4 - Subtrair dias/meses/anos
                    5 - Compara datas
                    6 - Checar ano bissexto
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> service.dataAtual();
                case 2 -> service.criarData();
                case 3 -> service.adicionarTempo();
                case 4 -> service.subtrairTempo();
                case 5 -> service.compararDatas();
                case 6 -> service.checarBissexto();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        }while(opcao != 0);

        sc.close();
    }
}
