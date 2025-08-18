package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain;

public class Figura {
    // atributos
    protected String nome;

    public Figura(String nome) {
        this.nome = nome;
    }

    // metodos abstratos
    public double calcularArea() {
        return 0;
    }

    public double calcularPerimetro() {
        return 0;
    }

    // metodo de exibição
    public void exibirInfo(){
        System.out.println("""
                Figura: %s
                Área: %.2f
                Perímetro: %.2f
                """.formatted(nome,calcularArea(),calcularPerimetro()));
    }
}
