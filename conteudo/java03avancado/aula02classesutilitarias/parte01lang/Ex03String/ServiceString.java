package projeto201.conteudo.java03avancado.aula02classesutilitarias.parte01lang.Ex03String;

import java.util.Scanner;

public class ServiceString {
    private Scanner sc = new Scanner(System.in);

    // Mostrar tamanho da String ( length )
    public void exibirTamanho() {
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        System.out.println("Tamanho: "+ texto.length());
    }

    // Acessar caractere em posição ( charAt )
    public void exibirCaractere() {
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        int pos = sc.nextInt();
        if(pos >= 0 && pos < texto.length()){
            System.out.println("Caractere: "+texto.charAt(pos));
        }else{
            System.out.println("Posição invalida! ");
        }
    }

    // Comparar strings ( equals - equalsIgnoreCase - compareTo )
    public void compararStrings() {
        System.out.println("Digite a primeira string: ");
        String s1 = sc.nextLine();
        System.out.println("Digite a segunda string: ");
        String s2 = sc.nextLine();

        System.out.println("equals: "+ s1.equals(s2));
        System.out.println("equalsIgnoreCase: "+s1.equalsIgnoreCase(s2));
        System.out.println("CompareTo: "+ s1.compareTo(s2));
        System.out.println("CompareToIgnoreCase: "+ s1.compareToIgnoreCase(s2));
    }

    // Buscar substring ( contains - indexOf )
    public void buscarSubstring() {
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();
        System.out.println("Digite a palavra a ser buscada: ");
        String palavra = sc.nextLine();

        System.out.println("Contém? " + texto.contains(palavra));
        System.out.println("Posição inicial: " + texto.indexOf(palavra));
    }

    // Modificar Texto ( toUppercase - Tolowercase - replace )
    public void modificarTexto() {
        System.out.println("Digite um texto: ");
        String texto = sc.nextLine();

        System.out.println("Maiúsculas: " + texto.toUpperCase());
        System.out.println("Minúsculas: " + texto.toLowerCase());
        System.out.println("Substituir 'a por @: " + texto.replace('a','@'));
    }

    // dividir String ( split - trim )
    public void dividirTexto() {
        System.out.println("Digite um texto som vírgulas: ");
        String texto = sc.nextLine();

        String[] partes = texto.split(",");
        System.out.println("Partes: ");
        for(String p : partes){
            System.out.println(" - "+ p.trim());
        }
    }



}
