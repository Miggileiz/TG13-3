package SetsKA;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Befragung {
    public static void main(String[] args) {
    Set<String> singen = new HashSet<>();
    singen.addAll(Arrays.asList(new String[] {"BMW", "Mercedes", "Audi", "Tesla", "Kia", "VW"}));
    System.out.println(singen);

    Set<String> konstanz = new HashSet<>();
    konstanz.addAll(Arrays.asList(new String[] {"BMW", "Mercedes", "Audi", "VW", "Ford", "Hyundai"}));
    System.out.println(konstanz);


    System.out.println("Makren in beiden Städten: ");
    Set<String> schnittmenge = new HashSet<>(singen);
    schnittmenge.retainAll(konstanz);
    for (String str : schnittmenge) {
        System.out.println(str);
    }

    System.out.println("Automarken nur in Singen: ");
    Set<String> differenz = new HashSet<>(singen);
    differenz.removeAll(konstanz);
    for (String str : differenz) {
        System.out.println(str);
    }

    System.out.println("Alle Marken: ");
    Set<String> union = new HashSet<>(singen);
    union.addAll(konstanz);
    for (String str : union) {
        System.out.println(str);
    }


    

}
}
