package projeto201.conteudo.java02poo.Aula03Construtores.Ex03Carro2;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);
        int totCarro = scanner.nextInt();
        scanner.nextLine();

        Carro[] carros = new Carro[totCarro];

        // CARROS
        for (int i = 0; i < totCarro; i++) {
            System.out.println("\n Cadastro do carro "+(i+1)+": ");
            Carro carro = new Carro();

            System.out.println("Marca do carro: ");
            carro.marca = scanner.nextLine();

            System.out.println("Modelo do carro: ");
            carro.modelo = scanner.nextLine();

            System.out.println("Ano do carro: ");
            carro.ano = scanner.nextInt();
            scanner.nextLine();

            carros[i] = carro;


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
