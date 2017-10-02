package cw07;

public class HumanUtil {

    public Human getRichestEmployee(Human[] humans) {
        Human richest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (richest.salary < humans[i].salary) {
                richest = humans[i];
            }
        }

        return richest;
    }

    public Human getOldestEmployee(Human[] humans) {
        Human richest = humans[0];
        for (int i = 1; i < humans.length; i++) {
            if (richest.age < humans[i].age) {
                richest = humans[i];
            }
        }

        return richest;
    }
}
