package ch.hslu.ad.sw01.aufgabe4;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FibonacciTest {

    @Test
    public void testFiboRec1WithZero() {
        assertEquals(0, Fibonacci.fiboRec1(0));
    }

    @Test
    public void testFiboRec1WithOne() {
        assertEquals(1, Fibonacci.fiboRec1(1));
    }

    @Test
    public void testFiboRec1WithLargeNumber() {
        assertEquals(55, Fibonacci.fiboRec1(10));
    }

    @Test
    public void testFiboRec1With20() {
        assertEquals(6765, Fibonacci.fiboRec1(20));
    }
}