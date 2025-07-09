package projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.service;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.domain.CriarFuncionario;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.domain.Funcionario;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaService {
    private List<Funcionario> funcionarios;
    private Scanner scanner = new Scanner(System.in);

    // CONSTRUTOR
    public EmpresaService() {
        this.funcionarios = CriarFuncionario.criarFuncionario();
    }

    // LISTAR FUNCIONARIOS
    public void listarFuncionarios(){
        for(Funcionario f: funcionarios){
            f.exibirDados();
        }
    }

    // BUSCAR FUNCIONARIO
    public Funcionario buscarFuncionarioPorNome(String nome) {
        for (Funcionario f : funcionarios) {
            if (f.getNome().equalsIgnoreCase(nome)) {
                return f;
            }
        }
        return null;
    }

    public Funcionario buscarFuncionario() {
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();
        Funcionario f = buscarFuncionarioPorNome(nome);
        if (f == null) {
            System.out.println("Funcionário não encontrado(a)");
        }else{
            f.exibirDados();
        }
        return f;
    }

    // CONTRATAR FUNCIONARIO
    public void contratarFuncionario(){
        System.out.println("Nome do funcionário: ");
        String nome = scanner.nextLine();

        System.out.println("Cargo do funcionário: ");
        String cargo = scanner.nextLine();

        System.out.println("Salário do funcionário: ");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Funcionario novoFuncionario = new Funcionario(nome,cargo,salario);
        funcionarios.add(novoFuncionario);

        System.out.println(novoFuncionario.getNome()+" contratado(a)");
    }

    // CONCEDER AUMENTO
    public void concederAumeto(){
        Funcionario funcionario = buscarFuncionario();
        if(funcionario != null){
            System.out.println("digite o valor do aumento: ");
            double aumento = scanner.nextDouble();
            scanner.nextLine();

            double novoSalario = funcionario.getSalario()+aumento;
            if(aumento < 0){
                System.out.println("Aumento não pode ser negativo");
            }else{
                funcionario.setSalario(novoSalario);
                System.out.println("Novo salário de "+funcionario.getNome()+": "+ novoSalario);
            }
        }
    }

    // DEMITIR FUNCIONARIO
    public void demitirFuncionario(){
        Funcionario funcionario = buscarFuncionario();
        if (funcionario != null) {
            funcionarios.remove(funcionario);
            System.out.println(funcionario.getNome() + " demitido(a)");
        }
    }
}
