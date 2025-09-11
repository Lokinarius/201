package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex01math;

import java.util.Scanner;

public class TestMath {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ServiceMath s = new ServiceMath();
        int opcao;
        do{
            System.out.println("""
                    \n=== MENU MATH ===
                    1 - Arredondamento
                    2 - Valor Absoluto
                    3 - Potência e Raiz
                    4 - Máximo e Mínimo
                    5 - Trigonometria
                    6 - Logaritimos
                    7 - Número Aleatório
                    0 - Sair
                    """);
            opcao = sc.nextInt();

            switch(opcao){
                case 1 -> s.arredondamento();
                case 2 -> s.valorAbsoluto();
                case 3 -> s.potenciaRaiz();
                case 4 -> s.maxmin();
                case 5 -> s.trigonometria();
                case 6 -> s.logaritmos();
                case 7 -> s.aleatorio();
                case 0 -> System.out.println("Saindo....");
                default -> System.out.println("Opção inválida");
            }
        }while(opcao != 0);

        sc.close();
    }
}
