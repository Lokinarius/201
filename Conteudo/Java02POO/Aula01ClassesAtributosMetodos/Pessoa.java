package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int idade;

    // CONSTRUTOR
    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    // METODOS
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade: "+idade);
    }
}
