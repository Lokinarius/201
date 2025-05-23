package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex05Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[5];
        funcionarios[0] = new Funcionario("Carlinhos","Veterinário",2050);
        funcionarios[1] = new Funcionario("Leandro","Advogado",4000);
        funcionarios[2] = new Funcionario("Gabriela","Psicóloga",3500);
        funcionarios[3] = new Funcionario("Sandra","Professora",2800);
        funcionarios[4] = new Funcionario("Wesley","Designer",3000);

        System.out.println("============== FUNCIONARIOS ==============");
        for(Funcionario f : funcionarios){
            f.ExibirDados();
        }
    }
}
