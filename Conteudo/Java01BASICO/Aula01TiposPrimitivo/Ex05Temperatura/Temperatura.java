package Projeto201.Conteudo.Java01BASICO.Aula01TiposPrimitivo.Ex05Temperatura;
import java.util.Scanner;
// Casting implicito feito  a partir de um operação feita entre variáveis

public class Temperatura {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite a temperatura em Graus Celcius");
        int celsius = scanner.nextInt();

        // FORMULA FAHRENHEIT
        double fahrenheit = (celsius * 1.8)+32;

        // SAÍDA DE DADOS
        System.out.println(celsius+"ª graus celsius é igual a "+fahrenheit+" fahrenheit");

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
