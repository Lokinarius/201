package Projeto201.Conteudo.Java01BASICO.Aula03OperadoresLogicos.Ex04SenhaEAcesso;

import java.util.Scanner;
// O ternário também pode ser utilizado dentro de um tipo primitivo, como um booleano ou uma string

public class SenhaEAcesso {
    public static void main(String[] args) {
        // ABERTURA DO SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Digite o usuário: ");
        String user = scanner.nextLine();
        System.out.println("Digite a senha");
        String pass = scanner.nextLine();

        // VERIFICAÇÃO DE DADOS
        boolean userapproved = (user.equals("Admin")? true : false);
        boolean passapproved = (pass.equals("Admin")? true : false);
        String approved = (userapproved && passapproved)
                            ? "Acesso permitido"
                            : "Acesso negado!";

        // SAÍDA DE DADOS
        System.out.println(approved);

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
