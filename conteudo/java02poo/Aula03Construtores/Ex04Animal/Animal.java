package projeto201.conteudo.java02poo.Aula03Construtores.Ex04Animal;

public class Animal {
    // ATRIBUTOS
    public String nome;
    public String especie;
    public boolean vertebrado;
    public String classe;

    // CONSTRUTOR

    public Animal(String nome, String especie, boolean vertebrado, String classe) {
        this.nome = nome;
        this.especie = especie;
        this.vertebrado = vertebrado;
        this.classe = classe;

        // inserindo saída de dados dentro do construtor
        System.out.println("""
        ============================
        Nome: %s
        Nome científico: %s
        Vertebrado: %s
        Classe: %s
        ============================
        """.formatted(nome, especie, vertebrado ? "Sim" : "Não", classe)); // operador ternario dentro da formatação
    }
}
