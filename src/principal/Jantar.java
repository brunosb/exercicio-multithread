package principal;

/**
 * Create by Bruno Barbosa - 05/05/2019
 */
public class Jantar {

    public static void main(String[] args) {
        Cozinheiro cozinheiro = new Cozinheiro();
        Canibal canibal1 = new Canibal(cozinheiro,"canibal 1");
        Canibal canibal2 = new Canibal(cozinheiro,"canibal 2");
        Canibal canibal3 = new Canibal(cozinheiro,"canibal 3");

        cozinheiro.start();
        canibal1.start();
        canibal2.start();
        canibal3.start();

        long inicio = System.currentTimeMillis();
        while((System.currentTimeMillis()-inicio) <= 120000){}

        canibal1.stop();
        canibal2.stop();
        canibal3.stop();
        cozinheiro.stop();

        System.out.println("\nCozinheiro preparou: "+cozinheiro.getQtdPreparo()+" vezes");
        System.out.printf("Canibal 1 se serviu %d, comeu %d e dormiu %d\n",canibal1.getQtdServiu(),canibal1.getQtdComeu(),canibal1.getQtdDormiu());
        System.out.printf("Canibal 2 se serviu %d, comeu %d e dormiu %d\n",canibal2.getQtdServiu(),canibal2.getQtdComeu(),canibal2.getQtdDormiu());
        System.out.printf("Canibal 3 se serviu %d, comeu %d e dormiu %d\n",canibal3.getQtdServiu(),canibal3.getQtdComeu(),canibal3.getQtdDormiu());

    }
}
