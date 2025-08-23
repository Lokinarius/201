package projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.test;

import projeto201.conteudo.java02poo.aula08polimorfismo.ex04figuras.domain.*;

import java.util.ArrayList;

public class FiguraTest {
    public static void main(String[] args) {
        ArrayList<Figura> figuras = new ArrayList<>();

        figuras.add(new Retangulo("Vermelho", "Retângulo 1", 5, 10));
        figuras.add(new Quadrado("Azul", "Quadrado 1", 7));
        figuras.add(new Triangulo("Verde", "Triângulo 1", 6, 8, 5,5,9));
        figuras.add(new Circulo("Amarelo", "Círculo 1", 4));


        for(Figura figura: figuras){
            figura.exibirInfo();
            figura.calcularArea();
            figura.calcularPerimetro();
            System.out.println("------------------------");
        }
    }
}
