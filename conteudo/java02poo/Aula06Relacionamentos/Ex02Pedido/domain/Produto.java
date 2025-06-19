package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex02Pedido.domain;

public class Produto {
    // ATRIBUTOS
    private String nomeProduto;
    private String categoria;
    private double preco;

    // GETTERS AND SETTERS
    public String getNomeProduto() {return nomeProduto;}
    public void setNomeProduto(String nomeProduto) {
        if(nomeProduto == null || nomeProduto.isBlank()){
            this.nomeProduto = "Produto desconhecido";
        }else{
            this.nomeProduto = nomeProduto;
        }
    }

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {
        if(categoria == null || categoria.isBlank()){
            this.categoria = "Categoria desconhecida";
        }else{
            this.categoria = categoria;
        }
    }

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido. Definindo preço como 0.0");
            this.preco = 0.0;
        }
    }

    // CONSTRUTOR
    public Produto(String nomeProduto, String categoria, double preco) {
        setNomeProduto(nomeProduto);
        setCategoria(categoria);
        setPreco(preco);
    }

    // METODOS

}
