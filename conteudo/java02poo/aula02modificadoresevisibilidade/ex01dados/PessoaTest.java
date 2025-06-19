package projeto201.conteudo.java02poo.aula02modificadoresevisibilidade.ex01dados;

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
            pessoa.nome = scanner.nextLine();

            // SEXO
            boolean sexoVal = false;
            while(!sexoVal){
                System.out.println("Sexo: ");
                String sexoInput = scanner.nextLine();
                if (!sexoInput.isEmpty()){
                    char sexoChar = Character.toUpperCase(sexoInput.charAt(0));
                    if (sexoChar == 'M' || sexoChar == 'F'){
                        pessoa.sexo = sexoChar;
                        sexoVal = true;
                    }else {
                        System.out.println("Digite apenas 'M' ou 'F'.");
                    }
                }else{
                    System.out.println("Preencha o campo vazio");
                }
            }

            //IDADE
            System.out.println("Idade: ");
            pessoa.idade = scanner.nextInt();

            //ALTURA
            System.out.println("Altura: ");
            pessoa.altura = scanner.nextDouble();
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
