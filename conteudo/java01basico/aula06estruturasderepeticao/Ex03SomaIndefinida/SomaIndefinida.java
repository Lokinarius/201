package projeto201.conteudo.java01basico.aula06estruturasderepeticao.Ex03SomaIndefinida;

import java.util.Scanner;
// A estrutura do while a executa um bloco de código pelo menos uma vez e depois repete a execução enquanto a
// condição booleana for verdadeira.
public class SomaIndefinida {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        boolean resposta = true;
        int soma = 0;

        do {
            System.out.println("Informe um número para a soma final: ");
            int num = scanner.nextInt();
            soma += num;
            scanner.nextLine();

            System.out.println("Se deseja continuar digite \"s\" ");
            String res = scanner.nextLine().trim().toLowerCase();
            if(!res.equals("s")){
                resposta = false;
            }
        } while(resposta == true);

        // SAÍDA DE DADOS
        System.out.println("A soma de todos os números informados é "+soma);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
