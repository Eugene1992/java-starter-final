package cw08.inheritance;

public class Cat extends Animal {

    private int specialCatField;

    public Cat(String name, int age, int specialCatField) {
        super(name, age);
        this.specialCatField = specialCatField;
    }

    public int getSpecialCatField() {
        return specialCatField;
    }
}
