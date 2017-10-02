package cw6;

public class HumanUtil {

    public Human getRichestEmployee(Human[] humans) {
        Human richest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (richest.salary < humans[i].salary) {
                richest = humans[i];
            }
        }
        richest.salary = 10;
        return richest;
    }
}
