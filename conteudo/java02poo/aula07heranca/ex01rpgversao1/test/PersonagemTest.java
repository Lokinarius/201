package projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.test;

import projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain.Clerigo;
import projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain.Guerreiro;
import projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain.Ladino;
import projeto201.conteudo.java02poo.aula07heranca.ex01rpgversao1.domain.Mago;

public class PersonagemTest {
    public class RPGTest {
        public static void main(String[] args) {
            Guerreiro guerreiro = new Guerreiro();
            Ladino ladino = new Ladino();
            Mago mago = new Mago();
            Clerigo clerigo = new Clerigo();

            System.out.println(guerreiro);
            System.out.println(ladino);
            System.out.println(mago);
            System.out.println(clerigo);
        }
    }
}
