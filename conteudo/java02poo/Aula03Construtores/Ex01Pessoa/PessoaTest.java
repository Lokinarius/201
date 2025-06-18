package projeto201.conteudo.java02poo.Aula03Construtores.Ex01Pessoa;

public class PessoaTest {
    public static void main(String[] args) {

        Pessoa[] pessoas = new Pessoa[4];
        pessoas[0] = new Pessoa("William",29);
        pessoas[1] = new Pessoa("Marcos",32);
        pessoas[2] = new Pessoa("Tainá",25);
        pessoas[3] = new Pessoa("Hugo",34);

        // Saída de dados
        System.out.println("=== Pessoas Cadastradas ===");
        for (Pessoa p : pessoas){
            p.exibirDados();
            System.out.println("------------------------");
        }
    }
}
