package projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.domain;

public class Gato extends Animal{
    // atributos
    private String pelagem;

    //construtor


    public Gato(String nome, int idade, double peso, String pelagem) {
        super(nome, idade, peso);
        this.pelagem = pelagem;
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println("miado");
    }

    @Override
    public void mover() {
        System.out.println("anda silenciosamente");
    }

    @Override
    public void alimentar() {
        System.out.println("ração/peixe");
    }

    @Override
    protected String detalhes() {
        return "Pelagem: "+pelagem;
    }
}
