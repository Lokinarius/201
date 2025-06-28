package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarProprietario {
    public static List<Proprietario> gerarProprietarios(){
        List<Proprietario> proprietarios = new ArrayList<>();

        proprietarios.add(new Proprietario("João Silva", "111.111.111-11", new ArrayList<>()));
        proprietarios.add(new Proprietario("Maria Oliveira", "222.222.222-22", new ArrayList<>()));
        proprietarios.add(new Proprietario("Carlos Souza", "333.333.333-33", new ArrayList<>()));
        proprietarios.add(new Proprietario("Ana Paula", "444.444.444-44", new ArrayList<>()));
        proprietarios.add(new Proprietario("Fernanda Costa", "555.555.555-55", new ArrayList<>()));
        proprietarios.add(new Proprietario("Pedro Henrique", "666.666.666-66", new ArrayList<>()));
        proprietarios.add(new Proprietario("Lucas Lima", "777.777.777-77", new ArrayList<>()));

        return proprietarios;
    }
}
