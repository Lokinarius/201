package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

import java.util.List;

public class EscolaProfissionalizante {
    // ATRIBUTOS
    private String nome;
    private List<Sede> sedes;

    // CONSTRUTOR
    public EscolaProfissionalizante(String nome, List<Sede> sedes) {
        this.nome = nome;
        this.sedes = sedes;
    }

    // GETTER AND SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public List<Sede> getSedes() {return sedes;}
    public void setSedes(List<Sede> sedes) {this.sedes = sedes;}

    // METODOS
    public void exibirDados(){
        System.out.println("======= "+nome+" =======");
        for(Sede sede : sedes){
            sede.exibirDados();
        }
    }

}
