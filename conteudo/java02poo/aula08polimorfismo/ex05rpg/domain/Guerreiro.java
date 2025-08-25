package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain;

public class Guerreiro extends Personagem {
    // atributo
    private int vigor;

    // construtor
    public Guerreiro(String nome, int nivel, int vida, int vigor) {
        super(nome, nivel, vida);
        this.vigor = vigor;
    }

    // metodos
    @Override
    public void atacar() {
        System.out.println("Golpeia com sua espada");
    }

    @Override
    public void defender() {
        System.out.println("Bloqueia com seu escudo");
    }

    @Override
    public void habilidade() {
        System.out.println("golpe devastador");
    }

    // getter e setters
    public int getVigor() {return vigor;}
    public void setVigor(int vigor) {this.vigor = vigor;}

    // vigor
    @Override
    public int energia() {
        return vigor;
    }
}
