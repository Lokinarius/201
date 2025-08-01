package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain;

public class Veiculo {
    protected String marca;
    protected String modelo;
    protected int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void ligar(){
        System.out.println("O veículo está ligado");
    }

    public void desligar(){
        System.out.println("O veículo está desligado");
    }

    public void exibirInfo(){

    }
}
