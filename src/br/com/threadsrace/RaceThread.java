package br.com.threadsrace;

public class RaceThread {

    public static void main(String[] args) throws InterruptedException {
        RacerThread[] racers = new RacerThread[10];

        for (int i = 1; i <= 10; i++) {
            racers[i - 1] = new RacerThread(i);
        }

        // inicia os ímpares
        for (RacerThread racer : racers) {

            if (racer.getNumeroRacer() % 2 != 0) {
                racer.start();
            }
        }

        // espera os ímpares terminarem
        for (RacerThread racer : racers) {

            if (racer.getNumeroRacer() % 2 != 0) {
                racer.join();
            }

        }

        // inicia os pares
        for (RacerThread racer : racers) {

            if (racer.getNumeroRacer() % 2 == 0) {
                racer.start();
            }
        }
    }
}