package cw7;

public class Test {
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

        Human richestEmployee = getRichestEmployee(humans);

        System.out.println(richestEmployee.name);
    }

    static Human getRichestEmployee(Human[] humans) {
        Human richest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (richest.salary < humans[i].salary) {
                richest = humans[i];
            }
        }
        return richest;
    }
}
