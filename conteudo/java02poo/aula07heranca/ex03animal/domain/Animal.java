package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Animal {
    // ATRIBUTOS
    protected String nome;
    protected int idade;
    protected String especie;
    protected double peso;
    protected String tipoAnimal;

    // CONSTRUTOR
    public Animal(String nome, int idade, String especie, double peso, String tipoAnimal) {
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.peso = peso;
        this.tipoAnimal = tipoAnimal;
    }

    // METODOS
    public void emitirSom(){
        System.out.println(nome+" emite um som genérico.");
    }

    public void exibirInfo(){
        System.out.println("""
                Tipo de animal: %s
                Espécie: %s
                Nome: %s
                Idade: %s
                Peso: %s
                """.formatted(tipoAnimal,especie,nome,idade,peso));
    }
}
