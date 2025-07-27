package projeto201.conteudo.java02poo.aula07heranca.ex01rpg.domain;

public class Atributos {
    // atributos
    protected int FOR;
    protected int VIT;
    protected int DEX;
    protected int AGI;
    protected int INT;
    protected int SOR;

    // construtor
    public Atributos(int FOR, int VIT, int DEX, int AGI, int INT, int SOR) {
        this.FOR = FOR;
        this.VIT = VIT;
        this.DEX = DEX;
        this.AGI = AGI;
        this.INT = INT;
        this.SOR = SOR;
    }

    // metodos
    public int getVIT() {
        return VIT;
    }

    public void exibirAtributos(){
        System.out.println("""
                FOR: %s
                VIT: %s
                DEX: %s
                AGI: %s
                INT: %s
                SOR: %s
                """.formatted(FOR,VIT,DEX,AGI,INT,SOR));
    }
}
