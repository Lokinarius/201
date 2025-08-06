package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain;

public class Moto extends Veiculo{
    private boolean temPartidaEletrica;

    public Moto(String marca, String modelo, int ano, boolean temPartidaEletrica) {
        super(marca, modelo, ano, 2);
        this.temPartidaEletrica = temPartidaEletrica;
    }

    public void empinar(){
        System.out.println("A moto está empinando");
    }

    @Override
    public void exibirInfo() {
        super.exibirInfo();
        System.out.println("Partida elétrica: "+ (temPartidaEletrica? "Sim": "Não"));
    }
}
