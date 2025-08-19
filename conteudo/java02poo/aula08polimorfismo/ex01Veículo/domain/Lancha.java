package projeto201.conteudo.java02poo.aula08polimorfismo.ex01Veículo.domain;

public class Lancha extends Veiculo{
    private double comprimento;

    public Lancha(String marca, String modelo, int ano, int roda, double tanque, double consumo, double comprimento) {
        super(marca, modelo, ano, roda, tanque, consumo);
        this.comprimento = comprimento;
    }

    @Override
    public void mover() {
        System.out.println("A lancha está Navegando");
    }

    @Override
    public void abastecer() {
        System.out.println("Gasolina/Diesel");
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
