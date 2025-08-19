package projeto201.conteudo.java02poo.aula08polimorfismo.ex01Veículo.domain;

public class Aviao extends Veiculo{
    private double envergadura;
    private int motores;

    public Aviao(String marca, String modelo, int ano, int roda, double tanque, double consumo, double envergadura, int motores) {
        super(marca, modelo, ano, roda, tanque, consumo);
        this.envergadura = envergadura;
        this.motores = motores;
    }

    @Override
    public void mover() {
        System.out.println("O avião está voando");
    }

    @Override
    public void abastecer() {
        System.out.println("Querosene");
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
