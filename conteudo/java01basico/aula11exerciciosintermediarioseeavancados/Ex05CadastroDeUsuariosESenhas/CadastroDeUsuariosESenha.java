package projeto201.conteudo.java01basico.aula11exerciciosintermediarioseeavancados.Ex05CadastroDeUsuariosESenhas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CadastroDeUsuariosESenha {
    private static final Scanner scanner = new Scanner(System.in);
    private static final Map<String, Usuario> usuarios = new HashMap<>();

    public static void main(String[] args) {
        // Menu
        int opcao;
        do {
            System.out.println("--- MENU ---");
            System.out.println("Escolha uma opção:");
            System.out.println("1 - Cadastrar um novo usuário");
            System.out.println("2 - Listar usuários");
            System.out.println("0 - sair");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    cadastrarUsuario();
                case 2:
                    listarUsuarios();
                case 3:
                    System.out.println("Saindo do programa");
                default:
                    System.out.println("Opção inválida");
            }
        }while(opcao != 0);
    }
    // metodo para cadastrar usuário
    private static void cadastrarUsuario(){
        System.out.println("Digite o nome do usuário: ");
        String login = scanner.nextLine();
        if(usuarios.containsKey(login)){
            System.out.println("Usuário indisponível");
            return;
        }
        System.out.println("Digite a senha: ");
        String senha = scanner.nextLine();
        if (Senha.senhaValida(senha)){
            System.out.println("""
            Sua senha deve conter:
            - No minímo 8 caracteres
            - Uma letra maiúcula
            - Uma letra minúscula
            - Um número
            - um caractere especial
            """);
            return;
        }

        usuarios.put(login, new Usuario(login,senha));
        System.out.println("Usuário cadastrado com sucesso");
    }
    // metodo para listar usuário
    private static void listarUsuarios(){
        if(usuarios.isEmpty()){
            System.out.println("Nenhum usuário cadastrado");
            return;
        }
        System.out.println("\n--- Usuários Cadastrados ---");
        for (Usuario u : usuarios.values()){
            System.out.println(u);
        }
    }
}
