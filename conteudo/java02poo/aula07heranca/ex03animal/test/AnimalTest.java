package projeto201.conteudo.java02poo.aula07heranca.ex03animal.test;

import projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain.Animal;
import projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain.Cachorro;
import projeto201.conteudo.java02poo.aula07heranca.ex03animal.domain.Gato;

import java.util.ArrayList;
import java.util.List;

public class AnimalTest {
    public static void main(String[] args) {
        List<Animal> animais = new ArrayList<>();

        Gato gato1 = new Gato("Baiano",3,"Angorá",4.5);
        Cachorro cachorro1 = new Cachorro("Caramelo",5,"Poodle",8);

        animais.add(gato1);
        animais.add(cachorro1);

        for(Animal a: animais){
            a.exibirInfo();
            a.emitirSom();

            // chamada para metodos especificos
            if(a instanceof Gato g){
                g.arranhar();
            }
            if(a instanceof Cachorro c){
                c.abanarRabo();
            }
            System.out.println("----------------------------");
        }
    }
}
