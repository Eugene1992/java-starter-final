public class ClassWork06 {
    public static void main(String[] args) {
//        String[] names = {"Alex", "Peter", "Eugene", "Antony"};
//        int[] ages = {22, 23, 26, 28};
//        int[] salary = {500, 900, 700, 800};
//        maxSalaryName(names, salary);

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
            if (testHuman.salary <= humans[i].salary){
                testHuman = humans[i];
            }
        }
        return testHuman;
    }


//    static void maxSalaryName(String[] names, int[] salary) {
//        int testElement = salary[0];
//        int count = 0;
//        for (int i = 0; i < salary.length; i++) {
//            if (testElement <= salary[i]) {
//                testElement = salary[i];
//                count = i;
//            }
//        }
//        System.out.println(names[count]);
//    }
}
