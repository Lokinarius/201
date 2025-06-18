package projeto201.conteudo.java01basico.Aula01TiposPrimitivo.Ex01Declaracao;
// JAVA é uma linguagem fortemente tipada, a declaração é essencial no JAVA

public class TipoPrimitivos {
    public static void main(String[] args) {
        /* TIPOS PRIMITIVOS */
        int idade = 30;
        double peso = 83.5;
        float altura = 1.8f;
        char letra = 'W';
        byte bits = 127; //max
        short curto = 32767; //max
        long longe = 9223372036854775807L; //max
        boolean verdadeiro = true;
        boolean falso = false;

        /* CLASSE STRING */
        String name = "William";
        String job = "Desenvolvedor";
        String nivel = "Junior";

        System.out.println("Idade: " + idade);
        System.out.println("Peso: " + peso);
        System.out.println("Altura: "+ altura);
        System.out.println("Letra: " + letra);
        System.out.println("Octeto: " + bits);
        System.out.println("Curto: " + curto);
        System.out.println("Longo: " + longe);
        System.out.println("Verdadeiro: " + verdadeiro);
        System.out.println("Falso: " + falso);

        System.out.println("Nome: " + name);
        System.out.println("Profissão: " + job);
        System.out.println("Nivel: " + nivel);
    }
}
