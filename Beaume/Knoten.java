class Knoten {
    int wert;
    Knoten links, rechts;

    // Konstruktor für Knoten
    Knoten(int wert) {
        this.wert = wert;
        links = rechts = null;
    }
}

class EinfacherBinärerSuchbaum {
    Knoten wurzel;

    // Konstruktor für den Baum
    EinfacherBinärerSuchbaum() {
        wurzel = null;
    }

    // Einfügen eines neuen Werts in den Baum
    void einfuegen(int wert) {
        wurzel = einfuegenRekursiv(wurzel, wert);
    }

    Knoten einfuegenRekursiv(Knoten wurzel, int wert) {
        // 1. Wenn der aktuelle Knoten leer ist (d.h. wir haben einen Platz gefunden), erstelle einen neuen Knoten mit dem Wert
        if (wurzel == null) {
            return new Knoten(wert);
        }
    
        // 2. Wenn der Wert kleiner ist als der Wert des aktuellen Knotens, gehe nach links
        if (wert < wurzel.wert) {
            wurzel.links = einfuegenRekursiv(wurzel.links, wert);
        }
        // 3. Wenn der Wert größer ist als der Wert des aktuellen Knotens, gehe nach rechts
        else if (wert > wurzel.wert) {
            wurzel.rechts = einfuegenRekursiv(wurzel.rechts, wert);
        }
    
        // 4. Gib den aktuellen Knoten (die Wurzel) zurück, nachdem der neue Wert eingefügt wurde
        return wurzel;
    }
    
    // In-Order Traversierung (Links, Wurzel, Rechts)
    void inorderTraversierung() {
        inorderRekursiv(wurzel);
        System.out.println(); // neue Zeile nach der Traversierung
    }

    // Rekursive Methode für die In-Order Traversierung
    void inorderRekursiv(Knoten wurzel) {
        if (wurzel != null) {
            inorderRekursiv(wurzel.links);
            System.out.print(wurzel.wert + " ");
            inorderRekursiv(wurzel.rechts);
        }
    }

    public static void main(String[] args) {
        EinfacherBinärerSuchbaum baum = new EinfacherBinärerSuchbaum();

        // Einfügen von Knoten
        baum.einfuegen(50);
        baum.einfuegen(30);
        baum.einfuegen(70);
        baum.einfuegen(20);
        baum.einfuegen(40);
        baum.einfuegen(60);
        baum.einfuegen(80);

        // In-Order Traversierung
        System.out.println("In-Order Traversierung:");
        baum.inorderTraversierung();  
    }
}