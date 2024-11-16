public class Terrestrial implements Omnivore<Food>{
    @Override

    public void eatMeat(Food meat) {
        if (meat == Food.MEAT || meat == Food.BOTH) {
            System.out.println("L'animal terrestre mange de la viande.");
        } else {
            System.out.println("Aliment non adapté.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT || plant == Food.BOTH) {
            System.out.println("L'animal terrestre mange des plantes.");
        } else {
            System.out.println("Aliment non adapté.");
        }
    }

    @Override
    public void eatPlantAndMeet(Food food) {

            System.out.println("L'animal terrestre mange de la viande des plantes.");

}
}
