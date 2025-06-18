package projeto201.conteudo.java02poo.Aula03Construtores.Ex05Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {

        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("Leonardo","Gerente",5499.0);
        funcionarios[1] = new Funcionario("William","Técnico de TI",2300.0);
        funcionarios[2] = new Funcionario("Honório","Repositor",1500.0);
        funcionarios[3] = new Funcionario("Suellen","Faxineira",1800.0);
        funcionarios[4] = new Funcionario("Brenda","Caixa",1800.0);

    }
}
