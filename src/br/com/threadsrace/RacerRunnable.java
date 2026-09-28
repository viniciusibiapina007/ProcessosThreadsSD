package br.com.threadsrace;

public class RacerRunnable implements Runnable {

    private int numeroRacer;

    public RacerRunnable(int numeroRacer) {
        this.numeroRacer = numeroRacer;
    }

    @Override
    public void run() {

        while (true) {

        System.out.println(
            "Racer " + numeroRacer + " - imprimindo");

        try {
            Thread.sleep(100);
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    }
}
