package cw7;

public class Main {
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
      Human human;

//        for (int i = 0; i < humans.length; i++) {
//            if(humans[i].salary < salary){
//                salary = humans[i].salary;
                return null;
//            }

//        }
    }
}

