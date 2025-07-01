package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.test;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.service.EscolaService;

import java.util.Scanner;


public class EscolaTest {
    public static void main(String[] args) {
        // SCANNER E SERVICE
        Scanner scanner = new Scanner(System.in);
        int opcao;

        // ENTRADA DE DADOS
        do{
            System.out.println("""
                    ======\tMENU\t======
                    [1] - LISTAR ALUNOS
                    [2] - LISTAR MATRICULADOS EM UMA CURSO
                    [3] - MATRICULAR NOVO ALUNO
                    [4] - REMOVER ALUNO
                    [5] - TROCAR ALUNO DE CURSO
                    [0] - SAIR
                    """);
            opcao = scanner.nextInt();
            scanner.nextLine();

            // Switch
            switch (opcao){
                case 1:
                    EscolaService.listarAlunos();
                    break;
                case 2:
                    EscolaService.matriculadosCurso();
                    break;
                case 3:
                    EscolaService.matricularAluno();
                    break;
                case 4:
                    EscolaService.removerAluno();
                    break;
                case 5:
                    EscolaService.trocarDecurso();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção invalida");
            }

        }while(opcao != 0);
    }
}
