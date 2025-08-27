package projeto201.conteudo.java03avancado.aula01excecoes.ex03validadoridade.ui;

import projeto201.conteudo.java03avancado.aula01excecoes.ex03validadoridade.exception.IdadeInvalidaException;
import projeto201.conteudo.java03avancado.aula01excecoes.ex03validadoridade.service.IdadeService;

public class ConsoleUI {
    private IdadeService idadeService = new IdadeService();

    public void iniciar(){
        boolean valido = false;
        while(!valido){
            try{
                System.out.println("Digite sua idade: ");
                int idade = idadeService.lerIdade();

                System.out.println("Idade registrada: "+idade);

                if(idade<18){
                    System.out.println("Você é menor de idade");
                }else{
                    System.out.println("Você é maior de idade");
                }
                valido=true;
            }catch(IdadeInvalidaException e){
                System.out.println("Erro: "+e.getMessage());
                System.out.println("Tente novamente.\n");
            }
        }
        System.out.println("Saindo...");
    }
}
