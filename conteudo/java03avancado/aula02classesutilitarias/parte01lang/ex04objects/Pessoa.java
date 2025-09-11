package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.ex04objects;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true; // mesma referência
        if (obj == null || getClass() != obj.getClass()) return false; // tipos diferentes

        Pessoa pessoa = (Pessoa) obj;
        return idade == pessoa.idade && nome.equals(pessoa.nome);
    }

    @Override
    public int hashCode() {
        return nome.hashCode() + idade;
    }
}


