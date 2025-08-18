package projeto201.conteudo.java02poo.aula07heranca.ex05figuras.test;

import projeto201.conteudo.java02poo.aula07heranca.ex05figuras.domain.*;

import java.util.ArrayList;

public class FiguraTest {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Circulo(5));
        figuras.add(new Circulo(10));
        figuras.add(new Quadrado(4));
        figuras.add(new Quadrado(7));
        figuras.add(new Retangulo(6, 3));
        figuras.add(new Retangulo(10, 5));
        figuras.add(new Triangulo(6, 4, 6, 5, 7));
        figuras.add(new Triangulo(10, 8, 10, 9, 11));

        for(Figura f : figuras){
            f.exibirInfo();
            System.out.println("----------------------");
        }


    }
}
