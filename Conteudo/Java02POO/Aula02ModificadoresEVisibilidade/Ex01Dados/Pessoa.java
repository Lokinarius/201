package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex01Dados;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private char sexo;
    private int idade;
    private double altura;

    // Setters
    public void setNome(String nome) {this.nome = nome;}
    public void setSexo(char sexo) {this.sexo = sexo;}
    public void setIdade(int idade) {this.idade = idade;}
    public void setAltura(double altura) {this.altura = altura;}

    // METODOS
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("altura: "+altura);
    }
}
