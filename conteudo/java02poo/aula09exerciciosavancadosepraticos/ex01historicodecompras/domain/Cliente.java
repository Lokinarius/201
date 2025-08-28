package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

public class Cliente {
    // Atributos
    private int id;
    private String nome;
    private String email;
    private String lista;

    // Construtor
    public Cliente(int id, String nome, String email, String lista) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.lista = lista;
    }

    // Getter and setter
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}
    public void setEmail(String email) {this.email = email;}

    public String getLista() {return lista;}
    public void setLista(String lista) {this.lista = lista;}

    // metodos
    public void adicionarCompras(){

    }

    public void listarCompras(){

    }

    // To string
    @Override
    public String toString() {
        return "Cliente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", lista='" + lista + '\'' +
                '}';
    }
}
