package Projeto201.Conteudo.Java02POO.Aula04GettersESetters.Ex02ContaBancaria;

public class ContaBancaria {
    // ATRIBUTOS
    public String usuario;
    public int conta;
    public double saldo;

    // CONSTRUTOR
    public ContaBancaria(String usuario, int conta, double saldo) {
        this.usuario = usuario;
        this.conta = conta;
        setSaldo(saldo);
    }

    public ContaBancaria() {

    }

    // GETTERS E SETTERS
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public int getConta() {return conta;}
    public void setConta(int conta) {this.conta = conta;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {
        if(saldo >0){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo inválido");
        }
    }

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ========================
                Usuário: %s
                Conta: %s
                Saldo: %s
                ========================
                """.formatted(getUsuario(),getConta(),getSaldo()));
    }
}
