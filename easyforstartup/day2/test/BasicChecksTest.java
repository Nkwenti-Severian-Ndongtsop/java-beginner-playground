package easyforstartup.day2.test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import easyforstartup.day2.easy.BasicChecks;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class BasicChecksTest {
    
    @ParameterizedTest
    @ValueSource(ints = {0, 2, 4, 6, 8, 10})
    public void EvenNumberCheck(int number) {
        assertTrue(BasicChecks.isEven(number));
        assertFalse(BasicChecks.isOdd(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9, 11})
    public void OddNumberCheck(int number) {
        assertTrue(BasicChecks.isOdd(number));
        assertFalse(BasicChecks.isEven(number));
    }
}
