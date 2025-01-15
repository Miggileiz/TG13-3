import java.util.*;

public class KNN{
    public static void main(String[] args) {
        Dataobjekt[] testdaten = initTestdaten();
        int k = 5;
        Dataobjekt neu = new Dataobjekt(8,3);
        int klasseNeu = kNN(neu, testdaten, k);
        System.out.println("Die berechnete Klasse ist: " + klasseNeu);
    }

    public static Dataobjekt[] initTestdaten() {
        return new Dataobjekt[]{
            new Dataobjekt(1, 8, 0),
            new Dataobjekt(2, 7, 0),
            new Dataobjekt(1, 6, 0),
            new Dataobjekt(2, 5, 0),
            new Dataobjekt(5, 2, 1),
            new Dataobjekt(6, 1, 1),
            new Dataobjekt(7, 3, 1)
        };
    }

    public static int kNN(Dataobjekt neu, Dataobjekt[] testdaten, int k) {

        Map<Double, Dataobjekt> abstaende = new TreeMap<>();
        // Berechnung der Distanzen
        for (Dataobjekt o : testdaten) {
            double dist = getDistance(neu, o);
            abstaende.put(dist, o);
        }
        // K nächste Nachbarn auswählen
        List<Dataobjekt> knns = new ArrayList<>(abstaende.values());
        int klasse0 = 0;
        int klasse1 = 0;
        for (int i = 0; i < k && i < knns.size(); i++) {
            int klasseDesNachbarn = knns.get(i).klasse;
            if (klasseDesNachbarn == 0) {
                klasse0++;
            } else {
                klasse1++;
            }
        }
        // Bestimmen der Klasse
        return (klasse0 > klasse1) ? 0 : 1;
    }
    public static double getDistance(Dataobjekt a, Dataobjekt b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }
} 


/* 
   public static int KNN(Dataobj neu, List<Dataobj> testdaten,int k){
    return 0;
   }

   private static List<Dataobj> initTestdaten(){
    List<Dataobj> liste = new ArrayList<>();
    //liste.add(new Dataobj());

    return liste;
    
   }

 */
