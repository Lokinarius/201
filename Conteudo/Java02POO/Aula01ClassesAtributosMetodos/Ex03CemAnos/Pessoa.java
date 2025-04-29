package Projeto201.Conteudo.Java02POO.Aula01ClassesAtributosMetodos.Ex03CemAnos;

public class Pessoa {
    // Atributos
    public String nome;
    public int idade;

    // Metodos
    public void seculo(){
        System.out.println("Faltam "+(100 - idade)+" anos para "+nome+" atingir 100 anos");
    }

}
