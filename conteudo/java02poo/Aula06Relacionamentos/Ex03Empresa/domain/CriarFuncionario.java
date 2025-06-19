package projeto201.conteudo.java02poo.Aula06Relacionamentos.Ex03Empresa.domain;

import java.util.ArrayList;
import java.util.List;

public class CriarFuncionario {
    public static List<Funcionario> criarFuncionario(){
        List<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("João", "TI", 3000.0));
        funcionarios.add(new Funcionario("Maria", "RH", 2800.0));
        funcionarios.add(new Funcionario("Carlos", "Financeiro", 3500.0));
        funcionarios.add(new Funcionario("Ana", "Marketing", 3100.0));
        funcionarios.add(new Funcionario("Pedro", "TI", 2900.0));
        funcionarios.add(new Funcionario("Juliana", "Financeiro", 3600.0));
        funcionarios.add(new Funcionario("Lucas", "Vendas", 2700.0));
        funcionarios.add(new Funcionario("Fernanda", "Vendas", 2750.0));
        funcionarios.add(new Funcionario("Paulo", "RH", 3000.0));
        funcionarios.add(new Funcionario("Camila", "TI", 3300.0));

        return funcionarios;
    }
}
