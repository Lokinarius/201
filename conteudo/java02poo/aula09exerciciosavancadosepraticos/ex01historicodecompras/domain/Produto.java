package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

public class Produto {
    // Atributos
    private int id;
    private String nome;
    private double preco;
    private String categoria;

    // Construtor
    public Produto(int id, String nome, double preco, String categoria) {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
    }

    // Getter and Setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    // To String
    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", categoria='" + categoria + '\'' +
                '}';
    }
}
