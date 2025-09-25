package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex01uuid;

import java.util.Scanner;

public class UUIDTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        UUIDService service = new UUIDService();
        int opcao;

        do{
            System.out.println("""
                    \n --- MENU UUID ---
                    1 - Gerar UUID aleatório
                    2 - Gerar vários UUIDs
                    3 - Converter UUID para String
                    4 - Criar UUID a partir  de String
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch (opcao){
                case 1 -> service.gerarUUID();
                case 2 -> service.gerarVariosUUID();
                case 3 -> service.uuidParaString();
                case 4 -> service.stringParaUUID();
                case 0 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida");
            }

        }while(opcao != 0);

        sc.close();
    }
}
