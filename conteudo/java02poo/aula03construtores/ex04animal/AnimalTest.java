package projeto201.conteudo.java02poo.aula03construtores.ex04animal;

public class AnimalTest {
    public static void main(String[] args) {

        Animal[] animais = new Animal[5];
        animais[0] = new Animal("Leão","Panthera leo",true,"Mamífero");
        animais[1] = new Animal("Águia","Aquila chrysaetos",true,"Ave");
        animais[2] = new Animal("Cobra-real","Ophiophagus hannah",true,"Réptil");
        animais[3] = new Animal("Estrela-do-mar","Asteroidea",false,"Equinodermo");
        animais[4] = new Animal("Rã","Anura",true,"Anfíbio");

    }
}
