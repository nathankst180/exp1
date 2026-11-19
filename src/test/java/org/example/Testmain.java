package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Testmain {

    Main calc = new Main();

    @Test
    public void testAddition() {
        assertEquals(15, calc.add(10, 5));
    }

    @Test
    public void testSubtraction() {
        assertEquals(5, calc.subtract(10, 5));
    }

    @Test
    public void testMultiplication() {
        assertEquals(50, calc.multiply(10, 5));
    }

    @Test
    public void testDivision() {
        assertEquals(2, calc.divide(10, 5));
    }

    @Test
    public void testDivideByZero() {
        assertThrows(ArithmeticException.class,
                () -> calc.divide(10, 0));
    }
}