package KNNHölle;

public class Schueler {
    
    double hausaufgabenQuote;
    double fehlzeiten;
    int label;
    public Schueler(double hausaufgabenQuote, double fehlzeiten, int label) {
        this.hausaufgabenQuote = hausaufgabenQuote;
        this.fehlzeiten = fehlzeiten;
        this.label = label;
    }
    @Override
    public String toString() {
        return "(Hausaufgabenquote: " + hausaufgabenQuote + ", Fehlzeiten: " + fehlzeiten + ", Label: " + label + ")";
    }
 }

