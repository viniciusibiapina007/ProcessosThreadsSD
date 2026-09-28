package br.com.threadsrace;

public class RacerThread extends Thread {

    private int numeroRacer;

    public RacerThread(int numeroRacer) {
        this.numeroRacer = numeroRacer;
    }

    public int getNumeroRacer() {
        return numeroRacer;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 1000; i++) {
            System.out.println("Racer " + numeroRacer +" - impressão " + i);

        }

    }
}
