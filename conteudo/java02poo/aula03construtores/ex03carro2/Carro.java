package projeto201.conteudo.java02poo.aula03construtores.ex03carro2;

public class Carro {
    // ATRIBUTOS
    public String marca;
    public String modelo;
    public int ano;

    // CONSTRUTORES
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }
    public Carro() {

    }

    public void exibirDados(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Ano: "+ano);
    }
}
