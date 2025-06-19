package projeto201.conteudo.java02poo.aula06relacionamentos.Ex01Enderenço.domain;

public class Pessoa {
    // ATRIBUTOS
    private String nome;
    private int cpf;
    private Endereco endereco;

    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getCpf() {return cpf;}
    public void setCpf(int cpf) {this.cpf = cpf;}

    public Endereco getEndereco() {return endereco;}
    public void setEndereco(Endereco endereco) {this.endereco = endereco;}

    // CONSTRUTOR
    public Pessoa(String nome, int cpf, Endereco endereco) {
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
