package projeto201.conteudo.java02poo.aula08polimorfismo.ex01veículo.domain;

public abstract class Veiculo {
    // ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int roda;
    protected double tanque;
    protected double consumo;

    // CONSTRUTOR
    public Veiculo(String marca, String modelo, int ano, int roda, double tanque, double consumo) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.roda = roda;
        this.tanque = tanque;
        this.consumo = consumo;
    }

    // METODOS ABSTRATOS
    public abstract void mover();
    public abstract void abastecer();
    public abstract double calcularAutonomia();


    // gancho para outras classes
    protected abstract String detalhes();

    // EXIBIR DADOS
    public final void exibirInfo(){
        System.out.println("""
                Marca: %s
                Modelo: %s
                Ano: %s
                Rodas: %s
                %s
                """.formatted(marca, modelo, ano, roda, detalhes()));

    }
}
