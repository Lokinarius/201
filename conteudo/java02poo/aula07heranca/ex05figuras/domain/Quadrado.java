package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain;

public class Quadrado extends Figura {
    // atributos
    private double lado;

    // construtor
    public Quadrado(double lado) {
        super("Quadrado");
        this.lado = lado;
    }

    // metodos

    @Override
    public double calcularArea() {
        return lado*lado;
    }

    @Override
    public double calcularPerimetro() {
        return 4*lado;
    }
}
