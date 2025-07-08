package projeto201.conteudo.java02poo.aula03construtores.ex03carro2;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Quantos carros deseja cadastrar? ");
        int totCarro = scanner.nextInt();
        scanner.nextLine();

        Carro[] carros = new Carro[totCarro];

        // CARROS
        for (int i = 0; i < totCarro; i++) {
            System.out.println("\nCadastro do carro "+(i+1)+": ");

            System.out.println("Marca do carro: ");
            String marca = scanner.nextLine();

            System.out.println("Modelo do carro: ");
            String modelo = scanner.nextLine();

            System.out.println("Ano do carro: ");
            int ano = scanner.nextInt();
            scanner.nextLine();

            carros[i] = new Carro(marca,modelo,ano);
        }
        // SAÍDA DE DADOS
        System.out.println("\n --- Carros Cadastrados --- ");
        for (Carro carro : carros){
            carro.exibirDados();
            System.out.println("--------------------------");
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }

}
