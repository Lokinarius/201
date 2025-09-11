package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.Ex04Objects;

import java.util.Scanner;

public class ObjectTest {
   public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
    ObjectService service = new ObjectService();
    int opcao;

    do{
        System.out.println("""
                \n --- OBJECT ---
                1 - Demonstrar toString
                2 - Demonstrar equals
                3 - Demonstrar hashCode
                4 - Demonstrar getClass
                0 - Sair
                """);
                opcao = scanner.nextInt();

                switch(opcao){
                    case 1 -> service.demonstrarToString();
                    case 2 -> service.demonstrarEquals();
                    case 3 -> service.demonstrarHashCode();
                    case 4 -> service.demonstrarGetClass();
                    case 0 -> System.out.println("Saindo... ");
                    default -> System.out.println("Opção inválida!");
                }
      }while(opcao!= 0);

      scanner.close();
    }
}

