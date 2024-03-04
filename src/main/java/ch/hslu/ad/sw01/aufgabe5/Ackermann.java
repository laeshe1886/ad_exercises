package ch.hslu.ad.sw01.aufgabe5;

import ch.hslu.ad.sw01.aufgabe2.Laufzeit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Ackermann {

    private static long calls = 0;
    private static final Logger LOG =
            LoggerFactory.getLogger(Ackermann.class);
    public static int ackermann(int n, int m) {
        calls++;
        if (n == 0)
            return m + 1;
        if (m == 0)
            return ackermann(n - 1, 1);
        return ackermann(n - 1, ackermann(n, m - 1));
    }

    public static void main(String[] args) {
        calls = 0;
        LOG.info("n:0, m:4, {}, {}", ackermann(0, 4), calls);
        calls = 0;
        LOG.info("n:1, m:2, {}, {}", ackermann(1, 2), calls);
        calls = 0;
        LOG.info("n:2, m:2, {}, {}", ackermann(2, 2), calls);

    }
}
