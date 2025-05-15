package Projeto201.Conteudo.Java02POO.Aula03Construtores.Ex02Carro;

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
