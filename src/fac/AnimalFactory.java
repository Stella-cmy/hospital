package fac;

public class AnimalFactory {
    AnimalFactory(){

    }
    public static Animal createAnimal(String name){
        if("dog".equals(name.toLowerCase())) return new Dog();
        else if("cat".equals(name.toLowerCase())) return new Cat();
        else return null;
    }
}
