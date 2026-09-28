package br.com.questao3;

public class Consumidor extends Thread {

    private Deposito deposito;
    private int tempo;

    public Consumidor(Deposito deposito, int tempo) {
        this.deposito = deposito;
        this.tempo = tempo;
    }

    @Override

    public void run() {

        int caixasConsumidas = 0;

        while (caixasConsumidas < 20) {

            if (deposito.retirar()) {

                caixasConsumidas++;

                System.out.println(
                    getName()
                    + " retirou caixa. Total = "
                    + deposito.getNumItens()
                );

            } else {

                System.out.println(
                    getName()
                    + " encontrou deposito vazio."
                );

                try {
                    Thread.sleep(200);
                }
                catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

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