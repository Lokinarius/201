package Projeto201.Conteudo.Java02POO.Aula05Encapsulamento.Ex02Carro;

public class Carro {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int velMax;

    // CONSTRUTOR
    public Carro(String marca, String modelo, int velMax) {
        setMarca(marca);
        setModelo(modelo);
        setVelMax(velMax);
    }

    public Carro() {

    }

    // GETTERS AND SETTERS
    public String getMarca() {return marca;}
    public void setMarca(String marca) {
        if(marca == null || marca.isBlank()){
            System.out.println("Marca desconhecida");
            this.marca = "Desconhecida";
        }else{
            this.marca = marca;
        }
    }

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {
        if(modelo == null || modelo.isBlank()){
            System.out.println("Modelo desconhecido");
            this.modelo = "Desconhecido";
        }else{
            this.modelo = modelo;
        }
    }

    public int getVelMax() {return velMax;}
    public void setVelMax(int velMax) {
        if(velMax > 300 || velMax < 80){
            System.out.println("Velocidade máxima inválida");
            if (velMax > 300 ){
                diminuirVelocidade();
            }
            if (velMax < 80){
                aumentarVelocidade();
            }
        }else{
            this.velMax = velMax;
        }
    }


    // MÉTODOS
    public void aumentarVelocidade(){
        velMax = 80;
        System.out.println("velocidade máxima ajustada para o padrão mínimo");
    }

    public void diminuirVelocidade(){
        velMax = 300;
        System.out.println("Velocidade máxima ajustada para o padrão máximo");
    }

    public void exibirDados(){
        System.out.println("""
                ============================
                Marca: %s
                Modelo: %s
                Velocidade Máxima: %dkm/h
                ============================
                """.formatted(getMarca(),getModelo(),getVelMax()));
    }
}
