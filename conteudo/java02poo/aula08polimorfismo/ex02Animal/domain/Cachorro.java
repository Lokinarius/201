package projeto201.conteudo.java02poo.aula08polimorfismo.ex02Animal.domain;

public class Cachorro extends Animal{
    // atributos
    private String raca;

    public Cachorro(String nome, int idade, double peso, String raca) {
        super(nome, idade, peso);
        this.raca = raca;
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println("Latido");
    }

    @Override
    public void mover() {
        System.out.println("corre/anda");
    }

    @Override
    public void alimentar() {
        System.out.println("ração/carne");
    }

    @Override
    protected String detalhes() {
        return "Raça: "+raca;
    }
}
