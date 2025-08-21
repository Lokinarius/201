package projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain;

public abstract class Funcionario {
    //Atributos
    protected String nome;
    protected int idade;
    protected double salario;

    //construtor
    public Funcionario(String nome, int idade, double salario) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
    }

    //metodos
    public void exibirDados(){

    }

    public abstract void calcularPagamento();
}
