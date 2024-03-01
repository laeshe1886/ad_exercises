package ch.hslu.ad.sw01.aufgabe4;

public class Fibonacci {

    public static int fiboRec1(int n) {
        if (n <= 1) { //Rekursionsbasis
            return n;
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }

    public static int fiboRec2(int n) {
        if (n <= 1) { //Rekursionsbasis
            return n;
        } else {
            return fiboRec1(n - 1) + fiboRec1(n - 2); //Rekursionsvorschrift
        }
    }
}
