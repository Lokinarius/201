package projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.test;

import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Caminhao;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Carro;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.domain.Moto;
import projeto201.conteudo.java02poo.aula07heranca.ex02veiculo.service.VeiculoService;

public class VeiculoTest {
    public static void main(String[] args) {
        VeiculoService service = new VeiculoService();

        // Adiciona veículos
        service.adicionarVeiculo(new Carro("Toyota", "Corolla", 2022, 4));
        service.adicionarVeiculo(new Moto("Honda", "CG 160", 2021, true));
        service.adicionarVeiculo(new Caminhao("Volvo", "FH", 2020, 18));

        // Lista todos os veículos e executa ações
        service.listarTodos();
    }
}
