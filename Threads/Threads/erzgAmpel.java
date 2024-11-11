package Threads;

public class erzgAmpel extends Thread {
    
    String name;
    int wait;
    int ende;

    public erzgAmpel(String name,int wait, int ende){
        this.name = name;
        this.wait = wait;
        this.ende = ende;
        }


        public void run(){
    for (int i = 0; i < ende; i++) {
        System.out.println(name + "" + i);
        try {
            Thread.sleep(wait);     
        } catch (Exception e) {
            // TODO: handle exception
        }
        }
        }
}
