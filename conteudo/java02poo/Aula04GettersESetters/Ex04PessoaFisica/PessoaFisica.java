package projeto201.conteudo.java02poo.Aula04GettersESetters.Ex04PessoaFisica;

public class PessoaFisica {
    // ATRIBUTOS
    private String nome;
    private String cpf;

    // CONSTRUTOR

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        setCpf(cpf);
    }


    // GETTERS AND SETTERS

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {
        if (cpf != null && cpf.length() == 11){
            return cpf.replaceAll("\"(\\\\d{3})(\\\\d{3})(\\\\d{3})(\\\\d{2})", "$1.$2.$3-$4\"");
        }else{
            return "CPF invalido";
        }
    }
    public void setCpf(String cpf) {
        this.cpf = cpf.replaceAll("[^\\d]","");
    }

    // METODOS
    public void exibirdados(){
        System.out.println("""
                --------------------------
                Nome: %s
                CPF: %s
                --------------------------
                """.formatted(getNome(),getCpf()));
    }
}
