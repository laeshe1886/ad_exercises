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

    @Test
    public void testFiboRec2WithZero() {
        assertEquals(0, Fibonacci.fiboRec2(0));
    }

    @Test
    public void testFiboRec2WithOne() {
        assertEquals(1, Fibonacci.fiboRec2(1));
    }

    @Test
    public void testFiboRec2WithLargeNumber() {
        assertEquals(55, Fibonacci.fiboRec2(10));
    }

    @Test
    public void testFiboRec2With20() {
        assertEquals(6765, Fibonacci.fiboRec2(20));
    }

    @Test
    public void testFiboIterWithZero() {
        assertEquals(0, Fibonacci.fiboIter(0));
    }

    @Test
    public void testFiboIterWithOne() {
        assertEquals(1, Fibonacci.fiboRec1(1));
    }

    @Test
    public void testFiboIterWithLargeNumber() {
        assertEquals(55, Fibonacci.fiboRec1(10));
    }

    @Test
    public void testFiboIterWith20() {
        assertEquals(6765, Fibonacci.fiboRec1(20));
    }
}