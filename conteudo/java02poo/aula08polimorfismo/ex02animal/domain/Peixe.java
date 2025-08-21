package projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.domain;

public class Peixe extends Animal{
    // atributos
    private String tipoAgua;

    //construtor
    public Peixe(String nome, int idade, double peso, String tipoAgua) {
        super(nome, idade, peso);
        this.tipoAgua = tipoAgua;
    }

    // metodos
    @Override
    public void emitirSom() {
        System.out.println("Nenhum");
    }

    @Override
    public void mover() {
        System.out.println("Nada");
    }

    @Override
    public void alimentar() {
        System.out.println("ração/algas");
    }

    @Override
    protected String detalhes() {
        return "Veio de que tipo de água? "+tipoAgua;
    }
}
