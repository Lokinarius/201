package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.service;

import projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain.Carro;
import projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain.Proprietario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConcessionariaService {
    private List<Carro> carros = new ArrayList<>();
    private List<Proprietario> proprietarios = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    // LISTAR CARROS
    public void listarCarros() {
        for(Carro c: carros){
            c.exibirDados();
        }
    }

    // LISTAR PROPRIETARIOS
    public void listarProprietarios() {
        for(Proprietario p: proprietarios){
            p.exibirDados();
        }
    }

    // BUSCAR CARROS
    public Carro buscarCarroPorModelo(String modelo){
        for(Carro c : carros){
            if(c.getModelo().equalsIgnoreCase(modelo)){
                return c;
            }
        }
        return null;
    }

    public Carro buscarCarro() {
        System.out.println("Digite o modelo do Carro: ");
        String modelo = scanner.nextLine();
        Carro c = buscarCarroPorModelo(modelo);
        if(c == null){
            System.out.println("Carro não encontrado");
        }else{
            c.exibirDados();
        }
        return c;
    }

    // BUSCAR PROPRIETARIOS
    public Proprietario buscarProprietarioPorNome(String nome){
        for(Proprietario p: proprietarios){
            if(p.getNome().equalsIgnoreCase(nome)){
                return p;
            }
        }
        return null;
    }

    public Proprietario buscarProprietario() {
        System.out.println("Digite o nome do Proprietário: ");
        String nome = scanner.nextLine();
        Proprietario p = buscarProprietarioPorNome(nome);
        if(p == null){
            System.out.println("Proprietário não encontrado");
        }else{
            p.exibirDados();
        }
        return p;
    }

    // VENDA DE CARRO
    public void vendaCarro() {
        Carro carro = buscarCarro();
        if(carro != null){
            carros.remove(carro);
            System.out.println(carro.getModelo()+" Vendido");
        }
    }

    // COMPRA DE CARRO
    public void compraCarro() {
        System.out.println("Nome do proprietario: ");
        String nome = scanner.nextLine();

        System.out.println("Marca do carro: ");
        String marca = scanner.nextLine();

        System.out.println("Modelo do carro: ");
        String modelo = scanner.nextLine();

        System.out.println("Ano de fabricação: ");
        int ano = scanner.nextInt();

        System.out.println("Placa do veículo");
        String placa = scanner.nextLine();
    }
}
