import FasiGenerazione.*;

public class Test extends Thread {

    public static void main(String[] args) {

        new Test();
    }


    public Test(){

        new Fase0();
        System.out.println("Creazione popolazionw");

        Thread t = new Thread(this, "Primo Thread");
        //t.run();
    }

    @Override
    public void run() {
        try{
            while(true) {
                Thread.sleep(100);

                System.out.println("Interazione tra maschi e femmine");
                new Fase1();
                Thread.sleep(100);

                System.out.println("Interazione tra maschi e tra femmine");
                new Fase2();
                Thread.sleep(100);

                System.out.println("Crescita figli");
                new Fase3();
                Thread.sleep(100);
            }

        }catch (Exception e){
            System.out.println("Thread ha lanciato un'eccezione");
        }

    }
}
