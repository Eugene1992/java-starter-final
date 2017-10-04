package cw08.polymorphism;

public class Test {
    public static void main(String[] args) {
        Cat murka = new Cat("Murka");
        Animal barsik = new Cat("Barsik");
        Dog rex = new Dog("Rex");
        Duck donald = new Duck("Donald");
        Animal animal = new Animal("Animal");

        Animal[] animals = {murka, rex, donald, animal, barsik};

        sayHello(animals);
    }

    public static void sayHello(Animal[] animals) {
        for (Animal animal : animals) {
            animal.sayHello();
        }
    }

    public static void sayHelloWithouPoly(Animal[] animals) {
        for (Animal animal : animals) {
            if (animal instanceof Cat) {
                Cat cat = (Cat) animal;
                cat.sayHello();
            }
            if (animal instanceof Dog) {
                Dog dog = (Dog) animal;
                dog.sayHello();
            }
        }
    }
}
