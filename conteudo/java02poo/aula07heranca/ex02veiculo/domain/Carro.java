package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain;

public class Carro extends Veiculo{
    private int portas;

    public Carro(String marca, String modelo, int ano, int portas) {
        super(marca, modelo, ano, 4);
        this.portas = portas;
    }

    public void abrirPortaMalas(){
        System.out.println("Porta malas aberto.");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Portas: "+portas);
    }
}
