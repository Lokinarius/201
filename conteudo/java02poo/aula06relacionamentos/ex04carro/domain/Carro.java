package projeto201.conteudo.java02poo.aula06relacionamentos.ex04carro.domain;

public class Carro {
    // ATRIBUTOS
    private String marca;
    private String modelo;
    private int ano;
    private String placa;
    private Proprietario proprietario;



    // GETTERS E SETTERS
    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public String getModelo() {return modelo;}
    public void setModelo(String modelo) {this.modelo = modelo;}

    public int getAno() {return ano;}
    public void setAno(int ano) {
        if (ano > 1900 && ano <= java.time.Year.now().getValue()) {
            this.ano = ano;
        } else {
            System.out.println("Ano inválido! Definido como 0.");
            this.ano = 0;
        }
    }

    public String getPlaca() {return placa;}
    public void setPlaca(String placa) {this.placa = placa;}

    public Proprietario getProprietario() {return proprietario;}
    public void setProprietario(Proprietario proprietario) {this.proprietario = proprietario;}

    // CONSTRUTOR
    public Carro() {

    }

    public Carro(String marca, String modelo, int ano, String placa, Proprietario proprietario) {
        setMarca(marca);
        setModelo(modelo);
        setAno(ano);
        setPlaca(placa);
        setProprietario(proprietario);
    }

    // METODOS
    @Override
    public String toString() {
        return modelo + " (" + placa + ")";
    }

    public void exibirDados() {
        String nomeProprietario = (getProprietario() != null) ? getProprietario().getNome() : "Sem proprietário";
        System.out.println("""
                =======================
                Marca:\t%s
                Modelo:\t%s
                Ano:\t%d
                Placa:\t%s
                Proprietário:\t%s
                """.formatted(getMarca(), getModelo(), getAno(), getPlaca(), nomeProprietario));
    }

}
