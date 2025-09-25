package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte04regex.ex01uuid;

import java.util.Scanner;
import java.util.UUID;

public class UUIDService {
    private Scanner sc = new Scanner(System.in);

    // 1. Gerar um UUID aleatório
    public void gerarUUID() {
        UUID uuid = UUID.randomUUID();
        System.out.println("UUID gerado: " + uuid);
    }

    // 2. Gerar vários UUIDs
    public void gerarVariosUUID() {
        System.out.println("Quantos UUIDs deseja gerar?");
        int qtd = sc.nextInt();
        for (int i = 0; i < qtd; i++) {
            System.out.println((i + 1) + "->" + UUID.randomUUID());
        }
    }

    // 3.Converter UUID para String
    public void uuidParaString() {
        UUID uuid = UUID.randomUUID();
        String uuidStr = uuid.toString();
        System.out.println("UUID original: " + uuid);
        System.out.println("UUID convertido para String: " + uuidStr);
    }

    // 4. Criar UUID a partir de String
    public void stringParaUUID() {
        System.out.println("Digite um UUID válido: ");
        sc.nextLine(); // limpar buffer
        String entrada = sc.nextLine();
        try{
            UUID uuid = UUID.fromString(entrada);
            System.out.println("UUID criado a partir da String: " + uuid);
        }catch(IllegalArgumentException e){
            System.out.println("Formato invalido! Certifique-se que o UUID está correto");
        }
    }
}
