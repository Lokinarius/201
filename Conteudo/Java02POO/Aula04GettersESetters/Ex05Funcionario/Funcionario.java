package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex05Funcionario;

public class Funcionario {
    // ATRIBUTOS
    private String nome;
    private String cargo;
    private double salario;

    // CONSTRUTOR

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }


    // GETTER AND SETTERS

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    // METODOS
    public void ExibirDados(){
        System.out.println("""
                =========================
                Nome: %s
                Cargo: %s
                Salário: %s
                =========================
                """.formatted(getNome(),getCargo(),getSalario()));
    }

}
