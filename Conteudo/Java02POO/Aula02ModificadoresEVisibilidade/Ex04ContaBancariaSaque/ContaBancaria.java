package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex04ContaBancariaSaque;

public class ContaBancaria {
    // ATRIBUTOS
    private String usuario;
    private int conta;
    private String senha;
    private double saldo;

    // CONSTRUTOR
    public ContaBancaria(String usuario, int conta, String senha, double saldo) {
        this.usuario = usuario;
        this.conta = conta;
        this.senha = senha;
        this.saldo = saldo;
    }

    // GETTERS E SETTERS
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    public int getConta() {return conta;}
    public void setConta(int conta) {this.conta = conta;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    // METODO EXIBIR SALDOS
    public void exibirSaldo(){
        System.out.println("Usuário: "+usuario);
        System.out.println("Conta: "+conta);
        System.out.println("Saldo: "+ saldo);
    }

    // METODO VALIDAR SENHA
    public boolean validarSenha(String senhaInformada){
        return this.senha.equals(senhaInformada);
    }

    // METODO DEPOSITAR
    public boolean depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            return true;
        }
        return false;
    }

    // METODO SACAR
    public boolean sacar(double valor){
        if(valor > 0 && valor <= this.saldo){
            this.saldo -= valor;
            return true;
        }
        return false;
    }
}
