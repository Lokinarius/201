package projeto201.conteudo.java02poo.aula08polimorfismo.ex01Veículo.domain;

public class Caminhao extends Veiculo {
    private double capacidadeCarga;

    public Caminhao(String marca, String modelo, int ano, int roda, double tanque, double consumo, double capacidadeCarga) {
        super(marca, modelo, ano, roda, tanque, consumo);
        this.capacidadeCarga = capacidadeCarga;
    }

    @Override
    public void mover() {
        System.out.println("O caminhão está transportando cargas nas rodovias");
    }

    @Override
    public void abastecer() {
        System.out.println("diesel");
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
