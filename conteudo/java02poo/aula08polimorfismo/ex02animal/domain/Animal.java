package projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.domain;

public abstract class Animal {
    // atributos
    protected String nome;
    protected int idade;
    protected double peso;

    // construtor
    public Animal(String nome, int idade, double peso) {
        this.nome = nome;
        this.idade = idade;
        this.peso = peso;
    }

    // Metodos abstratos
    public abstract void emitirSom();
    public abstract void mover();
    public abstract void alimentar();

    // gancho para outras classes
    protected abstract String detalhes();

    // metodo exibir dados
    public void exibirDados(){
        System.out.println("""
                Nome: %s
                Idade: %s
                Peso: %s
                %s
                """.formatted(nome,idade,peso, detalhes()));
    }



}
