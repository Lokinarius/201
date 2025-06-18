package projeto201.conteudo.java01basico.Aula10ExerciciosCombinados.Ex03AgendaDeContatos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// Classe Agenda
public class AgendaDeContatos {
    public static class Agenda {
        private ArrayList<String> contatos;

        public Agenda(){
            this.contatos = new ArrayList<>();
        }

        // Metodo Adicionar
        public void addContato(String nome, int telefone){
            String contato = nome+" - "+telefone;
            contatos.add(contato);
            System.out.println("Novo Contato: "+contato);
        }

        // Metodo Listar
        public void listContato(){
            if(contatos.isEmpty()){
                System.out.println("A agenda está vazia.");
                return;
            }
            Collections.sort(contatos);
            System.out.println("Lista de contatos: ");
            for(String contato : contatos){
                System.out.println(contato);
            }
        }

        // Metodo busca
        public void buscaContato(String nome){
            boolean encontrado = false;
            for(String contato : contatos){
                if(contato.startsWith(nome)){
                    System.out.println("Contato encontrado: "+contato);
                    encontrado = true;
                }
            }
            if(!encontrado){
                System.out.println("Contato não encontrado.");
            }
        }

        // Metodo deletar
        public void delContato(String nome){
            boolean removido = contatos.removeIf(contato -> contato.startsWith(nome));
            if (removido){
                System.out.println("Contato deletado.");
            } else {
                System.out.println("O contato não existe");
            }
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Agenda agenda = new Agenda();

        while(true){
            System.out.println("\n-*-*- AGENDA DE CONTATOS -*-*-");
            System.out.println("1 - Adicionar Contato");
            System.out.println("2 - Listar Contatos");
            System.out.println("3 - Buscar contato");
            System.out.println("4 - Remover Contato");
            System.out.println("5 - Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao){
                case 1:
                    System.out.println("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Telefone: ");
                    int telefone = scanner.nextInt();
                    agenda.addContato(nome,telefone);
                    break;
                case 2:
                    agenda.listContato();
                    break;
                case 3:
                    System.out.println("Buscar contato:");
                    String nomeBusca = scanner.nextLine();
                    agenda.buscaContato(nomeBusca);
                    break;
                case 4:
                    System.out.println("Deletar contato");
                    String nomeDel = scanner.nextLine();
                    agenda.delContato(nomeDel);
                    break;
                case 5:
                    System.out.println("Saindo da agenda");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção invalida");
            }
        }
    }
}
