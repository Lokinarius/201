package projeto201.conteudo.java02poo.aula03construtores.ex01pessoa;

public class Pessoa {
    // ATRIBUTOS
    public String nome;
    public int idade;

    // CONSTRUTOR
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // METODOS
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
