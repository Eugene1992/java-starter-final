package cw08.inheritance;

public class Test2 {
    public static void main(String[] args) {
        Animal animal = new Dog("Rex", 2);
        Dog dog = new Dog("Rex", 2);
        Animal cat1 = new Cat("Murka", 8, 10);
        Cat cat2 = new Cat("Murka", 8, 10);

//        animal = cat1;

//        cat2 = (Cat) animal;

        if (animal instanceof Dog) {
            System.out.println("true");
        }

        System.out.println(cat2.getSpecialCatField());

        sayHello(cat2);
        sayHello(dog);
        sayHello(animal);

    }

    static void sayHello(Animal animal) {
        System.out.println("I'm animal! My name is " + animal.name);
    }
}
