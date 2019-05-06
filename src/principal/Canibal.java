package principal;

/**
 * Create by Bruno Barbosa - 05/05/2019
 */
public class Canibal extends Thread {

    private String nome;
    private Cozinheiro cozinheiro;
    private int qtdServiu = 0;
    private int qtdComeu = 0;
    private int qtdDormiu = 0;

    public Canibal(Cozinheiro cozinheiro, String nome) {
        this.cozinheiro = cozinheiro;
        this.nome = nome;
    }

    @Override
    public void run() {
        while (true) {
            try {
                String comida = cozinheiro.servirJantar();
                sleep(1000);
                if (comida != null) {
                    System.out.println("Canibal: " + nome + " se serviu");
                    qtdServiu++;
                    comer();
                    qtdComeu++;
                    sleep(3000);
                } else {
                    qtdDormiu++;
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void comer() {
        System.out.println("Canibal: " + nome + " comeu");
    }

    public int getQtdServiu() {
        return qtdServiu;
    }

    public int getQtdComeu() {
        return qtdComeu;
    }

    public int getQtdDormiu() {
        return qtdDormiu;
    }
}
