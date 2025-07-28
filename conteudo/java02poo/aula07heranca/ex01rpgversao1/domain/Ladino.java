package projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain;

public class Ladino extends Personagem{
    private String adaga;

    public Ladino(String nome, int level, int exp, Atributos atributos, String adaga) {
        super(nome, level, exp, atributos);
        this.adaga = adaga;
    }


    @Override
    public void atacar() {
        int dano = atributos.DEX * 2 + atributos.SOR;
        System.out.println(nome + " atacou pelas sombras com a adaga " + adaga + " causando " + dano + " de dano crítico!");
    }

    @Override
    public void defender() {
        System.out.println(nome + " esquivou agilmente do ataque!");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " usou 'Golpe Furtivo' com a adaga " + adaga + "!");
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Classe: Ladino | Adaga: " + adaga);
    }
}
