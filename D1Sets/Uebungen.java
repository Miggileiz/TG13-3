import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Uebungen {

public static void main(String[] args) {
    HashSet<String> mitarbeiterSet = new HashSet<>();
//Wenn sortiertes Set = treeset, bei Geschwindigkeit HashSet
    mitarbeiterSet.add("alex");
    mitarbeiterSet.add("Bernd");
    mitarbeiterSet.add("Arne");
    mitarbeiterSet.add("Arne");

    for(String ms : mitarbeiterSet)
        System.out.println(ms);


    System.out.println(mitarbeiterSet);

    System.out.println(mitarbeiterSet.size());

    int setGroesse = mitarbeiterSet.size();
    System.out.println(setGroesse);

    if(mitarbeiterSet.contains("Bernd")){
        System.out.println("Ist Bernd Teil des Teams? " + mitarbeiterSet.contains("Bernd"));
    }

    System.out.println("Ist Bernd Teil des Teams? " + mitarbeiterSet.contains("Bernd"));


Set<Integer> erstesSet = new HashSet<Integer>();
erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
erstesSet.add(9);
System.out.println(erstesSet);

Set<Integer> zweitesSet = new HashSet<Integer>();
zweitesSet.addAll(Arrays.asList(new Integer[] {1, 4, 3, 5, 6, 7, 5})); 
System.out.println(zweitesSet);

Set<Integer> union = new HashSet<>(erstesSet);
union.addAll(zweitesSet);
System.out.print("Beide Sets zusammengeführt ergibt:");
System.out.println(union);

Set<Integer> schnittmenge = new HashSet<>(erstesSet);
schnittmenge.retainAll(zweitesSet);
System.out.print("Die Schnittmenge beider Sets ist:");
System.out.println(schnittmenge);


Set<Integer> differenz = new HashSet<Integer>(zweitesSet);
differenz.removeAll(erstesSet);
System.out.print("Diese Elemente sind nicht im zweiten Set vorhanden:");
System.out.println(differenz);
for(Integer df : differenz)
System.out.println(df);
}
}