package projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.service;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.domain.Funcionario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmpresaService {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // LISTAR FUNCIONARIOS
    public void listarFuncionarios(){
        for(Funcionario f: funcionarios){
            f.exibirDados();
        }
    }

    // BUSCAR FUNCIONARIO
    public Funcionario buscarFuncionario(String nome){
        for (Funcionario f : funcionarios){
            if (f.getNome().equalsIgnoreCase(nome)){
                return f;
            }
        }
        System.out.println("Funcionário não encontrado");
        return null;
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

        System.out.println(novoFuncionario.getNome()+" contratado");
    }

    // CONCEDER AUMENTO
    public void concederAumeto(){
        System.out.println("Digite o nome do funcionário: ");
        String nome = scanner.nextLine();

        Funcionario funcionario = buscarFuncionario(nome);
        if(funcionario != null){
            System.out.println("digite o valor do aumento: ");
            double aumento = scanner.nextDouble();
            scanner.nextLine();

            double novoSalario = funcionario.getSalario()+aumento;
            funcionario.setSalario(novoSalario);
            System.out.println("Novo salário de "+funcionario.getNome()+": "+ novoSalario);
        }
    }

    // DEMITIR FUNCIONARIO
    public void demitirFuncionario(String nome){
        Funcionario funcionario = buscarFuncionario(nome);{
            if(funcionario != null){
                funcionarios.remove(funcionario);
                System.out.println(funcionario.getNome()+" demitido");
            }
        }
    }

}
