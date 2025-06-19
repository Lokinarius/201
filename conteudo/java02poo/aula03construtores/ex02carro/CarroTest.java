package projeto201.conteudo.java02poo.aula03construtores.ex02carro;

public class CarroTest {
    public static void main(String[] args) {
       Carro[] carros = new Carro[5];
       carros[0] = new Carro("Toyota","Corola");
       carros[1] = new Carro("Volkswalgen","Gol");
       carros[2] = new Carro("Chevrolet","Onix");
       carros[3] = new Carro("Fiat","Argo");
       carros[4] = new Carro("Honda","Civic");

       // Saída de dados
        System.out.println("=== Carros cadastrados ===");
        for (Carro c : carros){
            c.exibirDados();
            System.out.println("----------------------");
        }
    }
}
