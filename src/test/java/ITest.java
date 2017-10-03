import cw07.Human;
import cw07.HumanUtil;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ITest {

    private Human[] humans;
    private HumanUtil humanUtil;

    @Before
    public void setUp() {
        humanUtil = new HumanUtil();
        humans = new Human[]{
                new Human("Alex", 22, 500),
                new Human("Anna", 26, 700),
                new Human("Sem", 21, 1500)
        };
    }

    @Test
    public void test() {
        Human richestEmployee = humanUtil.getRichestEmployee(humans);

        Assert.assertEquals(1500, richestEmployee.salary);
    }

    @Test
    public void test2() {

    }
}
