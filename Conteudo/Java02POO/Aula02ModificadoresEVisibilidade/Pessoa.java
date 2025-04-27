package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade;

public class Pessoa {
    // Atributos
    private String nome;
    private char sexo;
    private int idade;
    private double altura;

    // CONSTRUTOR
    public Pessoa(String nome, char sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }

    // GETTERS E SETTERS

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

    // METODOS
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("Altura: "+altura);
    }
}
