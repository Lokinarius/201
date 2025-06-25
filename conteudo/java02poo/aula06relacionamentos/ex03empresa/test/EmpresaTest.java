package projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.test;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.service.EmpresaService;

import java.util.Scanner;

public class EmpresaTest {
    public static void main(String[] args) {
        // SCANNER E SERVICE
        Scanner scanner  = new Scanner(System.in);
        EmpresaService empresaService = new EmpresaService();
        int opcao;

        // ENTRADA DE DADOS
        do{
            System.out.println("""
                    ====== MENU ======
                    [1] - Listar funcionários
                    [2] - Contratar funcionário
                    [3] - Conceder aumento
                    [4] - Demitir funcionario 
                    [0] - Sair
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch(opcao){
                case 1:
                    empresaService.listarFuncionarios();
                    break;
                case 2:
                    empresaService.contratarFuncionario();
                    break;
                case 3:
                    empresaService.concederAumeto();
                    break;
                case 4:
                    empresaService.demitirFuncionario();
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
