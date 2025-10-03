package Task66;

public class TestAnimal {
    public static void main(String[] args) {
        Animal c1 = new Cat("Kitty");
        c1.greets();

        Dog d1 = new Dog("Rex");
        d1.greets();

        BigDog bd1 = new BigDog("Bruno");
        bd1.greets();

        d1.greets(new Dog("Buddy"));
        bd1.greets(new Dog("Spike"));
        bd1.greets(new BigDog("Max"));
    }
}
