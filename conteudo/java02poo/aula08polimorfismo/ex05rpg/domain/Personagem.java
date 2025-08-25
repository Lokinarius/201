package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain;

public abstract class Personagem {
    // abstract
    protected String nome;
    protected int nivel;
    protected int vida;

    // construtor
    public Personagem(String nome, int nivel, int vida) {
        this.nome = nome;
        this.nivel = nivel;
        this.vida = vida;
    }

    // metodos
    public abstract void atacar();
    public abstract void defender();
    public abstract void habilidade();
    public abstract int energia();


    public void exibirInfo(){
        System.out.println("""
                Nome: %s
                Nivel: %d
                Vida: %d
                Energia %d
                """.formatted(nome,nivel,vida,energia()));
    }

}
