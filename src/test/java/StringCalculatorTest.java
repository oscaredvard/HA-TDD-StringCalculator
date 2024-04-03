import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class StringCalculatorTest {

    private StringCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new StringCalculator();
    }

    @Test
    public void testEmptyStringReturnsZero() {
        Assertions.assertEquals(0, calculator.add(""));
    }

    @Test
    public void testOneNumberInString() {
       Assertions.assertEquals(1, calculator.add("//,\n1"));
    }

    @Test
    public void testTwoNumbersInString() {
        Assertions.assertEquals(3, calculator.add("//,\n1,2"));
    }

    @Test
    public void testArbitraryAmountOfNumbersInString() {
        Assertions.assertEquals(15, calculator.add("//,\n1,2,3,4,5"));
    }

   @Test
    public void testLinesBetweenNumbers() {
        Assertions.assertEquals(6, calculator.add("//,\n1\n2,3"));
    }

    @Test
    public void testCustomDelimiter() {
        Assertions.assertEquals(3,calculator.add("//;\n1;2"));
    }
}