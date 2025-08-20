package projeto201.conteudo.java02poo.aula08polimorfismo.ex01Veículo.domain;

public class Carro extends Veiculo {
    private int portas;

    public Carro(String marca, String modelo, int ano, int roda, double tanque, double consumo, int portas) {
        super(marca, modelo, ano, roda, tanque, consumo);
        this.portas = portas;
    }

    @Override
    public void mover() {
        System.out.println("O carro está sendo dirigido nas ruas");
    }

    @Override
    public void abastecer() {
        System.out.println("gasolina/álcool/diesel");
    }

    @Override
    public double calcularAutonomia() {
        return 0;
    }

    @Override
    protected String detalhes() {
        return "Portas: " + portas;
    }
}
