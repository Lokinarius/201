package Projeto201.Conteudo.Java01BASICO.Aula07ComandosDeControle.Ex05MaquinaDeVendas;

import java.util.Scanner;

public class MaquinasDeVendas {
    public static void main(String[] args) {
        // Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Você trouxe R$ 20 para comprar seu lanche, escolha o que quer comprar");
        double dinheiro = 20.0;

        while(true){
            // Máquina de vendas
            System.out.println("\n========-CINEMA JAVA-========\n");
            System.out.println("[1] Balde de pipoca  - R$ 10,00");
            System.out.println("[2] Latinha de refrigerante - R$ 5,00");
            System.out.println("[3] Barrinha de chocolate - R$ 3,50");
            System.out.println("[4] Salgadinho - R$ 7,00");
            System.out.println("[5] Balinha refrescante - R$ 1,75");
            System.out.println("[0] Sair");
            int escolha = scanner.nextInt();
            // Escolha
            switch (escolha){
                case 1:
                    if (dinheiro >= 10){
                        System.out.println("Um balde de pipoca adicionado");
                        dinheiro -= 10;
                        break;
                    }else{
                        System.out.println("Dinheiro insuficiente");
                        break;
                    }
                case 2:
                    if (dinheiro >= 5){
                        System.out.println("Uma latinha de refrigerante adicionada");
                        dinheiro -= 5;
                        break;
                    }else{
                        System.out.println("Dinheiro insuficiente");
                        break;
                    }
                case 3:
                    if (dinheiro >= 3.5){
                        System.out.println("Uma barrinha de chocolate adicionada");
                        dinheiro -= 3.5;
                        break;
                    }else{
                        System.out.println("Dinheiro insuficiente");
                        break;
                    }
                case 4:
                    if (dinheiro >= 7){
                        System.out.println("Um salgadinho adicionado");
                        dinheiro -= 7;
                        break;
                    }else{
                        System.out.println("Dinheiro insuficiente");
                        break;
                    }
                case 5:
                    if (dinheiro >= 1.75){
                        System.out.println("Uma balinha refrescante adicionada");
                        dinheiro -= 1.75;
                        break;
                    }else{
                        System.out.println("Dinheiro insuficiente");
                        break;
                    }
                case 0:
                    System.out.println("Saindo da maquina de vendas");
                    System.out.println("O valor total da sua compra foi de R$"+ (20 - dinheiro));
                    if(dinheiro > 0){
                        System.out.println("O seu troco foi de R$"+dinheiro);
                    }
                    return;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }
    }
}
