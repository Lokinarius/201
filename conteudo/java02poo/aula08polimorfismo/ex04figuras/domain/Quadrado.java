package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain;

public class Quadrado extends Figura {
    // atributos
    private double lado;

    // construtor
    public Quadrado(String cor, String nome, double lado) {
        super(cor, nome);
        this.lado = lado;
    }

    // Metodos
    @Override
    public void calcularArea() {
        System.out.println("Área: "+lado*lado);
    }

    @Override
    public void calcularPerimetro() {
        System.out.println("Perímetro: "+lado*4);
    }

    @Override
    protected String detalhes() {
        return "tamanho de um lado: "+lado;
    }
}
