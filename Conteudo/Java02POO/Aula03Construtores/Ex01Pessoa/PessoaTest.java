package Projeto201.Conteudo.Java02POO.Aula03Construtores.Ex01Pessoa;

import java.util.Scanner;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];
        pessoas[1] = new Pessoa("William",29);
        pessoas[2] = new Pessoa("Marcos",32);
        pessoas[3] = new Pessoa("Tainá",25);
        pessoas[4] = new Pessoa("Hugo",34);

        // Saída de dados
        System.out.println("=== Pessoas Cadastradas ===");
        for (Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("------------------------");
        }
    }
}
