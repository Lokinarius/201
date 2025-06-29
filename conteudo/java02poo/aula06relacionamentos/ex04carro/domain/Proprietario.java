package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

import java.util.List;

public class Proprietario {
    // ATRIBUTOS
    private String nome;
    private String cpf;
    private List<Carro> carros;



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
        StringBuilder carroAdiquiridos = new StringBuilder();
        for(Carro carro: carros){
            carroAdiquiridos.append(carro.getModelo()).append(", ");
        }
        if(!carros.isEmpty()){
            carroAdiquiridos.setLength(carroAdiquiridos.length() - 2);
        }

        System.out.println("""
                ======================
                Nome:%s
                CPF: %s
                Carros: %s
                """.formatted(getNome(),getCpf(),getCarros()));
    }

}
