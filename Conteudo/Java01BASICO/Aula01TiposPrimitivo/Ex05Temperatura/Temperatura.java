package Projeto201.Conteudo.Java01BASICO.Aula01TiposPrimitivo.Ex05Temperatura;
import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args) {
        // Abertura do Scanner
        Scanner scanner = new Scanner(System.in);

        // Entrada de dados
        System.out.println("Digite a temperatura em Graus Celcius");
        int celsius = scanner.nextInt();
        // formula fahrenheit
        double fahrenheit = (celsius * 1.8)+32;

        //Saida de dados
        System.out.println(celsius+"ª graus celsius é igual a "+fahrenheit+" fahrenheit");

        //fechamento de Scanner
        scanner.close();
    }
}
