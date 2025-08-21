package projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain;

public class Estagiario extends Funcionario{
    //atributos especificos
    private double horas;
    private double horasExtras;

    //construtor

    public Estagiario(String nome, int idade, double salario, double horas,double horasExtras) {
        super(nome, idade, salario);
        this.horas = horas;
        this.horasExtras = horasExtras;
    }

    //metodos herdados
    @Override
    public void calcularPagamento() {
        horas = salario/160;
        double pagamentoFinal = salario + (horas * horasExtras);

        System.out.println("Pagamento: "+(salario+pagamentoFinal));
    }
}
