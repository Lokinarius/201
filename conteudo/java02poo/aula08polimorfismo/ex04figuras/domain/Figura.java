package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain;

public abstract class Figura {
    // Atributos
    protected String cor;
    protected String nome;

    // Construtor
    public Figura(String cor, String nome) {
        this.cor = cor;
        this.nome = nome;
    }

    // Metodos
    public abstract void calcularArea();
    public abstract void calcularPerimetro();

    // gancho
    protected abstract String detalhes();

    public void exibirInfo(){
        System.out.println("""
                Nome: %s
                Cor: %s
                %s
                """.formatted(nome,cor,detalhes()));
    }
}
