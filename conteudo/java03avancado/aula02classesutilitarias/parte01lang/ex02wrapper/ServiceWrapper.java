package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex02wrapper;

import java.util.ArrayList;
import java.util.Scanner;

public class ServiceWrapper {
    private Scanner sc  = new Scanner(System.in);

    // Demonstração de boxing e Unboxing
    public void boxingUnboxing() {
        System.out.println("Digite um número inteiro");
        int num = sc.nextInt();

        // Autoboxing (primitivo -> objeto)
        Integer obj = num;
        System.out.println("Objeto Integer: " + obj);

        // Unboxing (objeto -> primitivo)
        int primitivo = obj;
        System.out.println("Primitivo int: " + primitivo);

    }

    // Conversão String
    public void conversao() {
        sc.nextLine();
        System.out.println("Digite um número em formato de texto: ");
        String txt = sc.nextLine();

        int valorInt = Integer.parseInt(txt); // String -> int
        double valorDouble = Double.parseDouble(txt); // String -> double

        System.out.println("convertido para int: " + valorInt);
        System.out.println("Convertido para double: " + valorDouble);

        // Número para String
        String newTxt = Integer.toString(valorInt);
        System.out.println("int convertido de volta para String: " + newTxt);
    }

    public void colecoes() {
        ArrayList<Integer> lista = new ArrayList<>();

        System.out.println("Quantos número deseja adicionar na lista? ");
        int quantidade = sc.nextInt();

        for (int i = 0; i < quantidade; i++) {
            System.out.println("Digite o número " + (i+1) + ": ");
            int num = sc.nextInt();
            lista.add(num);
        }
        System.out.println("Lista de números: "+ lista);

        int soma = 0;
        for(Integer n : lista){
            soma += n;
        }
        System.out.println("Soma de todos os elementos = " + soma);
    }
}
