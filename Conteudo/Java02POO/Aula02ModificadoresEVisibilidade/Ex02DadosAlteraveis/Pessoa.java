package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex02DadosAlteraveis;

public class Pessoa {
    // ATRIBUTOS
    public String nome;
    public char sexo;
    public int idade;
    public double altura;

    // METODOS
    public void alterarNome(String novoNome){
        if(novoNome != null && !novoNome.isBlank()){
            this.nome = novoNome;
            System.out.println("Novo nome alterado com sucesso");
        }else{
            System.out.println("Nome inválido.");
        }
    }

    public void alterarIdade(int novaIdade){
        this.idade = novaIdade;
        System.out.println("Idade alterada com sucesso");
    }

    public void exibirDados(){
        System.out.println("Nome: "+nome);
        System.out.println("Seco: "+sexo);
        System.out.println("Idade; "+idade);
        System.out.println("Altura: "+altura);
    }
}
