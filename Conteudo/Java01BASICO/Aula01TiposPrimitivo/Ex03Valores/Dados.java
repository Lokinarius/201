package Projeto201.Conteudo.Java01BASICO.Aula01TiposPrimitivo.Ex03Valores;
import java.util.Scanner;
public class Dados {
    public static void main(String[] args) {
        // Abertura de Scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("INSIRA SEUS DADOS");
        // String
        System.out.println("Nome: ");
        String nome = scanner.next();
        // Int
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        // Double
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();
        // boolean
        System.out.println("Empregado: ");
        boolean Empregado = scanner.nextBoolean();
        // verificação de Status
        String isEmpregado;
        if (Empregado){
            isEmpregado = "Empregado";
        }else {
            isEmpregado = "Desempregado";
        }
        // Saída de dados
        System.out.println("O "+nome+", que tem "+idade+", e "+altura+", está "+isEmpregado);
        // Fechamento de scanner
        scanner.close();
    }
}
