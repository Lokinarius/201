package Projeto201.Conteudo.Java01BASICO.Aula07ComandosDeControle.Ex01Break;
// O comando break serve para intorromper um programa, ignorando uma condição previa
public class Break {
    public static void main(String[] args) {
        for (int num = 1;num < 10;num++){
            System.out.println(num);
            if (num >= 7){
                break;
            }
        }
    }
}
