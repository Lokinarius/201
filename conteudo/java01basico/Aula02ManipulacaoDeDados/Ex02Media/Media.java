package projeto201.conteudo.java01basico.Aula02ManipulacaoDeDados.Ex02Media;
import java.util.Scanner;
// Uma operação realizada que pode ter uma resultado int ou double

public class Media {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um número: ");
        int numero1 = scanner.nextInt();
        System.out.println("Digite outro número: ");
        int numero2 = scanner.nextInt();
        int media = (numero1 + numero2) / 2;

        // SAÍDA DE DADOS
        System.out.println("A média entre "+numero1+" e "+numero2+" é "+media);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
