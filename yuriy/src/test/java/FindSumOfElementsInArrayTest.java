import hw5_Arrays.FindSumOfElementsInArray;
import org.junit.Assert;
import org.junit.Test;

public class FindSumOfElementsInArrayTest {

    @Test
    public void summOfAllElementsBiggerThen100500Test() {
        FindSumOfElementsInArray findSumOfElementsInArray = new FindSumOfElementsInArray();
        System.out.println("Test");
        Assert.assertFalse(findSumOfElementsInArray.calcSummOfAllElements() >= 100500);
    }
}
