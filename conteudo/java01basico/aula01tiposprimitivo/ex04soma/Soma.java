package projeto201.conteudo.java01basico.aula01tiposprimitivo.ex04soma;
import java.util.Scanner;
// É possivel declarar uma nova variável a partir de uma oepração com outras duas variáveis

public class Soma {
    public static void main(String[] args) {
        // Abertura de Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();

        // Soma
        int soma = numero1 + numero2;

        // Saída de dados
        System.out.println("A soma entre "+ numero1 +" e "+numero2+" é "+soma);

        // Fechamento do Scanner
        scanner.close();
    }
}
