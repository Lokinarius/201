package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain;

public class Caminhao extends Veiculo{
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, double capacidadeCarga) {
        super(marca, modelo, ano, 6);
        this.capacidadeCarga = capacidadeCarga;
    }

    public void carregarCarga(){
        System.out.println("Caminhão carregando "+capacidadeCarga);
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Capacidade de carga: "+capacidadeCarga+"toneladas");
    }
}
