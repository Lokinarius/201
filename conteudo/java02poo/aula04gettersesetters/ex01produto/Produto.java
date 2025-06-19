package projeto201.conteudo.java02poo.aula04gettersesetters.ex01produto;

public class Produto {
    // ATRIBUTOS
    public String nome;
    public double preco;

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public double getPreco() {return preco;}
    public void setPreco(double preco) {
        if(preco>0){
            this.preco = preco;
        }else{
            System.out.println("Preço inválido!");
        }
    }

    //CONSTRUTOR
    public Produto(String nome, double preco) {
        this.nome = nome;
        setPreco(preco);
    }

    // METODO
    public void exibirDados(){
        System.out.println("""
                ==========================
                Nome: %s
                Preço: R$%s
                ==========================
                """.formatted(getNome(),getPreco()));
    }
}
