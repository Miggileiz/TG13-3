package ThreadAmpelHAMMERLSG;

public class Ampel implements Runnable {

    // Objektvariablen
    private String name;
    private int aktZustand;
    private int wait = 0;
    private Thread thread;

    // Konstanten
    public static final int ROT = 0;
    public static final int ROTGELB = 1;
    public static final int GRUEN = 2;
    public static final int GELB = 3;
    private String[] farben = {"ROT","ROTGELB","GRUEN","GELB"};

    // Konstruktor
    public Ampel(String name, int wait) {
        this.name = name;
        this.wait = wait;
        thread = new Thread(this);
        wechsleZustandZu(ROT);
    }
    
    // Getter und Setter
    public String getName() {
        return name;
    }

    public int getAktZustand() {
        return aktZustand;
    }

    // Threadverwaltung
    public void start() {
        thread.start();
    }

    public void warte() {
        try {
            Thread.sleep(wait);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

    // nebenläufiger Zustandswechsel der Ampel
    @Override
    public void run() {

        while (true) {

            switch (aktZustand) {
                case ROT:
                    warte();
                    wechsleZustandZu(ROTGELB);
                    break;

                case ROTGELB:
                    warte();
                    wechsleZustandZu(GRUEN);
                    break;

                case GELB:
                    warte();
                    wechsleZustandZu(ROT);;
                    break;

                case GRUEN:
                    warte();
                    wechsleZustandZu(GELB);
                    break;

                default:
                    break;
            }
        } // end while
    }

    private void wechsleZustandZu(int folgeZustand) {
        aktZustand = folgeZustand;
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return name + ": "+farben[aktZustand];
    }// end run()
}
