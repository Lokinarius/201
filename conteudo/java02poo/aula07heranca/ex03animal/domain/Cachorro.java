package projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain;

public class Cachorro extends Animal{
    public Cachorro(String nome, int idade, String especie, double peso) {
        super(nome, idade, "Cachorro", peso);
    }

    @Override
    public void emitirSom() {
        System.out.println(nome+" latiu!");
    }

    public void abanarRabo(){
        System.out.println(nome+ "está abanando o rabo!");
    }
}
