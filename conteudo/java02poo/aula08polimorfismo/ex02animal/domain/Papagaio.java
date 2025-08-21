package projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.domain;

public class Papagaio extends Animal{
    // atributos
    private String corPenas;
    private boolean sabeFalar;

    // construtor
    public Papagaio(String nome, int idade, double peso, String corPenas, boolean sabeFalar) {
        super(nome, idade, peso);
        this.corPenas = corPenas;
        this.sabeFalar = sabeFalar;
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println("Canto/repetição de palavras");
    }

    @Override
    public void mover() {
        System.out.println("Voa");
    }

    @Override
    public void alimentar() {
        System.out.println("Sementes/Frutas");
    }

    @Override
    protected String detalhes() {
        return "Cor das penas:"+corPenas+
                "| Sabe falar? "+(sabeFalar?"Sim":"Não");
    }
}
