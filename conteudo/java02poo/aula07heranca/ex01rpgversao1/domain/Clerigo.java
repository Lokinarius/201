package projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain;

public class Clerigo extends Personagem{
    private String simboloSagrado;

    public Clerigo(String nome, int level, int exp, Atributos atributos) {
        super(nome, level, exp, atributos);
        this.simboloSagrado = simboloSagrado;
    }

    @Override
    public void atacar() {
        System.out.println(nome+"lançou uma rajada divina com o simbolo "+ simboloSagrado+" causando "+(atributos.INT*2)+" de dano sagrado!");
    }

    @Override
    public void defender() {
        System.out.println(nome + " rezou e fortaleceu suas defesas espirituais!");
    }

    @Override
    public void usarHabilidade() {
        int cura = atributos.VIT * 2;
        System.out.println(nome + " conjurou 'Cura Sagrada' usando o símbolo " + simboloSagrado +
                " e recuperou " + cura + " de vida!");
        vidaAtual += cura;
        if (vidaAtual > getVidaMaxima()) vidaAtual = getVidaMaxima();
    }

    private int getVidaMaxima() {
        return super.getvidaMaxima();

    }

    @Override
    public void status() {
        super.status();
        System.out.println("Classe: Clérigo | Símbolo Sagrado: " + simboloSagrado);
    }
}
