// src/test/java/CalculatorIntegrationTest.java
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorIntegrationTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAddAndStore() {
        int result = calculator.add(2, 2);
        assertTrue(calculator.isResultStored(result));
    }

    @Test
    void testSubtractAndStore() {
        int result = calculator.subtract(2, 2);
        assertTrue(calculator.isResultStored(result));
    }
}