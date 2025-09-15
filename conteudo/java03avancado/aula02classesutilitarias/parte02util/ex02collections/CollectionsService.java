package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte02util.ex02collections;

import java.util.*;

public class CollectionsService {
    private Scanner sc = new Scanner(System.in);

    // 1.Ordenar lista
    public void ordenarLista() {
        List<String> nomes = new ArrayList<>(List.of("Ana","Luiza","Marcia","Carol","Fran","Juliana","Bruna","Sâmia"));
        System.out.println("Original: " + nomes);
        Collections.sort(nomes);
        System.out.println("Ordenada: " + nomes);
    }

    // 2.Buscar elemento(binarySearch)
    public void buscarElementos() {
        List<Integer> numeros = new ArrayList<>(List.of(1,3,5,7,9));
        System.out.println("Digite o número para buscar: ");
        int valor = sc.nextInt();
        int pos = Collections.binarySearch(numeros,valor);

        if (pos >= 0){
            System.out.println("Número encontrado na posição: "+ pos);
        }else{
            System.out.println("Número não encontrado! ");
        }
    }

    // 3.Encontrar maior e menor
    public void encontrarMaxMin() {
        List<Integer> numeros = new ArrayList<>(List.of(10,2,50,45,82,99));
        System.out.println("Lista: " + numeros);
        System.out.println("Maior: " + Collections.max(numeros));
        System.out.println("Menor: " + Collections.min(numeros));
    }

    // 4. Substituir elementos
    public void substituirElementos() {
        List<String> nomes = new ArrayList<>(List.of("Ana","Luiza","Marcia","Luiza","Fran","Luiza","Bruna","Luiza"));
        System.out.println("Antes: " + nomes);
        Collections.replaceAll(nomes,"Luiza","Lua");
        System.out.println("Depois: " + nomes);
    }

    // 5. Preencher lista
    public void preecherLista() {
        List<Integer> numeros = new ArrayList<>(Arrays.asList(new Integer[5]));
        Collections.fill(numeros, 7);
        System.out.println("Lista preenchida: " + numeros);
    }

    // 6. Copiar lista
    public void copiarLista() {
        List<String> origem = List.of("A","B","C");
        List<String> destino = new ArrayList<>(Arrays.asList("","","",""));
        Collections.copy(destino,origem);
        System.out.println("Origem: " + origem);
        System.out.println("Destino após copia: " + destino);
    }

    // 7.Embaralhar lista
    public void embaralharLista() {
        List<Integer> numeros = new ArrayList<>(List.of(1,2,3,4,5));
        System.out.println("Original: " +  numeros);
        Collections.shuffle(numeros);
        System.out.println("Embaralhada: " + numeros);
    }


    // 8. Inverter lista
    public void inverterLista() {
        List<String> nomes = new ArrayList<>(List.of("A","B","C","D"));
        System.out.println("original: " + nomes);
        Collections.reverse(nomes);
        System.out.println("Invertido: " + nomes);
    }
}
