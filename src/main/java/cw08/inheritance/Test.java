package cw08.inheritance;

public class Test {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Rex", 2);
        Dog dog2 = new Dog("Rex", 6);
        Cat cat1 = new Cat("Murka", 3, 10);
        Cat cat2 = new Cat("Murka", 8, 10);

        Dog[] dogs = {dog1, dog2};
        Cat[] cats = {cat1, cat2};

        Animal oldestAnimal1 = getOldestAnimal(cats);
        Animal oldestAnimal2 = getOldestAnimal(dogs);
    }

    static Dog getOldestDog(Dog[] dogs) {
        Dog oldest = dogs[0];
        for (Dog dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }

    static Cat getOldestCat(Cat[] dogs) {
        Cat oldest = dogs[0];
        for (Cat dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }

    static Animal getOldestAnimal(Animal[] dogs) {
        Animal oldest = dogs[0];
        for (Animal dog : dogs) {
            if (dog.getAge() > oldest.getAge()) {
                oldest = dog;
            }
        }
        return oldest;
    }
}
