package br.com.questao2;

public class Consumidor extends Thread {

    private Deposito deposito;
    private int tempo;

    public Consumidor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override
    public void run() {

        for (int i = 1; i <= 20; i++) {

            deposito.retirar();

            System.out.println(getName()+ " retirou caixa. Total = "+ deposito.getNumItens()
            );

            try {
                Thread.sleep(tempo);
            }
            catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(getName() + " terminou.");
    }
}