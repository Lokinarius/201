package projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain;

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
    // combate
    public int getvidaMaxima(){
        return atributos.getVIT() * 10;
    }

    public void atacar(){
        System.out.println(nome+" atacou!");
    }

    public void defender(){
        System.out.println(nome+" defendeu!");
    }

    public void usarHabilidade(){
        System.out.println(nome+" usou habilidade");
    }

    // status
    public void status(){
        System.out.println("""
                Nome: %s
                Level: %s
                Exp: %s
                Vida: %s/%s
                Atributos:
                """.formatted(nome,level,exp,vidaAtual,getvidaMaxima()));
    }

}
