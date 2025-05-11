package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex05Livro;

public class Livro {
    // ATRIBUTOS
    private String titulo;
    private String autor;
    private int numeroPaginas;

    //CONSTRUTOR


    public Livro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    // METODOS
    public void exibirDados(){
        System.out.println("Título: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Numero de páginas: "+numeroPaginas);
    }

}
