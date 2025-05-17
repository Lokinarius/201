package Projeto201.Conteudo.Java02POO.Aula03Construtores.Ex03Carro2;

public class Carro {
    // ATRIBUTOS
    public String marca;
    public String modelo;
    public int ano;

    // CONSTRUTORES
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = 2023;
    }
    public Carro() {

    }

    // METODOS
    public void setAno(int ano) {
        this.ano = ano;
    }

    public void exibirDados(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
