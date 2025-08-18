package projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain;

public class Gerente extends Funcionario {
    // atributos
    private String departamento;

    public Gerente(String nome, double salario, String departamento) {
        super(nome, salario);
        this.departamento = departamento;
    }

    @Override
    public double calcularBonus() {
        return salario * 0.2;
    }

    @Override
    public void exibirInfo() {
        System.out.println("""
                Nome: %s
                Salário: %.2f
                Departamento: %s
                """.formatted(nome,salario,departamento));
    }
}
