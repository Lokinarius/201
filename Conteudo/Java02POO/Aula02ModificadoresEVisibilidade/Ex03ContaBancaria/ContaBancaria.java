package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex03ContaBancaria;

public class ContaBancaria {
    // ATRIBUTOS
    private String usuario;
    private int conta;
    private double saldo;

    // GETTERS E SETTERS
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public int getConta() {return conta;}
    public void setConta(int conta) {this.conta = conta;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    // METODOS
    public void exibirSaldo(){
        System.out.println("Usuário: "+usuario);
        System.out.println("Conta: "+ conta);
        System.out.println("Saldo: "+saldo);
    }
}
