package principal;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * Create by Bruno Barbosa - 05/05/2019
 */
public class Cozinheiro extends Thread {

    private List<String> caldeirao = new LinkedList<>();
    int qtdPreparo = 0;

    public Cozinheiro() {
        insertComidas();
    }

    @Override
    public void run() {
        while (true) {
            try {
                preparaJantar();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private synchronized void preparaJantar() throws InterruptedException {
        while (!caldeirao.isEmpty()) {
            wait();
        }
        System.out.println("Cozinheiro acordou");
        insertComidas();
        qtdPreparo++;
        System.out.println("Cozinheiro Preparou o jantar");
        sleep(5000);
        notify();
    }

    public synchronized String servirJantar() {
        if (caldeirao.isEmpty()) {
            notify();
            return null;
        }
        return getComida();
    }

    private String getComida() {
        return caldeirao.remove(0);
    }

    private void insertComidas() {
        caldeirao.add("Comida1");
        caldeirao.add("Comida2");
        caldeirao.add("Comida3");
        caldeirao.add("Comida4");
        caldeirao.add("Comida5");
    }

    public int getQtdPreparo() {
        return qtdPreparo;
    }

    public List<String> getCaldeirao() {
        return caldeirao;
    }
}
