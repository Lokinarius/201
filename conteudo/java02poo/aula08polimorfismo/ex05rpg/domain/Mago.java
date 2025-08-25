package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain;

public class Mago extends Personagem{
    // atributos
    private int mana;

    // construtor
    public Mago(String nome, int nivel, int vida, int mana) {
        super(nome, nivel, vida);
        this.mana = mana;
    }

    @Override
    public void atacar() {
        System.out.println("Conjurou uma bola de fogo");
    }

    @Override
    public void defender() {
        System.out.println("Ergueu um escudo mágico");
    }

    @Override
    public void habilidade() {
        System.out.println("Cojurou uma explosão em área ");
    }

    @Override
    public int energia() {
        return mana;
    }
}
