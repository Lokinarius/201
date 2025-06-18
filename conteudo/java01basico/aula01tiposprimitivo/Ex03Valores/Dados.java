package projeto201.conteudo.java01basico.aula01tiposprimitivo.Ex03Valores;
import java.util.Scanner;
// No JAVA a entrada de dados é feita a partir do scanner, e a leitura também é feita com uma leitura tipada
// "scanner.nextInt()" "scanner.nextBoolean()" "scanner.nextLine"

public class Dados {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("INSIRA SEUS DADOS");
        // String
        System.out.println("Nome: ");
        String nome = scanner.nextLine();
        // Int
        System.out.println("Idade: ");
        int idade = scanner.nextInt();
        // Double
        System.out.println("Altura: ");
        double altura = scanner.nextDouble();
        // boolean
        System.out.println("Empregado: ");
        boolean Empregado = scanner.nextBoolean();

        // VERIFICAÇÃO DE DADOS
        String isEmpregado;
        if (Empregado){
            isEmpregado = "Empregado";
        }else {
            isEmpregado = "Desempregado";
        }

        // SAÍDA DE DADOS
        System.out.println("O "+nome+", que tem "+idade+", e "+altura+", está "+isEmpregado);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
