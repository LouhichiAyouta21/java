public class Zoo {
    private Aquatic[] aquaticAnimals;
    public Zoo() {
        aquaticAnimals = new Aquatic[5];
    }
    public void addAquaticAnimal(Aquatic aquatic){
        for( int i=0;i<aquaticAnimals.length;i++){
            if (aquaticAnimals[i]==null){
                aquaticAnimals[i]= (Aquatic) aquatic;
                System.out.println(aquatic.getName());
                return;
            }
        }
    }
    public void displayAquaticAnimals() {
        System.out.println("Liste des animaux aquatiques dans le zoo :");
        for (int i = 0; i < aquaticAnimals.length; i++) {
            if (aquaticAnimals[i] != null) {
                System.out.println("- " + aquaticAnimals[i].getName());
            } else {
                System.out.println("- Emplacement vide");
            }
        }
    }
    public void makeAllSwim() {
        System.out.println("Tous les animaux aquatiques nagent :");
        for (Aquatic aquatic : aquaticAnimals) {
            if (aquatic != null) {
                aquatic.swim();  // Appel de la méthode swim()
            }
        }
    }
}
