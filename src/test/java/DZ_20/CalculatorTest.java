package DZ_20;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        int result = calculator.addition(10, 3);
        Assert.assertEquals(result, 13);
    }

    @Test
    public void testSubtraction() {
        int result = calculator.subtraction(27, 4);
        Assert.assertEquals(result, 23);
    }

    @Test
    public void testMultiplication() {
        int result = calculator.multiplication(6, 2);
        Assert.assertEquals(result, 12);
    }

    @Parameters({"a", "b", "expectedResult"})
    @Test
    public void testAdditionWithParameters(int a, int b, int expectedResult) {
        int result = calculator.addition(a, b);
        Assert.assertEquals(result, expectedResult);
    }

//    @DataProvider(name = "additionData")
//    public Object[][] additionData() {
//        return new Object[][]{
//                {16, 2, 18},
//                {15, 3, 18}
//        };
//    }

    @Test(dataProvider = "divisionData")
    public void testDivision(int a, int b, int expectedResult) {
        int result = calculator.division(a, b);
        Assert.assertEquals(result, expectedResult);
    }

    @DataProvider(name = "divisionData")
    public Object[][] divisionData() {
        return new Object[][]{
                {16, 2, 8},
                {15, 3, 5},
                {100, 2, 50}
        };
    }
}
