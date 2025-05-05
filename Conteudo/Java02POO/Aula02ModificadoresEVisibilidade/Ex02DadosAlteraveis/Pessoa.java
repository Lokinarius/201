package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex02DadosAlteraveis;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int idade;

    // SETTERS
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // METODOS
    public exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Idade; "+idade);
    }

    public alterarNome(){

    }

    public alterarIdade(){

    }
}
