package ch.hslu.ad.sw01.aufgabe4;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    public static Map<Integer, Integer> memoFibo = new HashMap<Integer, Integer>();

    /**
     * Berechnet die Fibonacci Zahl rekursiv
     *
     * @param n Angabe welche Fibonacci Zahl
     * @return die n-te Fibonacci Zahl
     */
    public static int fiboRec1(final int n) {
        if (n <= 1) { //Rekursionsbasis
            return n;
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }

    /**
     * Berechnet die Fibonacci Zahl rekursiv mit einem Zwischenspeicher
     *
     * @param n Angabe welche Fibonacci Zahl
     * @return die n-te Fibonacci Zahl
     */
    public static int fiboRec2(final int n) {
        if (n <= 1) {
            return n;
        }

        if (memoFibo.containsKey(n)) {
            return memoFibo.get(n);
        }

        int fiboValue = fiboRec2(n - 1) + fiboRec2(n - 2);
        memoFibo.put(n, fiboValue);
        return fiboValue;
    }

    /**
     * Berechnet die Fibonacci Zahl iterativ
     *
     * @param n Angabe welche Fibonacci Zahl
     * @return die n-te Fibonacci Zahl
     */
    public static int fiboIter(final int n) {
        if (n <= 1) {
            return n;
        }

        int previous = 0;
        int current = 1;
        int fiboValue;

        for (int i = 0; i < n; i++) {
            fiboValue = previous;
            previous = current;
            current = previous + fiboValue;
        }
        return previous;
    }
}
