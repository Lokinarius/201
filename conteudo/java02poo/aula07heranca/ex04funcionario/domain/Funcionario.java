package projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain;

public class Funcionario {
    // atributos
    protected String nome;
    protected double salario;

    // construtor
    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    // metodos
    public double calcularBonus(){
        return salario*0.1;
    }

    public void exibirInfo(){
        System.out.println("""
                Nome: %s
                Salário: %.2f
                """.formatted(nome,salario));
    }
}
