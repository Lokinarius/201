package projeto201.conteudo.java02poo.aula06relacionamentos.ex05curso.domain;

import java.util.ArrayList;
import java.util.List;


public class CriarAluno {
    public static List<Aluno> gerarAlunos(List<Sede> sedes) {
        List<Aluno> alunos = new ArrayList<>();

        Sede sede1 = sedes.get(0);
        Sede sede2 = sedes.get(1);
        Sede sede3 = sedes.get(2);

        alunos.add(new Aluno("Ana Beatriz", 1001, "Informática", 1, sede1));
        alunos.add(new Aluno("Bruno Araújo", 1002, "Enfermagem", 2, sede2));
        alunos.add(new Aluno("Carlos Silva", 1003, "Administração", 3, sede3));
        alunos.add(new Aluno("Daniela Rocha", 1004, "Eletrotécnica", 1, sede1));
        alunos.add(new Aluno("Eduarda Lima", 1005, "Logística", 2, sede2));
        alunos.add(new Aluno("Felipe Souza", 1006, "Edificações", 3, sede3));
        alunos.add(new Aluno("Gabriela Torres", 1007, "Enfermagem", 2, sede1));
        alunos.add(new Aluno("Heitor Menezes", 1008, "Redes de Computadores", 1, sede2));
        alunos.add(new Aluno("Isabela Mendes", 1009, "Segurança do Trabalho", 3, sede3));
        alunos.add(new Aluno("João Victor", 1010, "Informática", 1, sede1));
        alunos.add(new Aluno("Karen Freitas", 1011, "Administração", 2, sede2));
        alunos.add(new Aluno("Lucas Carvalho", 1012, "Eletrotécnica", 3, sede3));
        alunos.add(new Aluno("Mariana Dias", 1013, "Logística", 1, sede1));
        alunos.add(new Aluno("Nicolas Ferreira", 1014, "Informática", 2, sede2));
        alunos.add(new Aluno("Olívia Castro", 1015, "Redes de Computadores", 3, sede3));
        alunos.add(new Aluno("Paulo Henrique", 1016, "Enfermagem", 1, sede1));
        alunos.add(new Aluno("Quésia Souza", 1017, "Edificações", 2, sede2));
        alunos.add(new Aluno("Rafael Monteiro", 1018, "Segurança do Trabalho", 3, sede3));
        alunos.add(new Aluno("Sabrina Leal", 1019, "Administração", 1, sede1));
        alunos.add(new Aluno("Thiago Almeida", 1020, "Informática", 2, sede2));
        alunos.add(new Aluno("Ursula Martins", 1021, "Eletrotécnica", 3, sede3));
        alunos.add(new Aluno("Vinícius Nogueira", 1022, "Enfermagem", 2, sede1));
        alunos.add(new Aluno("Wesley Barros", 1023, "Logística", 1, sede2));
        alunos.add(new Aluno("Xênia Ramos", 1024, "Redes de Computadores", 3, sede3));
        alunos.add(new Aluno("Yasmin Duarte", 1025, "Edificações", 2, sede1));
        alunos.add(new Aluno("Zeca Oliveira", 1026, "Segurança do Trabalho", 1, sede2));
        alunos.add(new Aluno("Alana Campos", 1027, "Administração", 3, sede3));
        alunos.add(new Aluno("Brenda Luz", 1028, "Informática", 2, sede1));
        alunos.add(new Aluno("Caio Moura", 1029, "Eletrotécnica", 1, sede2));
        alunos.add(new Aluno("Diana Ribeiro", 1030, "Logística", 3, sede3));

        return alunos;
    }
}