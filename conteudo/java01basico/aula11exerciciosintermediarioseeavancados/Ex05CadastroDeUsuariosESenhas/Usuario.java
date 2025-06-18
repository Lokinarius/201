package projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.Ex05CadastroDeUsuariosESenhas;

public class Usuario {
    private String login;
    private String senha;

    public Usuario(String login, String senha){
        this.login = login;
        this.senha = senha;
    }

    public String getLogin(){
        return login;
    }

    @Override
    public String toString(){
        return "Usuário: "+login;
    }
}
