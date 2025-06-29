package easyforstartup.day1.test;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import easyforstartup.day1.easy.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class OperationTest {

    
    @Test
    public void testAdd() {
        assertEquals(5, ArithmeticOperations.add(2, 3));
        assertEquals(0, ArithmeticOperations.add(-2, 2));
        assertEquals(-5, ArithmeticOperations.add(-2, -3));
    }

    @Test
    public void testSubtract() {
        assertEquals(-1, ArithmeticOperations.subtract(2, 3));
        assertEquals(-4, ArithmeticOperations.subtract(-2, 2));
        assertEquals(1, ArithmeticOperations.subtract(-2, -3));
    }

    @Test
    public void testMultiply() {
        assertEquals(6, ArithmeticOperations.multiply(2, 3));
        assertEquals(-4, ArithmeticOperations.multiply(-2, 2));
        assertEquals(6, ArithmeticOperations.multiply(-2, -3));
        assertEquals(0, ArithmeticOperations.multiply(0, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(2, ArithmeticOperations.divide(6, 3));
        assertEquals(-1, ArithmeticOperations.divide(-2, 2));
        assertEquals(2, ArithmeticOperations.divide(-6, -3));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(IllegalArgumentException.class, () -> ArithmeticOperations.divide(5, 0));
    }
}