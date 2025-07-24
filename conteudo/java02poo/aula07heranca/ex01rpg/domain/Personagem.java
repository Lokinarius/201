package projeto201.conteudo.java02poo.aula07heranca.ex01rpg.domain;

public class Personagem {
    // ATRIBUTOS
    protected String nome;
    protected int level;
    protected int exp;
    protected Atributos atributos;
    protected int vidaAtual;

    // CONSTRUTOR
    public Personagem(String nome, int level, int exp, Atributos atributos) {
        this.nome = nome;
        this.level = level;
        this.exp = exp;
        this.atributos = atributos;
        this.vidaAtual = getvidaMaxima();
    }


    // METODOS
    public int getvidaMaxima(){
        return atributos.getVIT() * 10;
    }
    public void atacar(){

    }

    public void status(){
        System.out.println("""
                Nome: %s
                Level: %s
                Exp: %s
                """.formatted(nome,level,exp));
    }

}
