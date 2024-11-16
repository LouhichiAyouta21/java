public class Aquatic implements Carnivore<Food>{
    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else {
            System.out.println("Aliment non adapté.");
        }
    }
}
