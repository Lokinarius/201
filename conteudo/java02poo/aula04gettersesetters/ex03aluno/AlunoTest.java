package projeto201.conteudo.java02poo.aula04gettersesetters.ex03aluno;

public class AlunoTest {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[5];
        alunos[0] = new Aluno("William",123456,7.1,8.2);
        alunos[1] = new Aluno("Brenda",273845,6.5,9.3);
        alunos[2] = new Aluno("Gustavo",998273,4.4,3.2);
        alunos[3] = new Aluno("Carolina",888327,9.2,8.3);
        alunos[4] = new Aluno("Paulo",928374,10,7.7);

        System.out.println("===== ALUNOS =====");
        for(Aluno a : alunos){
            a.exibirDados();
            System.out.println("---------------------");
        }
    }
}
