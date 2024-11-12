//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.Animal;
import tn.esprit.gestionzoo.entities.Zoo;public class Main {
    public static void main(String[] args) {

        Zoo zoo1 = new Zoo();
        Zoo zoo2 = new Zoo();


        Animal lion = new Animal("Lion");
        Animal elephant = new Animal("Elephant");
        Animal giraffe = new Animal("Giraffe");
        Animal zebra = new Animal("Zebra");


        zoo1.addAnimal(lion);
        zoo1.addAnimal(elephant);

        zoo2.addAnimal(giraffe);
        zoo2.addAnimal(zebra);
        zoo2.addAnimal(lion);


        System.out.println("Zoo 1:");
        zoo1.afficher();

        System.out.println("Zoo 2:");
        zoo2.afficher();


        Zoo zooPlusGrand = Zoo.comparerZoo(zoo1, zoo2);
        System.out.println("Le zoo avec le plus d'animaux est :");
        zooPlusGrand.afficher();


        zoo1.removeAnimal(elephant);
        System.out.println("Après suppression de l'éléphant du zoo 1 :");
        zoo1.afficher();
    }
}
