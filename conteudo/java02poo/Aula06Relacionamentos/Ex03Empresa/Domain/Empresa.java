package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex03Empresa.Domain;

import java.util.List;

public class Empresa {
    // ATRIBUTOS
    private String nomeEmpresa;
    private int cnpj;
    private List<Funcionario> funcionarios;

    // GETTERS E SETTERS
    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public int getCnpj() {
        return cnpj;
    }

    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }

    // CONSTRUTOR
    public Empresa(String nomeEmpresa, int cnpj, List<Funcionario> funcionarios) {
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
        this.funcionarios = funcionarios;
    }
}

