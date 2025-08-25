package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain;

public class Clerigo extends Personagem{
    // atributos
    private int fe;

    // construtor
    public Clerigo(String nome, int nivel, int vida, int fe) {
        super(nome, nivel, vida);
        this.fe = fe;
    }

    @Override
    public void atacar() {
        System.out.println("Utilizou um banimento sagrado");
    }

    @Override
    public void defender() {
        System.out.println("Proteção sagrada");
    }

    @Override
    public void habilidade() {
        System.out.println("Curou um aliado");
    }

    @Override
    public int energia() {
        return fe;
    }
}
