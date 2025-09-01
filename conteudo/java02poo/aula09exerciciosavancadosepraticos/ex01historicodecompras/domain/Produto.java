package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

public class Produto {
    // atributos
    private int id;
    private String nome;
    private double preco;
    private int estoque;

    // construtor
    public Produto(int id, String name, double preco, int estoque) {
        this.id = id;
        this.nome = name;
        this.preco = preco;
        this.estoque = estoque;
    }

    // getters and setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {this.preco = preco;}

    public int getEstoque() {return estoque;}
    public void setEstoque(int estoque) {this.estoque = estoque;}

    // to string
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", name='" + nome + '\'' +
                ", preco=" + preco +
                ", estoque=" + estoque +
                '}';
    }
}
