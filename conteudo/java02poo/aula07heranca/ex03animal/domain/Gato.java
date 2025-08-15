package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Gato extends Animal{
    public Gato(String nome, int idade, String especie, double peso) {
        super(nome, idade, "Gato", peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome+" miou!");
    }

    public void arranhar(){
        System.out.println(nome+" está arranhando.");
    }
}
