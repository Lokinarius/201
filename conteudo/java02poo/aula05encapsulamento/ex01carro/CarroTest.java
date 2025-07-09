package projeto201.conteudo.java02poo.aula05encapsulamento.ex01carro;

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

        // CADASTRO
        for (int i = 0; i < totCarro; i++) {
            System.out.println("\nCadastro do "+(i+1)+"º carro: ");
            Carro carro = new Carro();

            System.out.println("Marca: ");
            carro.setMarca(scanner.nextLine());

            System.out.println("Modelo: ");
            carro.setModelo(scanner.nextLine());

            carros[i] = carro;

            System.out.println("--------------------------------");
        }


        // SAÍDA DE DADOS
        System.out.println("=== Carros cadastrados ===");
        for(Carro c: carros){
            c.exibirDados();
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
