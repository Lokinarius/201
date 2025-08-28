package projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.service;

import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception.CalculadoraException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception.DivisionByZeroException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception.InvalidFormatException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception.InvalidOperatorexception;

public class CalculadoraService {
    public double calcular(String expressao) throws CalculadoraException{
        String[] partes = expressao.split(" ");
        if(partes.length != 3){
            throw new InvalidFormatException("Formato invalido.");
        }

        double num1, num2;
        try{
            num1 = Double.parseDouble(partes[0]);
            num2 = Double.parseDouble(partes[2]);
        }catch(NumberFormatException e){
            throw new InvalidFormatException("Um dos valores não é um número válido");
        }
        String operador = partes[1];

        return switch (operador){
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> {
                if(num2 == 0) throw new DivisionByZeroException("Divisão por zero não é permitida");
                yield num1 / num2;
            }
            default -> throw new InvalidOperatorexception("Operador inválido.");
        };
    }
}
