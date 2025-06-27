package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarProprietario {
    public static List<Proprietario> gerarProprietarios(){
        List<Proprietario> proprietarios = new ArrayList<>();

        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));
        proprietarios.add(new Proprietario("","",new ArrayList<>()));

        return proprietarios;
    }
}
