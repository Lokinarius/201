package projeto201.conteudo.java02poo.aula04gettersesetters.ex05funcionario;

import java.util.Scanner;

public class FuncionarioTest {
    public static void main(String[] args) {
        // ABERTURA DE SCANNER
        Scanner scanner = new Scanner(System.in);

        // ENTRADA DE DADOS
        System.out.println("Quantos funcionários há na empresa? ");
        int totUser = scanner.nextInt();
        scanner.nextLine();
        Funcionario[] funcionarios = new Funcionario[totUser];

        // CADASTRO
        for (int i = 0; i < totUser; i++) {
            System.out.println("\n Cadastro do funcionário "+(i+1)+": ");
            Funcionario funcionario = new Funcionario();

            System.out.println("Nome: ");
            funcionario.setNome(scanner.nextLine());

            System.out.println("Cargo: ");
            funcionario.setCargo(scanner.nextLine());

            System.out.println("Salário: ");
            double salario = Double.parseDouble(scanner.nextLine());
            funcionario.setSalario(salario);

            funcionarios[i] = funcionario;

            System.out.println("--------------------------------------");
        }

        // SAÍDA DE DADOS
        System.out.println("============== FUNCIONARIOS ==============");
        for(Funcionario f : funcionarios){
            f.ExibirDados();
        }

        // FECHAMENTO DE SCANNER
        scanner.close();
    }
}
