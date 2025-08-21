package projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.test;

import projeto201.conteudo.java02poo.aula08polimorfismo.ex02animal.domain.*;

import java.util.ArrayList;

public class AnimalTest {
    public static void main(String[] args) {
        ArrayList<Animal> animais = new ArrayList<>();

        Animal cachorro1 = new Cachorro("Rex", 5, 25.0, "Labrador");
        Animal cachorro2 = new Cachorro("Thor", 3, 18.5, "Bulldog");

        Animal gato1 = new Gato("Mimi", 2, 4.0, "Branco");
        Animal gato2 = new Gato("Nina", 4, 5.2, "Preto");

        Animal papagaio1 = new Papagaio("Loro", 7, 1.2, "Verde", true);
        Animal papagaio2 = new Papagaio("Zeca", 3, 0.9, "Amarelo", false);

        Animal peixe1 = new Peixe("Nemo", 1, 0.2, "Água salgada");
        Animal peixe2 = new Peixe("Goldie", 2, 0.3, "Água doce");

        Animal iguana1 = new Iguana("Iggy", 6, 3.5, "Verde");
        Animal iguana2 = new Iguana("Spike", 4, 2.8, "Marrom");

        // Adicionando todos na lista
        animais.add(cachorro1);
        animais.add(cachorro2);
        animais.add(gato1);
        animais.add(gato2);
        animais.add(papagaio1);
        animais.add(papagaio2);
        animais.add(peixe1);
        animais.add(peixe2);
        animais.add(iguana1);
        animais.add(iguana2);

        //loop
        for (Animal a: animais){
            a.exibirDados();
            a.emitirSom();
            a.mover();
            a.alimentar();
            System.out.println("-------------------------");
        }
    }
}
