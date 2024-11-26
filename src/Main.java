//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();  // Crée un nouveau zoo

        // Crée des animaux aquatiques
        Dauphin dauphin = new Dauphin("Dauphin");
        Poisson poisson= new Poisson("poisson");
        zoo.addAquaticAnimal(dauphin);
        zoo.addAquaticAnimal(poisson);
        zoo.displayAquaticAnimals();
        zoo.makeAllSwim();
    }
}