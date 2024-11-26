public class Poisson implements Aquatic {
    String name;
    public Poisson(String name) {
        this.name=name;
    }
    public String getName() {
        return name;
    }
    @Override
    public void swim() {
        System.out.println(name + " nage rapidement et silencieusement !");
    }
}
