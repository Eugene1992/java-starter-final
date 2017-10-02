import cw07.Human;
import cw07.HumanUtil;
import org.junit.Assert;
import org.junit.Test;

public class ITest {

    @Test
    public void test() {
        HumanUtil humanUtil = new HumanUtil();

        Human[] humans = {
                new Human("Alex", 22, 500),
                new Human("Anna", 26, 700),
                new Human("Sem", 21, 1500)
        };

        Human richestEmployee = humanUtil.getRichestEmployee(humans);

        Assert.assertEquals(1500, richestEmployee.salary);
    }
}
