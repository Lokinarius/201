package Projeto201.Conteudo.Java02POO.Aula03Construtores.Ex05Funcionario;

public class Funcionario {
    // ATRIBUTOS
    public String nome;
    public String cargo;
    public double salario;

    // CONSTRUTOR
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;

        // inserindo saída de dados dentro do construtor
        System.out.println("""
        ============================
        Nome: %s
        Cargo: %s
        Salário: %s
        ============================
        """.formatted(nome, cargo, salario));
    }
}
