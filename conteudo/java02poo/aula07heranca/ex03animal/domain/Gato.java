package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Gato extends Animal{
    public Gato(String nome, int idade, String especie, double peso, String tipoAnimal) {
        super(nome, idade, "Gato", peso, "Mamífero");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome+" miou!");
    }
}
