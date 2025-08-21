package projeto201.conteudo.java02poo.aula08polimorfismo.ex01veículo.test;

import projeto201.conteudo.java02poo.aula08polimorfismo.ex01veículo.domain.*;
import java.util.ArrayList;

public class VeiculoTest {
    public static void main(String[] args) {
        ArrayList<Veiculo> veiculos = new ArrayList<>();

        veiculos.add(new Carro("Toyota", "Corolla", 2020, 4, 50, 12,4));
        veiculos.add(new Moto("Honda", "CB 500", 2021, 2, 15, 25, 500));
        veiculos.add(new Caminhao("Volvo", "FH16", 2019, 6, 200, 3, 25));
        veiculos.add(new Lancha("Yamaha", "VX Cruiser", 2022, 0, 300, 0.8, 7));
        veiculos.add(new Aviao("Boeing", "737", 2018, 6, 5000, 0.2, 35.8, 2));



        for(Veiculo v: veiculos){
            v.exibirInfo();
            v.mover();
            v.abastecer();
            System.out.println("Autonomia: " + v.calcularAutonomia() + " km");
            System.out.println("---------------------");
        }
    }
}
