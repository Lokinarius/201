package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

public class ItemCompra {
    // atributos
    private int id;
    private Produto produto;
    private int quantidade;

    // construtor
    public ItemCompra(int id, Produto produto, int quantidade) {
        this.id = id;
        this.produto = produto;
        this.quantidade = quantidade;
    }

    // getters and setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Produto getProduto() {return produto;}
    public void setProduto(Produto produto) {this.produto = produto;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {this.quantidade = quantidade;}


    public double getSubtotal() {
        return produto.getPreco() * quantidade;
    }

    @Override
    public String toString() {
        return quantidade + "x " + produto.getNome() + " = R$" + getSubtotal();
    }
}
