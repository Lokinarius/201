package projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain;

public class Gerente extends Funcionario {
    //atributos especificos
    private double bonusGestao;

    //construtor
    public Gerente(String nome, int idade, double salario, double bonusGestao) {
        super(nome, idade, salario);
        this.bonusGestao = bonusGestao;
    }

    //metodos herdados
    @Override
    public void calcularPagamento() {
        bonusGestao = salario * 0.2;
        System.out.println("Pagamento: "+(salario+bonusGestao));
    }
}
