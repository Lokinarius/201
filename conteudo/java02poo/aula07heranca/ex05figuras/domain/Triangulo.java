package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain;

public class Triangulo extends Figura{
    // atributos
    private double base;
    private double altura;
    private double lado1,lado2,lado3;

    // construtor


    public Triangulo( double base, double altura, double lado1, double lado2, double lado3) {
        super("Triangulo");
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // metodos
    @Override
    public double calcularArea() {
        return (base*altura)/2;
    }

    @Override
    public double calcularPerimetro() {
        return lado1+lado2+lado3;
    }
}
