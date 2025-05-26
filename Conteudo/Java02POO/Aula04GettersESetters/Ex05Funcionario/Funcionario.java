package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex05Funcionario;

public class Funcionario {
    // ATRIBUTOS
    private String nome;
    private String cargo;
    private double salario;

    // CONSTANTE
    private static final double SALARIO_MINIMO = 1412.0;

    // CONSTRUTOR
    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        setSalario(salario);
    }

    public Funcionario() {

    }

    // GETTER AND SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {this.cargo = cargo;}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {
        if(salario < SALARIO_MINIMO){
            System.out.println("Salário é inferior ao salário mínimo");
            this.salario = SALARIO_MINIMO;
        }else{
            this.salario=salario;
        }
    }

    // METODOS
    public void ExibirDados(){
        System.out.println("""
                =========================
                Nome: %s
                Cargo: %s
                Salário: %s
                =========================
                """.formatted(getNome(),getCargo(),getSalario()));
    }

}
