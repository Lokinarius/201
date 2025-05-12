package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex01Dados;

public class Pessoa {
    // ATRIBUTOS
    public String nome;
    public char sexo;
    public int idade;
    public double altura;

    // METODOS
    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Sexo: "+sexo);
        System.out.println("Idade: "+idade);
        System.out.println("altura: "+altura);
    }
}
