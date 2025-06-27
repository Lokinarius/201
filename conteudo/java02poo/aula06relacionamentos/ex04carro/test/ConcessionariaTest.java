package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.test;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.service.ConcessionariaService;

import java.util.Scanner;

import static projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.ex05cadastrodeusuarioesenhas.CadastroDeUsuariosESenha.scanner;

public class ConcessionariaTest {
    public static void main(String[] args) {
        // SCANNER E SERVICE
        Scanner scanner = new Scanner(System.in);
        ConcessionariaService concessionariaService = new ConcessionariaService();
        int opcao;

        // ENTRADA DE DADOS
        do{
            System.out.println("""
                    ====== MENU ======
                    [1] - LISTAR CARROS
                    [2] - LISTAR PROPRIETARIOS
                    [3] - BUSCAR CARRO
                    [4] - BUSCAR PROPRIETARIO
                    [5] - VENDA DE CARRO
                    [6] - COMPRA DE CARRO
                    [0] - SAIR
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        scanner.close();
    }
}
