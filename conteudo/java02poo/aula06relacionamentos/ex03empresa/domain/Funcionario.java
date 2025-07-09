package projeto201.conteudo.java02poo.aula06relacionamentos.ex03empresa.domain;

public class Funcionario {
    // ATRIBUTOS
    private String nome;
    private String cargo;
    private double salario;

    // GETTERS AND SETTERS
    public String getNome() {return nome;}
    public void setNome(String nome) {
        if(nome == null || nome.isBlank()){
            this.nome = "Nome confidencial";
        }else{
            this.nome = nome;
        }
    }

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {
        if (cargo == null || cargo.isBlank()) {
            this.cargo = "Cargo desconhecido";
        } else {
            this.cargo = cargo;
        }
    }

    public double getSalario() {return salario;}
    public void setSalario(double salario) {
        if(salario>1500.0){
            this.salario = salario;
        }else{
            System.out.println("Salário definido para o salário mínimo");
            this.salario = 1500.0;
        }
    }

    // CONSTRUTOR
    public Funcionario(String nome, String cargo, double salario) {
        setNome(nome);
        setCargo(cargo);
        setSalario(salario);
    }

    // METODOS
    public void exibirDados() {
        System.out.println(
                """
                ============================
                Nome   : %s
                Cargo  : %s
                Salário: R$ %.2f
                ============================
                """.formatted(getNome(), getCargo(), getSalario())
        );
    }
}
