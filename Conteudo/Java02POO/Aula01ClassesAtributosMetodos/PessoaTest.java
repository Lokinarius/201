package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos;

import java.util.ArrayList;

public class PessoaTest {
    public static void main(String[] args) {
        ArrayList<Pessoa> pessoas = new ArrayList<>();

        // Cadastro
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "William";
        pessoa1.idade = 29;
        pessoas.add(pessoa1);

        Pessoa pessoa2 = new Pessoa();
        pessoa2.nome = "Ana";
        pessoa2.idade = 25;
        pessoas.add(pessoa2);

        Pessoa pessoa3 = new Pessoa();
        pessoa3.nome = "Pedro";
        pessoa2.idade = 28;
        pessoas.add(pessoa3);

        // SAÍDA DE DADOS
        System.out.println("=== Pessoas Cadastradas ===");
        for(Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("----------------");
        }
    }
}
