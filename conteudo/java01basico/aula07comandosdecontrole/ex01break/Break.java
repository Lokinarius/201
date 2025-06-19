package projeto201.conteudo.java01basico.aula07comandosdecontrole.ex01break;
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
