package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex01math;

import java.util.Scanner;

public class ServiceMath {
    private Scanner sc = new Scanner(System.in);

    public void arredondamento() {
        System.out.println("Digite um número decimal: ");
        double num = sc.nextDouble();
        System.out.println("ceil = " + Math.ceil(num));
        System.out.println("floor = " + Math.floor(num));
        System.out.println("round" + Math.round(num));
    }

    public void valorAbsoluto() {
        System.out.println("Digite um número(positivo ou negativo): ");
        int num = sc.nextInt();
        System.out.println("Absoluto = " + Math.abs(num));
    }

    public void potenciaRaiz() {
        System.out.println("Digite a base: ");
        double base = sc.nextDouble();
        System.out.println("Digite o expoente: ");
        double exp = sc.nextDouble();
        System.out.println("Digite um número para raiz quadrada: ");
        double num = sc.nextDouble();
        System.out.println("sqrt = "+Math.sqrt(num));
    }

    public void maxmin() {
        System.out.println("Digite o primeiro número: ");
        int a = sc.nextInt();
        System.out.println("Digite o segundo número: ");
        int b = sc.nextInt();
        System.out.println("max = " + Math.max(a,b));
        System.out.println("min = " + Math.min(a,b));
    }

    public void trigonometria() {
        System.out.println("Digite um ângulo em graus: ");
        double graus = sc.nextDouble();
        double rad = Math.toRadians(graus);
        System.out.println("Seno = " + Math.sin(rad));
        System.out.println("Cosseno " + Math.cos(rad));
        System.out.println("Tangente " + Math.tan(rad));
    }

    public void logaritmos() {
        System.out.println("Digite um número para log natural: ");
        double num = sc.nextDouble();
        System.out.println("log base e = " + Math.log(num));
    }

    public void aleatorio() {
        System.out.println("Digite o limite máximo do número aleatório: ");
        int limite = sc.nextInt();
        int numAleatorio = (int)(Math.random()*limite);
        System.out.println("Numero gerado = "+ numAleatorio);
    }

}
