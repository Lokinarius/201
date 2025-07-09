package projeto201.conteudo.java02poo.aula06relacionamentos.ex01endereco.domain;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private long cpf;
    private Endereco endereco;

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public long getCpf() {return cpf;}
    public void setCpf(long cpf) {this.cpf = cpf;}

    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}

    // CONSTRUTOR
    public Pessoa(String nome, long cpf, Endereco endereco) {
        setNome(nome);
        setCpf(cpf);
        setEndereco(endereco);
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ====================
                Nome: %s
                """.formatted(getNome()));
        if(endereco != null){
            endereco.exibirDados();
        }
    }
}
