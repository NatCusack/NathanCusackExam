package ie.gmit;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.*;
public class CalculatorTest {
    Calculator myCalculator;
    @BeforeEach
    void init()
    {
        myCalculator = new Calculator();
    }
    @Test
    void testAdd()
    {
        assertEquals(6,myCalculator.addition(4,2));
    }
    @Test
    void testSubtract()
    {
        assertEquals(2,myCalculator.subtraction(4,2));
    }
    @Test
    void testMultiply()
    {
        assertEquals(8,myCalculator.multiply(4,2));
    }
    @Test
    void testDivide()
    {
        assertEquals(2,myCalculator.divide(4,2));
    }
    @Test
    @DisplayName("Division by zero should throw an ArithmeticException")
    void testDivideByZero()
    {
        assertThrows(ArithmeticException.class, ()-> {myCalculator.divide(1,0);});
    }
