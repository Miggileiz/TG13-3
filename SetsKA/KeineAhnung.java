package SetsKA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class KeineAhnung {
    public static void main(String[] args) {
    String strAplphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    char[] alphabetArray = strAplphabet.toCharArray();

    List<Character> alphabetList = new LinkedList<>();
    for (Character buchstabe : alphabetArray) {
        alphabetList.add(buchstabe);
    }

    
        // 4. HashMap<Integer, Character> für Ziffern erstellen
        HashMap<Integer, Character> ziffern = new HashMap<>();
        for (int i = 0; i <= 9; i++) {
            char c = (char) ('0' + i); // Character der Ziffer berechnen
            ziffern.put(i, c);
        }

        // 5. Liste der Ziffern erstellen
        List<Character> ziffernList = new ArrayList<>(ziffern.values());

        // 6. Alphabet und Ziffern in einer neuen Liste zusammenführen
        List<Character> alphabetMitZiffern = new ArrayList<>(alphabetList);
        alphabetMitZiffern.addAll(ziffernList);

        // 7. Ausgabe aller Listen
        System.out.println("Alphabet-Liste: " + alphabetList);
        System.out.println("Ziffern-HashMap: " + ziffern);
        System.out.println("Alphabet mit Ziffern: " + alphabetMitZiffern);



    }
}
