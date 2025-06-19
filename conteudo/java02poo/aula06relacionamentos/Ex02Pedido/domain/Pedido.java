package projeto201.conteudo.java02poo.aula06relacionamentos.Ex02Pedido.domain;

public class Pedido {
    // ATRIBUTOS
    private String nome;
    private String endereco;
    private Produto produto;
    private int quantidade;

    // GETTERS AND SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {return endereco;}
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Produto getProduto() {return produto;}
    public void setProduto(Produto produto) {this.produto = produto;}

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if(quantidade > 0){
            this.quantidade = quantidade;
        }else{
            System.out.println("Quantidade inválida. Definido como 1.");
            this.quantidade = 1;
        }
    }

    // CONSTRUTOR
    public Pedido(String nome, String endereco, Produto produto, int quantidade) {
        setNome(nome);
        setEndereco(endereco);
        setProduto(produto);
        setQuantidade(quantidade);
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ==================
                Nome: %s
                Endereço: %s
                Produto: %s
                Categoria: %s
                Preço: %s
                """.formatted(
                getNome(),
                getEndereco(),
                produto.getNomeProduto(),
                produto.getCategoria(),
                produto.getPreco(),
                getQuantidade(),
                produto.getPreco() * getQuantidade()
        ));
    }
}
