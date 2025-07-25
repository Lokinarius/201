package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

public class Aluno {
    // ATRIBUTOS
    private String nome;
    private int matricula;
    private String curso;
    private int periodo;
    private Sede sede;

    // CONSTRUTOR
    public Aluno(String nome, int matricula, String curso, int periodo, Sede sede) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
        setPeriodo(periodo);
        this.sede = sede;

        if(sede != null){
            sede.adicionarAluno(this);
        }
    }


    // GETTER E SETTERS
    public String getNome() {return this.nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getMatricula() {return this.matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getCurso() {return this.curso;}
    public void setCurso(String curso) {this.curso = curso;}

    public int getPeriodo() {return this.periodo;}
    public void setPeriodo(int periodo) {this.periodo = periodo;}

    public Sede getSede() {return sede;}
    public void setSede(Sede sede) {this.sede = sede;}

    // METODOS
    public void exibirDados(){
        System.out.println("""
                =====================
                Nome: %s
                Matrícula: %s
                Curso: %s
                Período: %s
                Sede: %s
                """.formatted(nome,matricula,curso,periodo,sede));
    }


}
