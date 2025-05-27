package Projeto201.Conteudo.Java02POO.Aula05Encapsulamento.Ex02Carro;

import java.util.Scanner;

public class CarroTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("quantos carros deseja cadastrar?" );
        int totCarro = scanner.nextInt();
        scanner.nextLine();
        if (totCarro <= 0) {
            System.out.println("Quantidade inválida. Finalizando...");
            return;
        }
        Carro[] carros = new Carro[totCarro];

        // CADASTRO
        for (int i = 0; i < totCarro; i++) {
            System.out.println("\n Cadastro do "+(i+1)+" carro: ");
            Carro carro = new Carro();

            System.out.println("Marca: ");
            carro.setMarca(scanner.nextLine());

            System.out.println("Modelo: ");
            carro.setModelo(scanner.nextLine());

            System.out.println("Velocidade Máxima: ");
            carro.setVelMax(scanner.nextInt());

            carros[i] = carro;
            System.out.println("-------------------------------------");
        }

        // SAÍDA DE DADOS
        System.out.println("==== Carros cadastrados ====");
        for(Carro c : carros){
            c.exibirDados();
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
