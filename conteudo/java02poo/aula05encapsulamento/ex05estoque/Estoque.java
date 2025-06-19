package projeto201.conteudo.java02poo.aula05encapsulamento.ex05estoque;

public class Estoque {
    // ATRIBUTOS
    private String codigo;
    private String nome;
    private int quantidade;

    // GETTERS AND SETTERS
    public String getCodigo() {return codigo;}
    public void setCodigo(String codigo) {this.codigo = codigo;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getQuantidade() {return quantidade;}
    public void setQuantidade(int quantidade) {
        if(quantidade >= 0) {
            this.quantidade = quantidade;
        }else{
            quantidade = 0;
        }
    }

    // CONSTRUTOR
    public Estoque(String codigo, String nome, int quantidade) {
        setCodigo(codigo);
        setNome(nome);
        setQuantidade(quantidade);
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ====================
                Código: %s
                Nome: %s
                Quantidade: %s
                ====================
                """.formatted(getCodigo(),getNome(),getQuantidade()));
    }

    public void adicionarQuantidade(int novQtd){
        if(novQtd > 0 ){
            this.quantidade += novQtd;
            System.out.println("Adicionado "+novQtd+" "+nome+" ao estoque.");
        }else{
            System.out.println("valor inválido");
        }
    }

    public void removerQuantidade(int novQtd){
        if(novQtd > 0 && novQtd <= quantidade){
            this.quantidade -= novQtd;
            System.out.println("Removido "+novQtd+" "+nome+" do estoque.");
        }
    }
}
