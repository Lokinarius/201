package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

public class Compra {
    // Atributtos
    private String id;
    private String data;
    private Cliente cliente;
    private String listaDeProduto;
    private double valorTotal;

    // construtor
    public Compra(String id, String data, Cliente cliente, String listaDeProduto, double valorTotal) {
        this.id = id;
        this.data = data;
        this.cliente = cliente;
        this.listaDeProduto = listaDeProduto;
        this.valorTotal = valorTotal;
    }

    // Getters and setters
    public String getId() {return id;}
    public void setId(String id) {this.id = id;}

    public String getData() {return data;}
    public void setData(String data) {this.data = data;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public String getListaDeProduto() {return listaDeProduto;}
    public void setListaDeProduto(String listaDeProduto) {this.listaDeProduto = listaDeProduto;}

    public double getValorTotal() {return valorTotal;}
    public void setValorTotal(double valorTotal) {this.valorTotal = valorTotal;}

    // Metodo
    public void calcularTotal(){

    }

}
