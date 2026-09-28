package br.com.threadsrace;
public class RaceRunnable {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            RacerRunnable racer = new RacerRunnable(i);
            Thread thread = new Thread(racer);
            thread.start();
        }
    }
}