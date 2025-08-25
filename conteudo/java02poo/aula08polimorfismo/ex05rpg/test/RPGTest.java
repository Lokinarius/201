package projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.test;

import projeto201.conteudo.java02poo.aula08polimorfismo.ex05rpg.domain.*;

import java.util.ArrayList;

public class RPGTest {
    public static void main(String[] args) {
        ArrayList<Personagem> personagens = new ArrayList<>();

        personagens.add(new Guerreiro("Thorin", 5, 120, 80));
        personagens.add(new Ladino("Kara", 3, 90, 70));
        personagens.add(new Mago("Eldrin", 7, 100, 150));
        personagens.add(new Clerigo("Lyra", 4, 110, 95));

        for(Personagem p: personagens){
            p.exibirInfo();
            p.atacar();
            p.defender();
            p.habilidade();
            System.out.println("------------------");
        }
    }
}
