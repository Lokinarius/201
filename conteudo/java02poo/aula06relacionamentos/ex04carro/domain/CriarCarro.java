package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarCarro {
    public static List<Carro> gerarCarros(List<Proprietario> proprietarios){
        List<Carro> carros = new ArrayList<>();

        carros.add(adicionarCarro("Toyota", "Corolla", 2020, "ABC1D23", proprietarios.get(0)));
        carros.add(adicionarCarro("Honda", "Civic", 2019, "DEF4G56", proprietarios.get(1)));
        carros.add(adicionarCarro("Ford", "Ka", 2018, "GHI7J89", proprietarios.get(2)));
        carros.add(adicionarCarro("Chevrolet", "Onix", 2021, "JKL0M12", proprietarios.get(3)));
        carros.add(adicionarCarro("Volkswagen", "Gol", 2017, "MNO3P45", proprietarios.get(4)));
        carros.add(adicionarCarro("Hyundai", "HB20", 2020, "PQR6S78", proprietarios.get(5)));
        carros.add(adicionarCarro("Fiat", "Argo", 2022, "STU9V01", proprietarios.get(6)));
        carros.add(adicionarCarro("Renault", "KwID", 2016, "VWX2Y34", proprietarios.get(0)));
        carros.add(adicionarCarro("Jeep", "Compass", 2023, "YZA5B67", proprietarios.get(1)));
        carros.add(adicionarCarro("Peugeot", "208", 2019, "BCD8E90", proprietarios.get(2)));
        return carros;
    }

    // Método auxiliar
    private static Carro adicionarCarro(String marca, String modelo, int ano, String placa, Proprietario proprietario) {
        Carro carro = new Carro(marca, modelo, ano, placa, proprietario);
        proprietario.getCarros().add(carro);
        return carro;
    }
}
