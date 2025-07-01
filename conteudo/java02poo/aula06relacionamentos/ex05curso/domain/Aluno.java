package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

public class Aluno {
    // ATRIBUTOS
    private String nome;
    private int matricula;
    private String curso;
    private int periodo;

    // CONSTRUTOR
    public Aluno(String nome, int matricula, String curso, int periodo) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
        setPeriodo(periodo);
    }


    // GETTER E SETTERS
    public String getNome(String nome) {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getMatricula(int matricula) {return this.matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso(String curso) {return this.curso;}
    public void setCurso(String curso) {this.curso = curso;}

    public int getPeriodo(int periodo) {return this.periodo;}
    public void setPeriodo(int periodo) {this.periodo = periodo;}


    // METODOS
    public void exibirDados(){
        System.out.println("""
                =====================
                Nome: %s
                Matrícula: %s
                Curso: %s
                Período: %s
                """.formatted(nome,matricula,curso,periodo));
    }


}
