package br.com.questao3;

public class Produtor extends Thread {

    private Deposito deposito;
    private int tempo;

    public Produtor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 100; i++) {

            deposito.colocar();

            System.out.println(
                "Produtor colocou caixa. Total = "
                + deposito.getNumItens()
            );

            try {
                Thread.sleep(tempo);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Produtor terminou.");
    }
}