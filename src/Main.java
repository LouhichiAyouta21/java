//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


            Aquatic aquaticAnimal = new Aquatic();
            Terrestrial terrestrialAnimal = new Terrestrial();
            Penguin penguin = new Penguin();


            System.out.println("Testing Aquatic:");
            aquaticAnimal.eatMeat(Food.MEAT);
            aquaticAnimal.eatMeat(Food.PLANT);


            System.out.println("\nTesting Terrestrial:");
            terrestrialAnimal.eatMeat(Food.MEAT);
            terrestrialAnimal.eatPlant(Food.PLANT);
            terrestrialAnimal.eatPlantAndMeat(Food.BOTH);


            System.out.println("\nTesting Penguin:");
            penguin.eatMeat(Food.MEAT);
            penguin.eatPlant(Food.PLANT);
            penguin.eatPlantAndMeat(Food.BOTH);
        }
        }

