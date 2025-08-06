package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain;

public class Veiculo {
    // ATRIBUTOS
    protected String marca;
    protected String modelo;
    protected int ano;
    protected int roda;


    public Veiculo(String marca, String modelo, int ano, int roda) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.roda = roda;
    }


    public void ligar(){
        System.out.println("O veículo está ligado");
    }

    public void desligar(){
        System.out.println("O veículo está desligado");
    }

    public void exibirInfo(){
        System.out.println("""
                Marca: %s
                Modelo: %s
                Ano: %s
                Rodas: %s
                """.formatted(marca,modelo,ano, roda));
    }
}
