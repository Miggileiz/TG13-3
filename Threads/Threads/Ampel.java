package Threads;

public class Ampel {
    public static void main(String[] args) {
        
        erzgAmpel a = new erzgAmpel("a", 100, 5);
        erzgAmpel b = new erzgAmpel("b", 200, 6);
        erzgAmpel c = new erzgAmpel("c", 400, 7);

        a.start();
        b.start();
        c.start();
    }
}
