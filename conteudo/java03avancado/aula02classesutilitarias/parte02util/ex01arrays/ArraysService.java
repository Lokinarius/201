package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte02util.ex01arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysService {
    private Scanner scanner = new Scanner(System.in);

    // 1. Ordenar array
    public void ordenarArray() {
        int[] numeros = {5, 3, 9, 1, 4};
        System.out.println("Array original: " + Arrays.toString(numeros));
        Arrays.sort(numeros);
        System.out.println("Array ordenado: " + Arrays.toString(numeros));
    }

    // 2. Buscar elemento
    public void buscarElemento() {
        int[] numeros = {1,3,4,5,9};
        System.out.println("Digite o número para buscar: ");
        int valor = scanner.nextInt();
        int pos = Arrays.binarySearch(numeros,valor);

        if (pos>= 0){
            System.out.println("Número encontrado na posição: "+ pos);
        }else{
            System.out.println("Número não encontrado!");
        }
    }

    // 3. Copiar Array
    public void copiarArray() {
        String[] nomes = {"Loki","William","Dev"};
        String[] copia = Arrays.copyOf(nomes,5);

        System.out.println("Original: " + Arrays.toString(nomes));
        System.out.println("Cópias (tamanhos 5): " + Arrays.toString(copia));
    }

    // 4. Preencher array
    public void preencherArray() {
        int[] numeros = new int[5];
        Arrays.fill(numeros, 7);
        System.out.println("Array preenchido com 7: " + Arrays.toString(numeros));
    }

    // 5. Comparar arrays
    public void compararArrays() {
        int[] a1 = {1,2,3};
        int[] a2 = {1,2,3};
        int[] a3 = {3,2,1};

        System.out.println("a1 vs a2: " + Arrays.equals(a1, a2));
        System.out.println("a1 vs a3: " + Arrays.equals(a1, a3));
    }
}
