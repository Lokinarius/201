package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain;

public class Circulo extends Figura{
    // atributos
    private double raio;

    // construtor
    public Circulo(String cor, String nome, double raio) {
        super(cor, nome);
        this.raio = raio;
    }

    // metodos
    @Override
    public void calcularArea() {
        System.out.println("Área: "+Math.PI * Math.pow(raio,2));
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro: "+2*Math.PI*raio);
    }

    @Override
    protected String detalhes() {
        return """
                Raio: %.2f
                """.formatted(raio);
    }
}
