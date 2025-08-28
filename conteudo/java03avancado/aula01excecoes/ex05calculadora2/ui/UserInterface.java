package projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.ui;

import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.exception.CalculadoraException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex05calculadora2.service.CalculadoraService;

import java.util.Scanner;

public class UserInterface {
    private final CalculadoraService service = new CalculadoraService();

    public void start(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("=== CALCULADORA ===");

        String input = scanner.nextLine();
        try{
            double resultado = service.calcular(input);
            System.out.println("Resultado: "+resultado);
        }catch (CalculadoraException e){
            System.out.println("Erro: "+e.getMessage());
        }catch(Exception e){
            System.out.println("Erro inesperado: "+e.getMessage());
        }
        scanner.close();
    }
}
