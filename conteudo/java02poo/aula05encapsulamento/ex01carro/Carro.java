package projeto201.conteudo.java02poo.aula05encapsulamento.ex01carro;

public class Carro {
    // ATRIBUTOS
    private String marca;
    private String modelo;

    // CONSTRUTOR
    public Carro(String marca, String modelo) {
        setMarca(marca);
        setModelo(modelo);
    }

    public Carro() {

    }

    // GETTER AND SETTERS
    public String getMarca() {return marca;}
    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            System.out.println("Marca inválida ou desconhecida");
            this.marca = "Desconhecida";
        }else{
            this.marca = marca;
        }
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            System.out.println("Modelo desconhecido");
        }else{
            this.modelo = modelo;
        }
    }

    // METEDOS
    public void exibirDados(){
        System.out.println("""
                ======================
                Marca: %s
                Modelo: %s
                ======================
                """.formatted(getMarca(), getModelo()));
    }
}
