package projeto201.conteudo.java03avancado.aula01excecoes.ex03validadoridade.service;

import projeto201.conteudo.java03avancado.aula01excecoes.ex03validadoridade.exception.IdadeInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class IdadeService {
    public Scanner scanner = new Scanner(System.in);

    public int lerIdade() throws IdadeInvalidaException{
        try{
            int idade = scanner.nextInt();
            if(idade<0){
                throw new IdadeInvalidaException("Idade não pode ser negativa.");
            }
            if(idade>150){
                throw new IdadeInvalidaException("Idade acima do limite humano");
            }
            return idade;
        }catch (InputMismatchException e){
            scanner.nextLine();
            throw new IdadeInvalidaException("O valor digitado não é um número inteiro");
        }
    }
}
