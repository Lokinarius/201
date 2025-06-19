package projeto201.conteudo.java01basico.aula08arrays.ex05verificacaoarray;

import java.util.Scanner;

public class VerificacaoArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] n ={25,67,88,32,94,53};

        System.out.println("Digite um número e veja se ele está na lista: ");
        int numero = scanner.nextInt();

        boolean encontrado = false;
        for(int i = 0; i < n.length; i++){
            if(n[i] == numero) {
                encontrado = true;
                break;
            }
        }

        if(encontrado){
            System.out.println("O número "+numero+" está na lista!");
        } else {
            System.out.println("O número "+numero+" não está na lista.");
        }
        scanner.close();
    }
}
