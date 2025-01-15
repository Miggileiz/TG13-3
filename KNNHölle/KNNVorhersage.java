package KNNHölle;
import java.util.*;

public class KNNVorhersage {
    
    public static void main(String[] args) {
        // Liste der Schüler*innen-Daten (X: Hausaufgabenquote, Y: Fehlzeiten, Label)
        List<Schueler> daten = new ArrayList<>();
        daten.add(new Schueler(0.8, 5, 0)); // Beispiel: Kreis
        daten.add(new Schueler(0.6, 10, 1)); // Beispiel: Dreieck
        daten.add(new Schueler(0.4, 15, 2)); // Beispiel: Kreuz
        // Weitere Datenpunkte hier hinzufügen
        // Neues zu klassifizierendes Objekt
        Schueler neu = new Schueler(0.7, 8, -1); // Hausaufgabenquote: 0.7, Fehlzeiten: 8
        // Parameter für k
        int k = 3;
        // KNN ausführen
        int vorhergesagteKlasse = kNN(neu, daten, k);
        // Ausgabe
        System.out.println("Neue Datenpunkt: " + neu);
        System.out.println("Vorhergesagte Klasse: " + vorhergesagteKlasse);
    }
    public static int kNN(Schueler neu, List<Schueler> daten, int k) {
        // Berechnung der Distanzen
        Map<Double, Integer> abstaende = new TreeMap<>();
        for (Schueler student : daten) {
            double dist = getDistance(neu, student);
            abstaende.put(dist, student.label);
        }
        // K nächsten Nachbarn auswerten
        int[] klassenZaehler = new int[3]; // Labels: 0, 1, 2
        int i = 0;
        for (int label : abstaende.values()) {
            if (i >= k) break;
            klassenZaehler[label]++;
            i++;
        }
        // Klasse mit den meisten Stimmen zurückgeben
        int maxIndex = 0;
        for (int j = 1; j < klassenZaehler.length; j++) {
            if (klassenZaehler[j] > klassenZaehler[maxIndex]) {
                maxIndex = j;
            }
        }
        return maxIndex;
    }
    public static double getDistance(Schueler a, Schueler b) {
        return Math.sqrt(Math.pow(a.hausaufgabenQuote - b.hausaufgabenQuote, 2) +
                         Math.pow(a.fehlzeiten - b.fehlzeiten, 2));
    }
 }