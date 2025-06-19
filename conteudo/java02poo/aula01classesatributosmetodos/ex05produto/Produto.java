package projeto201.conteudo.java02poo.aula01classesatributosmetodos.ex05produto;

public class Produto {
    // Atributos
    String nome;
    double preco;
    int desconto;

    // Metodos
    public void aplicarDesconto(){
        preco = preco - (preco * desconto/100);
        System.out.println("O novo preço do produto com desconto de "+desconto+"% é de R$"+preco);
    }
}
