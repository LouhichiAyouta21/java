package tn.esprit.gestionzoo.entities;
public class Animal {
    private String name;
    private int age;



    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public void setName(String name) {
        if (name== null){
            throw new NullPointerException("name is null");
        }
        this.name = name;
    }
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Invalid Age");
        }
        this.age = age;
    }
    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                '}';
    }
}
