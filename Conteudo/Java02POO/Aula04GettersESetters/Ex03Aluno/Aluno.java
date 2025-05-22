package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex03Aluno;

public class Aluno {
    // ATRIBUTOS
    public String nome;
    public int matricula;
    public double nota1;
    public double nota2;

    // CONSTRUTOR
    public Aluno(String nome, int matricula, double nota1, double note2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = note2;
    }

    // GETTERS AND SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public double getNota1() {return nota1;}
    public void setNota1(double nota1) {this.nota1 = nota1;}

    public double getNota2() {return nota2;}
    public void setNota2(double nota2) {this.nota2 = nota2;}

    public double getNotaFinal() {return (nota1+nota2)/2;}

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ===========================
                Aluno: %s
                Matrícula: %s
                Nota Final: %s
                """.formatted(getNome(),getMatricula(),getNotaFinal()));
        System.out.println("Situação: "+(isAprovado()? "Aprovado": "Reprovado"));
    }

    public boolean isAprovado(){
        return getNotaFinal() >= 6;
    }
}
