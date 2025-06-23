package projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.domain;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    // ATRIBUTOS
    private final String nomeEmpresa;
    private final String cnpj;
    private List<Funcionario> funcionarios;

    // CONSTRUTOR
    public Empresa(String nomeEmpresa, String cnpj){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.funcionarios = new ArrayList<>();
    }

    // GETTERS
    public String getNomeEmpresa() {return nomeEmpresa;}
    public String getCnpj() {return cnpj;}
    public List<Funcionario> getFuncionarios() {return funcionarios;}
}

