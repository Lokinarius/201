package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain;

public class Ladino extends Personagem {
    // atributos
    private int vigor;

    // construtor
    public Ladino(String nome, int nivel, int vida, int vigor) {
        super(nome, nivel, vida);
        this.vigor = vigor;
    }

    // metodos
    @Override
    public void atacar() {
        System.out.println("Ataca de maneira furtiva");
    }

    @Override
    public void defender() {
        System.out.println("Esquiva-se do golpe ");
    }

    @Override
    public void habilidade() {
        System.out.println("Envena sua arma");
    }

    public int getVigor() {return vigor;}
    public void setVigor(int vigor) {this.vigor = vigor;}

    @Override
    public int energia() {
        return vigor;
    }
}
