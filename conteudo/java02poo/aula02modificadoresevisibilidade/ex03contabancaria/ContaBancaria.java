package projeto201.conteudo.java02poo.aula02modificadoresevisibilidade.ex03contabancaria;

public class ContaBancaria {
    // ATRIBUTOS
    public String usuario;
    public int conta;
    public double saldo;

    // METODOS
    public void exibirSaldo(){
        System.out.println("Usuário: "+usuario);
        System.out.println("Conta: "+ conta);
        System.out.println("Saldo: "+saldo);
    }
}
