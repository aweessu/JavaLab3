package Task66;

public class TestAnimal {
    public static void main(String[] args) {
        Animal c1 = new Cat("Kitty");
        c1.greets(); // Meow

        Dog d1 = new Dog("Rex");
        d1.greets(); // Woof

        BigDog bd1 = new BigDog("Bruno");
        bd1.greets(); // Wooow

        d1.greets(new Dog("Buddy"));     // Woooof
        bd1.greets(new Dog("Spike"));    // Woooooow
        bd1.greets(new BigDog("Max"));   // Wooooooooow
    }
}
