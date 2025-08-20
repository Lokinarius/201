package projeto201.conteudo.java02poo.aula08polimorfismo.ex02Animal.domain;

public class Iguana extends Animal{
    // atributos
    private String comprimento;

    //construtor
    public Iguana(String nome, int idade, double peso, String comprimento) {
        super(nome, idade, peso);
        this.comprimento = comprimento;
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println("Grunhido");
    }

    @Override
    public void mover() {
        System.out.println("Rasteja");
    }

    @Override
    public void alimentar() {
        System.out.println("Folhas e frutas");
    }

    @Override
    protected String detalhes() {
        return "Comprimento: "+comprimento;
    }
}
