package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    // ATRIBUTOS
    private String nome;
    private String cpf;
    private List<Carro> carros = new ArrayList<>();


    // GETTERS E SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCpf() {return cpf;}
    public void setCpf(String cpf) {this.cpf = cpf;}


    public List<Carro> getCarros() {return carros;}
    public void setCarros(List<Carro> carros) {this.carros = carros;}

    // CONSTRUTOR
    public Proprietario() {

    }

    public Proprietario(String nome, String cpf, List<Carro> carros) {
        setNome(nome);
        setCpf(cpf);
        this.carros = carros;
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
        \n======================
        Nome: %s
        CPF: %s
        """.formatted(getNome(), getCpf()));
        for (Carro carro : carros) {
            System.out.println(" - " + carro);
        }
        if(carros.isEmpty()){
            System.out.println("Essa pessoa não possui carros");
        }
    }

}
