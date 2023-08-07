package DZ_19;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class CalculatorTest {

    private Calculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testAddition() {
        int a = 2;
        int b = 4;
        int result = calculator.addition(a, b);
        Assertions.assertEquals(6, result);
    }

    @Test
    public void testSubtraction() {
        int a = 12;
        int b = 8;
        int result = calculator.subtraction(a, b);
        Assertions.assertEquals(4, result);
    }

    @Test
    public void testMultiplication() {
        int a = 12;
        int b = 8;
        int result = calculator.multiplication(a, b);
        Assertions.assertEquals(96, result);
    }

    @Test
    public void testDivision() {
        int a = 12;
        int b = 8;
        int result = calculator.division(a, b);
        Assertions.assertEquals(4, result);
    }

    @ParameterizedTest
    @MethodSource("getValues")
    public void testDivisionWithParametrs(int a, int b, int expectedResult) {
        int actualResult = calculator.division(a, b);
        Assertions.assertEquals(expectedResult, actualResult);
    }

    public static Stream<Arguments> getValues() {
        return Stream.of(Arguments.of(20, 5, 4));
    }

}
