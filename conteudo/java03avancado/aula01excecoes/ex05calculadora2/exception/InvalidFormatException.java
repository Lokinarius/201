package projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception;

public class InvalidFormatException extends CalculadoraException{
    public InvalidFormatException(String message){
        super(message);
    }
}
