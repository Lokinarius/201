package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain;

public class Retangulo extends Figura {
    // atributos
    private double base;
    private double altura;

    // construtor
    public Retangulo(String cor, String nome, double base, double altura) {
        super(cor, nome);
        this.base = base;
        this.altura = altura;
    }

    // metodos
    @Override
    public void calcularArea() {
        System.out.println("Área: "+base*altura);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro: "+2*(base+altura));
    }

    @Override
    protected String detalhes() {
        return """
                Tamanho da base: %.2f
                Tamanho da altura: %.2f
                """.formatted(base,altura);
    }
}
