package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex01Dados;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Quantas pessoa deseja cadastrar? ");
        int totPessoas = scanner.nextInt();
        scanner.nextLine();

        Pessoa[] pessoas = new Pessoa[totPessoas];

        for (int i = 0; i < totPessoas; i++) {
            System.out.println("Cadastro da pessoa "+(i+1)+": ");

            Pessoa pessoa = new Pessoa();

            // NOME
            System.out.println("Nome: ");
            pessoa.setNome(scanner.nextLine());

            // SEXO
            char sexoChar = '\0';
            boolean sexoValido = false;
            while(!sexoValido){
                System.out.println("Sexo: ");
                String sexoI = scanner.nextLine();
                pessoa.setSexo(sexoChar);
                if(!sexoI.isEmpty()){
                    sexoChar = Character.toUpperCase(sexoI.charAt(0));
                    if(sexoChar == 'M' || sexoChar == 'F'){
                        sexoValido = true;
                    }else{
                        System.out.println("Digite apenas 'M' ou 'F'.");
                    }
                }else{
                    System.out.println("O campo está vazio");
                }
            }

            //IDADE
            System.out.println("Idade: ");
            pessoa.setIdade(scanner.nextInt());

            //ALTURA
            System.out.println("Altura: ");
            pessoa.setAltura(scanner.nextDouble());
        }
        scanner.close();

        // SAÍDA DE DADOS
        System.out.println("=== Pessoas Cadastradas ===");
        for(Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("------------------");
        }
    }
}
