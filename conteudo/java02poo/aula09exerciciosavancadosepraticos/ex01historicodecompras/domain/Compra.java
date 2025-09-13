package projeto201.conteudo.java02poo.aula09exerciciosavancadosepraticos.ex01historicodecompras.domain;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Compra {
    // atributos
    private int id;
    private Cliente cliente;
    private List<Produto> itens = new ArrayList<>();
    private LocalDate data;
    private double valorTotal;

    // construtor
    public Compra(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
        this.data = LocalDate.now();
    }

    // getters and setters
    public int getId() {return id;}
    public void setId(int id) {this.id = id;}

    public Cliente getCliente() {return cliente;}
    public void setCliente(Cliente cliente) {this.cliente = cliente;}

    public List<Produto> getItens() {
        return itens;
    }

    public void setItens(List<Produto> itens) {
        this.itens = itens;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public void adicionarItem(Produto item) {
        itens.add(item);
    }

    public double getValorTotal() {
        return itens.stream()
                .mapToDouble(Produto::getPreco)
                .sum();
    }

    // to string
    @Override
    public String toString() {
        return "Compra{" +
                "id=" + id +
                ", cliente=" + cliente.getNome() +
                ", data=" + data +
                ", total=R$" + getValorTotal() +
                ", itens=" + itens +
                '}';
    }
}
