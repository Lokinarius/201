package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain;

public class Circulo extends Figura {
    // atributos
    private double raio;

    public Circulo( double raio) {
        super("Círculo");
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(raio,2);
    }

    @Override
    public double calcularPerimetro() {
        return 2*Math.PI*raio;
    }
}
