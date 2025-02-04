import java.util.*;

class KMeansStart {

    public static void main(String[] args) {
        System.out.println("TESTEN");

        // Testdaten initialisieren
        List<MeineDaten> daten = initTestDaten();

        // n zentroiden hinzufügen
        List<Centroid> centriods = initCentroids();

        // kmeans algorithmus anwenden um n
        centriods = kMeans(daten, centriods);

        // Ausgabe
        System.out.println(centriods);
    }

    private static List<Centroid> kMeans(List<MeineDaten> daten, List<Centroid> centriods) {
        // bestimme Abstände jedes Datenpunktes zu Centroiden
        Map<Double, Centroid> mapAbstaende = new TreeMap<>();

        for (MeineDaten d : daten) {
            for (Centroid centroid : centriods) {
                double abstand = getAbstand(d, centroid);
                mapAbstaende.put(abstand, centroid);
            }

            //Nimm den ersten Eintag aus der Map und füge den Datenpunkt dem Zentruid zu
            List<Centroid> c = new ArrayList<>(mapAbstaende.values());
            Centroid naechsterCentroid = c.get(0);
            naechsterCentroid.addData(d);
            mapAbstaende.clear();
        }

        return centriods;
    }

    private static double getAbstand(MeineDaten d, Centroid centroid) {
        // Abstand berechnen

        return (d.x - centroid.x) * (d.x-centroid.x) + (d.y - centroid.y) * (d.y-centroid.y);
    }

    private static List<MeineDaten> initTestDaten() {

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

    private static List<Centroid> initCentroids() {
        // Liste erzeugen
        List<Centroid> c = new ArrayList<>();
        // Zentruiden hinzufügen
        c.add(new Centroid(1, 4, "c1"));
        c.add(new Centroid(1, 3, "c2"));

        // Liste zurückgaben
        return c;
    }

}