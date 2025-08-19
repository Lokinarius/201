package projeto201.conteudo.java02poo.aula08polimorfismo.ex01Veículo.domain;

public class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int ano, int roda, double tanque, double consumo, int cilindradas) {
        super(marca, modelo, ano, roda, tanque, consumo);
        this.cilindradas = cilindradas;
    }

    @Override
    public void mover() {
        System.out.println("A Moto está cortando caminho");
    }

    @Override
    public void abastecer() {
        System.out.println("gasolina");
    }

    @Override
    public double calcularAutonomia() {
        return tanque*consumo;
    }
}
