package ThreadAmpelHAMMERLSG;

public class ErzeugeAmpel {
    public static void main(String[] args) {
        Ampel a1 = new Ampel("A", 2000);
        Ampel a2 = new Ampel("B", 2000);
        a1.start();
        a2.start();
    } 
}
