package projeto201.conteudo.java01basico.Aula03OperadoresLogicos.Ex03UmACem;

import java.util.Scanner;
// O ternário também pode realizar uma operção lógica sem necessitar de uma declarar uma variável
// Mas se torna mais complexo além de uma condicional simples, sendo necessário um aninhamento a cada condicional
// extra adicionada

public class UmACem {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite um número: ");
        int numero = scanner.nextInt();

        // SAÍDA DE DADOS
        System.out.println(numero < 100
                ? "O número " + numero + " está abaixo de 100 e está aprovado."
                : (numero == 100
                ? "O número " + numero + " está aprovado."
                : "O número " + numero + " é maior que 100, e não foi aprovado."));

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
