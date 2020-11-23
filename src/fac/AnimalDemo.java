package fac;

public class AnimalDemo {
    public static void main(String[] args) {
        Animal a = AnimalFactory.createAnimal("DOG");
        a.eat();
    }
}
