package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex03ContaBancaria;

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
