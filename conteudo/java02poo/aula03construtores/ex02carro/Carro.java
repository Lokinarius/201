package projeto201.conteudo.java02poo.aula03construtores.ex02carro;

public class Carro {
    // ATRIBUTOS
    public String marca;
    public String modelo;

    // CONSTRUTOR
    public Carro(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // METODOS
    public void exibirDados(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
    }
}
