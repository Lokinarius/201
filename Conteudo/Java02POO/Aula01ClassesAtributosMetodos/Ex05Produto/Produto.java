package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos.Ex05Produto;

public class Produto {
    // Atributos
    public String nome;
    public double preco;
    public int desconto;

    // Metodos
    public void aplicarDesconto(){
        preco = preco - (preco * desconto/100);
        System.out.println("O novo preço do produto com desconto de "+desconto+"% é de R$"+preco);
    }
}
