package b1_listenHammer;

import java.util.LinkedList;

class EinkaufsListe {
public static void main(String[] args) {

    // LinkedList erzeugen
LinkedList<String> einkaufliste = new LinkedList<>(); 

// Werte hinzufügen
einkaufliste.add("Milch");
einkaufliste.add("Bier");
einkaufliste.add("Butter");
einkaufliste.add("Brot");
einkaufliste.add("Wein");
einkaufliste.add("Chips");

// Ausgabe
System.out.println("Ausgabe mit Syso");
System.out.println(einkaufliste);
System.out.println("---------------------");

// entfernen von Objekten
System.out.println("Entferne Element mit index 2 ");
einkaufliste.remove(2);
System.out.println(einkaufliste);
System.out.println("---------------------");

// Iterieren über Liste
System.out.println("Iteriere ueber ganze Liste");
for (String s : einkaufliste) {
    System.out.println(s);
}
System.out.println("---------------------");

// Liste als Queue 
System.out.println("Stapeloperationen ");
einkaufliste.removeFirst(); //Milch
System.out.println(einkaufliste);
einkaufliste.removeLast(); //Chips
System.out.println(einkaufliste);
einkaufliste.addFirst("Wasser");
einkaufliste.addLast("Salami");

// Stapelfunktionen
System.out.println("Stapelfkt");
System.out.println(einkaufliste);
System.out.println(einkaufliste.pop());
System.out.println("-------------");
System.out.println(einkaufliste);
einkaufliste.pollLast();
System.out.println(einkaufliste);
}
}