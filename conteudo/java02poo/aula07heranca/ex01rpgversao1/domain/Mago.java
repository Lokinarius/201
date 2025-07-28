package projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain;

public class Mago extends Personagem{
    private String cajado;


    public Mago(String nome, int level, int exp, Atributos atributos, String cajado) {
        super(nome, level, exp, atributos);
        this.cajado = cajado;
    }

    @Override
    public void atacar() {
        System.out.println(nome + " lançou uma magia de fogo com o cajado " + cajado + " causando " + (atributos.INT * 3) + " de dano mágico!");
    }

    @Override
    public void defender() {
        System.out.println(nome + " ergueu uma barreira mágica!");
    }

    @Override
    public void usarHabilidade() {
        System.out.println(nome + " conjurou 'Raio Arcano' usando o " + cajado + "!");
    }

    @Override
    public void status() {
        System.out.println("Classe: Mago | Cajado: " + cajado);    }
}
