package projeto201.conteudo.java02poo.Aula05Encapsulamento.Ex04Produto;

public class Produto {
    // ATRIBUTOS
    private String nome;
    private String codigo;
    private String categoria;
    private double preco;

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getCategoria() {return categoria;}
    public void setCategoria(String categoria) {this.categoria = categoria;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    // CONSTRUTOR
    public Produto(String nome,String codigo,String categoria, double preco) {
        setNome(nome);
        setCodigo(codigo);
        setCategoria(categoria);
        setPreco(preco);
    }

    // METODO
    public void exibirDados(){
        System.out.println("""
                ====================
                Nome: %s
                Codigo: %s
                Categoria: %s
                Preço: R$%s
                ====================
                """.formatted(getNome(),getCodigo(),getCategoria(),getPreco()));
    }

    public void alterarPreco(double porcentagem){
        double variacao = preco*(porcentagem/100);
        double novoPreco = preco + variacao;

        if(novoPreco >=0){
            preco = novoPreco;
        }else{
            System.out.println("O preço não pode ser negativo");
        }
    }
}
