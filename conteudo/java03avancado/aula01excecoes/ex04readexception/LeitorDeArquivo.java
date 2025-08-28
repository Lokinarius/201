package projeto201.conteudo.java03avancado.aula01excecoes.ex04readexception;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class LeitorDeArquivo {
    public static void main(String[] args) {
        String nomeArquivo = "Texto.txt";


        try{
            File arquivo = new File(nomeArquivo);
            Scanner leitor = new Scanner(arquivo);

            System.out.println("Lendo o arquivo: ");
            while(leitor.hasNextLine()){
                String linha = leitor.nextLine();
                System.out.println(linha);
            }
            leitor.close();

        }catch(FileNotFoundException e){
            System.out.println("Arquivo não encontrado! Criando um novo arquivo...");

            try{
                FileWriter escritor = new FileWriter(nomeArquivo);
                escritor.write("Olá, Mundo!\n");
                escritor.write("Agora você sabe criar um arquivo em JAVA, parabéns!");
                escritor.close();
            }catch (IOException ioEx){
                System.out.println("Erro ao criar o arquivo: "+ ioEx.getMessage());
            }

        }
    }
}
