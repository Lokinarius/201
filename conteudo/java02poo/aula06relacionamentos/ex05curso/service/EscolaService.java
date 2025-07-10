package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.service;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain.Aluno;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain.EscolaProfissionalizante;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain.Sede;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EscolaService {
    private static EscolaProfissionalizante escola;
    private static Scanner scanner = new Scanner(System.in);

    public static void inicializar() {
        List<Sede> sedes = new ArrayList<>();
        sedes.add(new Sede("Sede Centro", new ArrayList<>()));
        sedes.add(new Sede("Sede Zona Norte", new ArrayList<>()));
        sedes.add(new Sede("Sede Online", new ArrayList<>()));

        escola = new EscolaProfissionalizante("Escola Técnica Noturnos", sedes);
    }

    // LISTAR ALUNOS
    public static void listarAlunos() {
        for(Sede sede : escola.getSedes()){
            for(Aluno aluno: sede.getAlunos()){
                aluno.exibirDados();
            }
        }
    }

    // LISTAR ALUNOS POR SEDE
    public static void matriculadosCurso(){
        escola.exibirDados();
    }


    // BUSCAR ALUNO
    public static Aluno buscarPorNomeAluno(String nome){
        for (Sede sede: escola.getSedes()){
            for(Aluno aluno:sede.getAlunos()){
                if(aluno.getNome().equalsIgnoreCase(nome)){
                    return aluno;
                }
            }
        }
        return null;
    }

    public static Aluno buscarAluno(){
        System.out.println("Digite o nome do Aluno: ");
        String nome = scanner.nextLine();
        Aluno a = buscarPorNomeAluno(nome);
        if(a == null){
            System.out.println("Aluno não encontrado");
        }else{
            a.exibirDados();
        }
        return a;
    }


    // MATRICULAR ALUNO
    public static void matricularAluno() {
        System.out.println("Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Matrícula: ");
        int matricula = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Curso: ");
        String curso = scanner.nextLine();

        System.out.println("Período: ");
        int periodo = scanner.nextInt();

        List<Sede> sedes = escola.getSedes();

        System.out.println("Escolha a sede: ");
        for (int i = 0; i < sedes.size(); i++) {
            System.out.println("["+(i+1)+"]"+sedes.get(i).getNome());
        }

        int opcao = scanner.nextInt() - 1;
        scanner.nextLine();

        if(opcao >= 0 && opcao < sedes.size()){
            Sede sedeEscolhida = sedes.get(opcao);
            Aluno aluno = new Aluno(nome,matricula,curso,periodo,sedeEscolhida);
            System.out.println("Aluno matriculado!");
        }else{
            System.out.println("opção invalida.");
        }
    }

    // REMOVER ALUNO
    public static void removerAluno() {
        Aluno aluno = buscarAluno();
        if (aluno != null){
            Sede sede = aluno.getSede();
            if(sede.getAlunos().remove(aluno)){
                System.out.println("Aluno removido");
            }else{
                System.out.println("Aluno não encontrado");
            }
        }
    }

    // TROCAR DE CURSO
    public static void trocarDecurso() {
        Aluno aluno = buscarAluno();
        if(aluno != null){
            System.out.println("Digite o novo curso: ");
            String novoCurso = scanner.nextLine();
            aluno.setCurso(novoCurso);
            System.out.println("Curso atualizado");
        }

    }
}
