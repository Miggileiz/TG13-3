package AMpel;

public class AmpelAn {
    public static void main(String[] args) {
        
        System.out.println("Thread gestartet:");

        AmpelErzg a1 = new AmpelErzg("A1", 1000);
        AmpelErzg a2 = new AmpelErzg("A2", 2000);

        a1.start();
        a2.start();

}
}
