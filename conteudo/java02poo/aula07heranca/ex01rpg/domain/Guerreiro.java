package projeto201.conteudo.java02poo.aula07heranca.ex01rpg.domain;

public class Guerreiro extends Personagem {
    private String arma;

    public Guerreiro(String nome, int level, int exp, Atributos atributos, String arma) {
        super(nome, level, exp, atributos);
        this.arma = arma;
    }


    // OVERRIDE
    @Override
    public int getvidaMaxima() {
        return super.getvidaMaxima();
    }

    @Override
    public void atacar() {
        System.out.println(nome+" atacou com "+arma+" causando "+atributos.FOR*2+"de dano");
    }

    @Override
    public void defender() {
        System.out.println(nome+" levantou seu escudo e reduziu o dano");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " usou 'Golpe Furioso' com a " + arma + "!");
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Classe: Guerreiro | Arma: " + arma);
    }
}
