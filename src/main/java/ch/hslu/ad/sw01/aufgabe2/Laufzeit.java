package ch.hslu.ad.sw01.aufgabe2;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Laufzeit {

    private static int callCount = 0;
    private static final Logger LOG =
            LoggerFactory.getLogger(Laufzeit.class);


    public static void task(final int n) {
        task1();
        task1();
        task1();
        task1(); // T ~ 4
        for (int i = 0; i < n; i++) { // äussere Schleife: n-mal
            task2();
            task2();
            task2(); // T ~ n · 3
            for (int j = 0; j < n; j++) { // innerer Schleife: n-mal
                task3(); task3(); // T ~ n · n· 2
            }
        }
        LOG.info("{} function calls were made for n = {}", callCount, n);
    }

    private static void task1(){
        sleepForTime(5);
        addCallCount();
    }
    private static void task2(){
        sleepForTime(5);
        addCallCount();
    }
    private static void task3(){
        sleepForTime(5);
        addCallCount();
    }

    private static void sleepForTime(int milliseconds) {
        try {
            Thread.sleep(milliseconds);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    private static void addCallCount() {
        callCount++;
    }

    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        Laufzeit.task(100);
        long endTime = System.currentTimeMillis();
        long totalTime = endTime - startTime;
        LOG.info("The total time is {}", totalTime);
    }
}
