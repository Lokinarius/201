package projeto201.conteudo.java02poo.aula02modificadoresevisibilidade.ex05livro;

public class LivroTest {
    public static void main(String[] args) {

        Livro livro1 = new Livro();
        livro1.titulo = "1984";
        livro1.autor = "George Orwell";
        livro1.numeroPaginas = 328;

        Livro livro2 = new Livro();
        livro2.titulo = "Harry Potter e a Pedra Filosofal";
        livro2.autor = "J.K. Rowlling";
        livro2.numeroPaginas = 223;

        Livro livro3 = new Livro();
        livro3.titulo = "O Pequeno Principe";
        livro3.autor = "Antoine de Saint-Exupéry";
        livro3.numeroPaginas = 96;

        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}
