package projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.test;

import projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain.Estagiario;
import projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain.Funcionario;
import projeto201.conteudo.java02poo.aula07heranca.ex04funcionario.domain.Gerente;

import java.util.ArrayList;

public class FuncionarioTest {
    public static void main(String[] args) {
        ArrayList<Funcionario> funcionarios = new ArrayList<>();

        funcionarios.add(new Funcionario("Carlos", 3000));
        funcionarios.add(new Gerente("Ana", 6000, "TI"));
        funcionarios.add(new Estagiario("João", 1500, 30));
        funcionarios.add(new Estagiario("Maria", 1200, 20));
        funcionarios.add(new Gerente("Paulo", 7000, "Financeiro"));

        for(Funcionario f: funcionarios){
            f.exibirInfo();
            System.out.println("Bônus: "+f.calcularBonus());
            System.out.println("-----------------------");
        }
    }
}
