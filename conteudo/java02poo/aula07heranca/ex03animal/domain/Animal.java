package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Animal {
    // ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String raca;
    protected double peso;

    // CONSTRUTOR
    public Animal(String nome, int idade, String raca, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.raca = raca;
        this.peso = peso;
    }

    // METODOS
    public void emitirSom(){
        System.out.println(nome+" emite um som genérico.");
    }

    public void exibirInfo(){
        System.out.println("""
                Raça: %s
                Nome: %s
                Idade: %s
                Peso: %s
                """.formatted(raca,nome,idade,peso));
    }
}
