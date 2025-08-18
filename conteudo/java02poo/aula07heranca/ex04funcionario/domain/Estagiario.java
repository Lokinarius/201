package projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain;

public class Estagiario extends Funcionario {
    private int horasTrabalho;

    public Estagiario(String nome, double salario, int horasTrabalho) {
        super(nome, salario);
        this.horasTrabalho = horasTrabalho;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.05;
    }

    @Override
    public void exibirInfo() {
        System.out.println("""
                Nome: %s
                Salario: %.2f
                Horas de Trabalho: %d
                """.formatted(nome,salario,horasTrabalho));
    }
}
