package projeto201.conteudo.java02poo.Aula04GettersESetters.Ex04PessoaFisica;

public class PessoaFisicaTest {
    public static void main(String[] args) {
        PessoaFisica[] pessoa = new PessoaFisica[5];
        pessoa[0] = new PessoaFisica("William","99827346545");
        pessoa[1] = new PessoaFisica("Mariana", "12345678900");
        pessoa[2] = new PessoaFisica("Felipe", "98765432100");
        pessoa[3] = new PessoaFisica("Camila", "45612378901");
        pessoa[4] = new PessoaFisica("Rafael", "32165498712");

        System.out.println("=========== PESSOAS ===========");
        for(PessoaFisica p : pessoa){
            p.exibirdados();
            System.out.println("==============================");
        }
    }
}
