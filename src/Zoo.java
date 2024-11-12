package tn.esprit.gestionzoo.entities;
public class Zoo {
    private  int nbrCages ;
    private Animal[] animals;
    int count;

    public Zoo() {
        count = 0;
        animals = new Animal[nbrCages];
    }
public int getNbrCages() {
        return nbrCages;
}
public Animal[] getAnimals() {
        return animals;
}
public void setAnimals(Animal[] animals) {
        this.animals = animals;
}

    public boolean addAnimal(Animal animal) {
        if (searchAnimal(animal) != -1) {
            System.out.println("L'animal existe déjà dans le zoo.");
            return false;
        }
        if (isZooFull()) {
            System.out.println("Le zoo est plein.");
            return false;
        }
        animals[count] = animal;
        count++;
        return true;
    }


    public boolean removeAnimal(Animal animal) {
        int index = searchAnimal(animal);
        if (index != -1) {

            for (int i = index; i < count - 1; i++) {
                animals[i] = animals[i + 1];
            }
            animals[count - 1] = null;
            count--;
            return true;
        }
        return false;
    }

    public void afficher() {
        for (int i = 0; i < count; i++) {
            System.out.println(animals[i].getName());
        }
    }


    public int searchAnimal(Animal animal) {
        for (int j = 0; j < count; j++) {
            if (animals[j].getName().equals(animal.getName())) {
                return j;
            }
        }
        return -1;
    }

    public boolean isZooFull() {
        return count >= nbrCages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.count > z2.count) {
            return z1;
        } else {
            return z2;
        }
    }
}
