package oop_cw01;

public class ClassWork06 {
    public static void main(String[] args) {
        Human h1 = new Human();
        h1.age = 22;
        h1.name = "Alex";
        h1.salary = 500;

        Human h2 = new Human();
        h2.age = 23;
        h2.name = "Peter";
        h2.salary = 900;

        Human h3 = new Human();
        h3.age = 26;
        h3.name = "Eugene";
        h3.salary = 700;

        Human[] humans = {h1, h2, h3};
        Human humanWithMaxSalary;
        humanWithMaxSalary = getRichestHuman(humans);
        System.out.println(humanWithMaxSalary.name);
    }

    static Human getRichestHuman(Human[] humans) {
        Human testHuman = humans[0];
        for (int i = 0; i < humans.length; i++) {
            if (testHuman.salary <= humans[i].salary) {
                testHuman = humans[i];
            }
        }
        return testHuman;
    }


}
