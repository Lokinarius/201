package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex02DadosAlteraveis;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private char sexo;
    private int idade;
    private double altura;

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getIdade() {return idade;}
    public void setIdade(int idade) {this.idade = idade;}

    public char getSexo() {return sexo;}
    public void setSexo(char sexo) {this.sexo = sexo;}

    public double getAltura() {return altura;}
    public void setAltura(double altura) {this.altura = altura;}

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
