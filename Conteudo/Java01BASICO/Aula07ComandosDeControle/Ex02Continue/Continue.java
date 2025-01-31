package Projeto201.Conteudo.Java01BASICO.Aula07ComandosDeControle.Ex02Continue;
// O continue foi utilizado para ignorar os números múltiplos de 3 sem parar a própria iteração
public class Continue {
    public static void main(String[] args) {
        for (int n = 1; n <= 15; n ++){
            if (n % 3 == 0){
                continue;
            }
            System.out.println(n);
        }
    }
}
