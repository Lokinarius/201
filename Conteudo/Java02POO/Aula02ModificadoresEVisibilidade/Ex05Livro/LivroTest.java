package Projeto201.Conteudo.Java02POO.Aula02ModificadoresEVisibilidade.Ex05Livro;

public class LivroTest {
    public static void main(String[] args) {
        Livro livro1 = new Livro("1984","Georde Orwell",328);
        Livro livro2 = new Livro("Harry Potter e a Pedra filosofal","J.K.Rowlling",223);
        Livro livro3 = new Livro("O Pequeno Principe","Antoine de Saint-Exupéry",96);

        livro1.exibirDados();
        livro2.exibirDados();
        livro3.exibirDados();
    }
}
