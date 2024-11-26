public interface Aquatic {
    String getName();
    void swim();

    int getAge();

    String getHabitat();

    // Redéfinition de equals() pour comparer nom, âge et habitat
    @Override
    boolean equals(Object obj);
}