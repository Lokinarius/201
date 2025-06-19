package projeto201.conteudo.java02poo.aula05encapsulamento.ex03contacorrente;

public class ContaCorrente {
    // ATRIBUTOS
    private String usuario;
    private String senha;
    private String conta;
    private double saldo;

    // CONSTRUTOR
    public ContaCorrente(String usuario, String conta, String senha, double saldo) {
        setUsuario(usuario);
        setConta(conta);
        setSenha(senha);
        setSaldo(saldo);
    }

    // GETTERS E SETTERS
    public String getUsuario() {return usuario;}
    public void setUsuario(String usuario) {this.usuario = usuario;}

    public String getConta() {return conta;}
    public void setConta(String conta) {this.conta = conta;}

    public String getSenha() {return senha;}
    public void setSenha(String senha) {this.senha = senha;}

    public double getSaldo() {return saldo;}
    public void setSaldo(double saldo) {this.saldo = saldo;}

    // METODOS
    public void exibirDados(){
        System.out.println("""
                ======================
                Usuário: %s
                Conta: %s
                Saldo: %s
                ======================
                """.formatted(getUsuario(),getConta(),getSaldo()));
    }

    public void depositar(double valor){
        if(valor > 0){
            this.saldo += valor;
            System.out.println("Depósito de R$ "+valor+" realizado com sucesso.");
        }else{
            System.out.println("Valor inválido para depósito.");
        }
    }

    public boolean sacar(double valor){
        if(valor > 0 && valor <= saldo){
            this.saldo -= valor;
            System.out.println("Saque de R$ "+valor+" realizado com sucesso.");
            return true;
        }else{
            System.out.println("Saldo insuficiente ou valor inválido.");
            return false;
        }
    }
}
