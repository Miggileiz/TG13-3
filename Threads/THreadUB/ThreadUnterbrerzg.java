package THreadUB;

public class ThreadUnterbrerzg implements Runnable{

    String name;
    int aktZustand;
    int wait;
    Thread t;

    public static final int ROT = 0;
    public static final int ROTGELB = 1;
    public static final int GELB = 2;
    public static final int GRUEN = 3;

    public ThreadUnterbrerzg(String name, int wait) {
        this.name = name;
        this.aktZustand = 0;
        this.wait = wait;
        this.t = new Thread(this);
    }

    public void start(){
        t.start();
    }

    public void stop(){
        t.interrupt();
    }



    @Override
    public void run() {
        while(!t.isInterrupted())
        {
            switch(aktZustand){
            case 0:
                System.out.println(name + "Rot");
                aktZustand = 1;
            break;

            case 1:
            System.out.println(name + "RotGelb");
            aktZustand = 2;
            break;

            case 2:
            System.out.println(name + "Gelb");
            aktZustand = 3;

            break;

            case 3:
            System.out.println(name + "Gruen");
            aktZustand = 0;
            break;
            }

            try {
                Thread.sleep(wait);
            } catch (Exception e) {
                stop();   
                e.printStackTrace();       
            }
        }
    }
}  




