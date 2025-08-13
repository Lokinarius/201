package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String especie, double peso, String tipoAnimal) {
        super(nome, idade, "Cachorro", peso, "Mamifero");
    }

    @Override
    public void emitirSom() {
        System.out.println(nome+" latiu!");
    }
}
