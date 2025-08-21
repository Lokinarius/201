package projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.test;

import projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain.Estagiario;
import projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain.Funcionario;
import projeto201.conteudo.java02poo.aula08polimorfismo.ex03funcionario.domain.Gerente;

import java.util.ArrayList;

public class FuncionarioTest {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        //lista de funcionarios
        funcionarios.add(new Gerente("Carlos", 45, 8000.0, 2500.0));
        funcionarios.add(new Gerente("Fernanda", 38, 9500.0, 3000.0));
        funcionarios.add(new Estagiario("Lucas", 20, 1200.0, 40, 10));
        funcionarios.add(new Estagiario("Marina", 22, 1500.0, 30, 5));

        //loop
        for(Funcionario f : funcionarios){
            f.exibirDados();
            f.calcularPagamento();
            System.out.println("-----------------------");
        }

    }
}
