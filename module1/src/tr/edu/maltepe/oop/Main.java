package tr.edu.maltepe.oop;

public class Main {
    public static void main(String[] args) {
        Cat kitten = new Cat("Mini", 0);
        Cat adultCat = new Cat("Tom", 3);

        kitten.meow();
        adultCat.meow();
    }
}
