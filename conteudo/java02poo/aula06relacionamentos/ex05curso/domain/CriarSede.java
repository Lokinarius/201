package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarSede {
    public static List<Sede> gerarSedes(){

        List<Sede> sedes = new ArrayList<>();
        sedes.add(new Sede("Campus Central", new ArrayList<>()));
        sedes.add(new Sede("Unidade Zona Norte", new ArrayList<>()));
        sedes.add(new Sede("Unidade Zona Sul", new ArrayList<>()));

        CriarAluno.gerarAlunos(sedes);

        return sedes;
    }
}
