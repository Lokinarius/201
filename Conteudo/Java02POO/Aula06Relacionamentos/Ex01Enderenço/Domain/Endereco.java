package Projeto201.Conteudo.Java02POO.Aula06Relacionamentos.Ex01Enderenço.Domain;

public class Endereco {
    // ATRIBUTOS
    private String cidade;
    private String bairro;
    private String rua;
    private int numero;

    // GETTERS E SETTERS
    public String getCidade() {return cidade;}
    public void setCidade(String cidade) {this.cidade = cidade;}

    public String getBairro() {return bairro;}
    public void setBairro(String bairro) {this.bairro = bairro;}

    public String getRua() {return rua;}
    public void setRua(String rua) {this.rua = rua;}

    public int getNumero() {return numero;}
    public void setNumero(int numero) {this.numero = numero;}

    // CONSTRUTOR
    public Endereco(String cidade, String bairro, String rua, int numero) {
        setCidade(cidade);
        setBairro(bairro);
        setRua(rua);
        setNumero(numero);
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ----- ENDEREÇO -----
                Cidade: %S
                Bairro: %s
                Rua: %s
                Número: %d
                --------------------
                """.formatted(getCidade(),getBairro(),getRua(),getNumero()));
    }

}
