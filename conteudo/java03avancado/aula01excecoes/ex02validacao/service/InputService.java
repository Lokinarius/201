package projeto201.conteudo.java03avancado.aula01excecoes.ex02validacao.service;

import projeto201.conteudo.java03avancado.aula01excecoes.ex02validacao.exception.EntradaInvalidaException;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputService {
    private Scanner scanner = new Scanner(System.in);

    public int lerNumero() throws EntradaInvalidaException{
        try{
            int numero = scanner.nextInt();

            if(numero < 0){
                throw new EntradaInvalidaException("Número negativo não é permitido");
            }
            return numero;
        }catch (InputMismatchException e){
            scanner.nextLine();
            throw new EntradaInvalidaException("O valor digitado não é um número inteiro");
        }
    }
}
