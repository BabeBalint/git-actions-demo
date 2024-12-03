import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculatorUnitTest {
    private final Calculator calculator = new Calculator();

    @Test
    void testAdd() {
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    void testSubtract() {
        assertEquals(0, calculator.subtract(2, 2));
    }

    @Test
    void testMultiply() {
        assertEquals(4, calculator.multiply(2, 2));
    }
}
