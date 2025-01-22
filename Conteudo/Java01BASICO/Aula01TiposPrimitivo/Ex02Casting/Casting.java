package Projeto201.Conteudo.Java01BASICO.Aula01TiposPrimitivo.Ex02Casting;
// Casting é uma forma de conversão de tipos primitivos, ela pode ser implicita, ou explicita como no caso abaixo
public class Casting {
    public static void main(String[] args) {
        int inteiro = 100;
        float real = (float)inteiro; // Casting
        System.out.println("O número inteiro "+inteiro+" em real é "+real);
    }
}
