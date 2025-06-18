package projeto201.conteudo.java01basico.aula06estruturasderepeticao.Ex02SomaWhile;
// A estrutura while executa repetidamente um bloco de código enquanto uma condição for verdadeira.
public class SomaWhile {
    public static void main(String[] args) {
        int num = 1;
        int soma = 0;
        System.out.println("Somando todos os números de um a cem");
        while (num <= 100){
            System.out.println(soma+" + "+num+ " = "+(soma+num));
            soma += num;
            num ++;
        }
    }
}
