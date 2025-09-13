package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex05system;

import java.util.Map;
import java.util.Properties;
import java.util.Scanner;

public class SystemService {
    private Scanner scanner = new Scanner(System.in);

    // 1. Mostrar tempo atual
    public void mostrarTempo() {
        long millis = System.currentTimeMillis();
        long nanos = System.nanoTime();
        System.out.println("Millis desde 1970: " + millis);
        System.out.println("NanoTime atual: " + nanos);
    }

    // 2. Mostrar propriedades do sistema
    public void mostrarPropriedades() {
        Properties props = System.getProperties();
        System.out.println("Propriedades do sistema: ");
        props.forEach((k,v) -> System.out.println(k+" = "+v));
    }

    // 3. Mostrar variáveis de ambiente
    public void mostrarVariaveisAmbiente() {
        Map<String,String> env = System.getenv();
        System.out.println("Variáveis de ambiente: ");
        env.forEach((k,v)-> System.out.println(k+ " = "+v));
    }

    // 4. Mastrar saída do erro
    public void demonstrarErro() {
        System.err.println("ERRO");
    }

    // 5. Encerrar programa abrutamente
    public void encerrarPrograma() {
        System.out.println("Saindo do programa com status 0...");
        System.exit(0);
    }
}
