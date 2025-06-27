package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarCarro {
    public static List<Carro> gerarCarros(List<Proprietario> proprietarios){
        List<Carro> carros = new ArrayList<>();

        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));
        carros.add(new Carro("","",0,"",proprietarios.get(0)));

        return carros;
    }
}
