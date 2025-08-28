package projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception;

public class DivisionByZeroException extends CalculadoraException{
    public DivisionByZeroException(String message){
        super(message);
    }
}
