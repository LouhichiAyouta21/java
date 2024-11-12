public class Animal {
    String name;




    // Constructeur pour initialiser le nom de l'animal
    public Animal(String name) {
        this.name = name;
    }

    // Méthode pour obtenir le nom de l'animal
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
