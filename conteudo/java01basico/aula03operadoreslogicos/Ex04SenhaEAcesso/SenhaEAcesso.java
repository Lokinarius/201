package projeto201.conteudo.java01basico.aula03operadoreslogicos.Ex04SenhaEAcesso;

import java.util.Scanner;
// O ternário também pode ser utilizado dentro de um tipo primitivo, como um booleano ou uma string
// O método .equals() pode ser utilizado para verificar a validade de um tipo

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
