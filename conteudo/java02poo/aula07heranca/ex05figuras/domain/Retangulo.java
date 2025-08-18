package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain;

public class Retangulo extends Figura{
    // atributos
    private double base;
    private double altura;

    // construtor
    public Retangulo(double base, double altura) {
        super("Retangulo");
        this.base = base;
        this.altura = altura;
    }

    // metodos


    @Override
    public double calcularArea() {
        return base*altura;
    }

    @Override
    public double calcularPerimetro() {
        return 2*(base*altura);
    }
}
