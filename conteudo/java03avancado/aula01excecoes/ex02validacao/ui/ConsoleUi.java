package projeto201.conteudo.java03avancado.aula01excecoes.ex02validacao.ui;

import projeto201.conteudo.java03avancado.aula01excecoes.ex02validacao.exception.EntradaInvalidaException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex02validacao.service.InputService;

public class ConsoleUi {
    private InputService input = new InputService();

    public void iniciar(){
        boolean valido = false;

        while(!valido){
            try{
                System.out.println("Digite um número inteiro positivo: ");
                int valor = input.lerNumero();
                System.out.println("Número digitado: "+valor);
                valido = true;
            } catch (EntradaInvalidaException e) {
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Tente novamente. \n");
            }
        }
        System.out.println("Saindo...");
    }
}
