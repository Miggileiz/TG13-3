import java.util.*;

class KMeansStart {

    public static void main(String[] args) {
        System.out.println("TESTEN");
    }

    // Testdaten initialisieren
    List<MeineDaten> daten = initTestDaten();

    // n zentroiden hinzufügen
    List<Centroid> centriods = initCentroids();

    private List<MeineDaten> initTestDaten() {

        // Liste erzeugen
        List<MeineDaten> d = new ArrayList<>();

        // Datenpunkte hinzufügen
        d.add(new MeineDaten(1, 9));
        d.add(new MeineDaten(2, 7));
        d.add(new MeineDaten(1, 6));
        d.add(new MeineDaten(4, 8));
        d.add(new MeineDaten(3, 10));
        d.add(new MeineDaten(10, 2));
        d.add(new MeineDaten(8, 1));
        d.add(new MeineDaten(7, 4));
        d.add(new MeineDaten(8, 3));
        d.add(new MeineDaten(9, 2));

        // Liste zurückgaben
        return d;
    }



    private List<Centroid> initCentroids() {
        // Liste erzeugen
        List<Centroid> c = new ArrayList<>();
        // Datenpunkte hinzufügen
        c.add
        


        // Liste zurückgaben
        return c;
    }

}