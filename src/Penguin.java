public class Penguin implements Omnivore<Food> {

    @Override
    public void eatMeat(Food meat) {
        if (meat == Food.MEAT) {
            System.out.println("The penguin eats fish (meat).");
        } else {
            System.out.println("The penguin cannot eat this type of food.");
        }
    }

    @Override
    public void eatPlant(Food plant) {
        if (plant == Food.PLANT) {
            System.out.println("The penguin occasionally eats plants.");
        } else {
            System.out.println("The penguin does not eat this type of food.");
        }
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        if (food == Food.BOTH) {
            System.out.println("The penguin eats both meat and plants.");
        } else {
            System.out.println("The penguin cannot eat mixed food.");
        }
    }


}