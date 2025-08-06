package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.service;

import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Caminhao;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Caminhao;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Carro;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Moto;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Veiculo;

import java.util.ArrayList;

public class VeiculoService {
    private ArrayList<Veiculo> veiculos = new ArrayList<>();

    public void adicionarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }

    public void listarTodos(){
        for(Veiculo veiculo: veiculos){
            System.out.println("=== Informações do Veículo ===");
            veiculo.exibirInfo();
            veiculo.ligar();

            if(veiculo instanceof Carro){
                ((Carro)veiculo).abrirPortaMalas();
            } else if (veiculo instanceof Moto) {
                ((Moto) veiculo).empinar();
            } else if (veiculo instanceof Caminhao){
                ((Caminhao)veiculo).carregarCarga();
            }

            veiculo.desligar();
            System.out.println();
        }
    }
}
