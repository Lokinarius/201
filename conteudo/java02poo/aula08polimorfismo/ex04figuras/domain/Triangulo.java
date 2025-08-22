package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain;

public class Triangulo extends Figura{
    //atributos
    private double base;
    private double altura;
    private double lado1,lado2,lado3;

    // construtor
    public Triangulo(String cor, String nome, double base, double altura, double lado1, double lado2, double lado3) {
        super(cor, nome);
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    // metodos
    @Override
    public void calcularArea() {
        System.out.println("Área: "+(base*altura)/2);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro: "+lado1+lado2+lado3);
    }

    @Override
    protected String detalhes() {
        return """
                Base: %.2f
                Altura: %.2f
                """.formatted(base,altura);
    }
}
