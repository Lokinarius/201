package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.Ex04Objects;

import java.util.Scanner;

public class ObjectService {
    private Scanner scanner = new Scanner(System.in);

    public void demonstrarToString(){
        Pessoa p = new Pessoa("Loki",29);
        System.out.println("toString(): "+ p.toString());
    }

    public void demonstrarEquals(){
        Pessoa p1 = new Pessoa("Loki",29);
        Pessoa p2 = new Pessoa("Loki",29);
        Pessoa p3 = new Pessoa("William", 29);

        System.out.println("p1.equals(p2): "+ p1.equals(p2));
        System.out.println("p1.equals(p3): "+ p1.equals(p3));
    }

    public void demonstrarHashCode(){
        Pessoa p1 = new Pessoa("Loki", 25);
        Pessoa p2 = new Pessoa("Loki", 25);

        System.out.println("HashCode p1: " + p1.hashCode());
        System.out.println("HashCode p2: " + p1.hashCode());
    }

    public void demonstrarGetClass(){
        Pessoa p = new Pessoa("Lokinarius",30);
        System.out.println("Classe do objeto: "+p.getClass().getName());
    }
}
