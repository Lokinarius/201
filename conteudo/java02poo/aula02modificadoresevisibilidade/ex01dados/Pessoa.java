package projeto201.conteudo.java02poo.aula02modificadoresevisibilidade.ex01dados;

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
