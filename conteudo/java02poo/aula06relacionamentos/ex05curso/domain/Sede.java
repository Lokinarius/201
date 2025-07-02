package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

import java.util.List;

public class Sede {
    // ATRIBUTOS
    private String nome;
    private List<Aluno> alunos;

    // CONSTRUTOR
    public Sede(String nome, List<Aluno> alunos) {
        setNome(nome);
        setAlunos(alunos);
    }

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public List<Aluno> getAlunos() {return alunos;}
    public void setAlunos(List<Aluno> alunos) {this.alunos = alunos;}

    // METODOS
    public void exibirDados(){
        System.out.println("====== SEDE: "+getNome()+"======");
        if(alunos == null || alunos.isEmpty()){
            System.out.println("Nenhum aluno matriculado nesta sede.");
            return;
        }
        for(Aluno aluno : alunos){
            System.out.println("- "+ aluno.getNome());
        }
        System.out.println();
    }

    public void adicionarAluno(Aluno aluno) {
        this.alunos.add(aluno);
    }

}
