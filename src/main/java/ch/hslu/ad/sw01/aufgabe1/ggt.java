package ch.hslu.ad.sw01.aufgabe1;

public class ggt {

    public static int ggtIterativ1(int a, int b) {
        int counter = 0;
        while (a != b) {
            if (a > b) {
                a = a - b;
                System.out.println("a is = " + a);
            } else {
                b = b - a;
                System.out.println("b is = " + b);
            }
            counter++;
            System.out.println("Counter is  = " +  counter);
        }
        return a;
    }

    public static int ggtIterativ2(int a, int b) {
        int counter = 0;
        while ((a != 0) && (b != 0)) {
            if (a > b) {
                a = a % b;
                System.out.println("a is = " + a);
            } else {
                b = b % a;
                System.out.println("b is = " + b);
            }
            counter++;
            System.out.println("Counter is  = " +  counter);
        }
        return (a + b); // Entweder a oder b ist 0!
    }

    public static int ggtRekursiv(final int a, final int b) {
        System.out.println("getRekursiv("+a+","+b+")");
        if (a > b) {
            return ggtRekursiv(a - b, b);
        } else {
            if (a < b) {
                return ggtRekursiv(a, b - a);
            } else {
                return a;
            }
        }
    }

    public static void main(String[] args){
        System.out.println(ggt.ggtIterativ1(16, 68));
        //System.out.println(ggt.ggtIterativ2(16, 68));
        //System.out.println(ggt.ggtRekursiv(16, 68));
    }
}
