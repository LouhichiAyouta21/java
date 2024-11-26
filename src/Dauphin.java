public class Dauphin implements Aquatic {
    private String name;
    private int age;
    private String habitat;

    public Dauphin(String name, int age, String habitat) {
        this.name = name;
        this.age = age;
        this.habitat = habitat;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getHabitat() {
        return habitat;
    }

    @Override
    public void swim() {
        System.out.println(name + " nage avec élégance !");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Dauphin dauphin = (Dauphin) obj;
        return age == dauphin.age &&
                Objects.equals(name, dauphin.name) &&
                Objects.equals(habitat, dauphin.habitat);
    }
}