package ThreadAmpelHAMMERLSG;

public class ErzeugeAmpel {
    public static void main(String[] args) {
        Ampel a1 = new Ampel("A", 1000);
        Ampel a2 = new Ampel("B", 3000);
        a1.start();
        a2.start();
    } 
}
