package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex04ContaBancariaSaque;

public class ContaBancaria {
    // ATRIBUTOS
    public String usuario;
    public int conta;
    public String senha;
    public double saldo;



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
