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

    mitarbeiterSet.remove("alex");
    System.out.println(mitarbeiterSet);

    int setGroesse = mitarbeiterSet.size();
    System.out.println(setGroesse);

    if(mitarbeiterSet.contains("Bernd")){
        System.out.println("Ist Bernd Teil des Teams? " + mitarbeiterSet.contains("Berns"));
    }


Set<Integer> erstesSet = new HashSet<Integer>();
erstesSet.addAll(Arrays.asList(new Integer[] {1, 2, 3, 5, 0 }));
erstesSet.add(9);
System.out.println(erstesSet);

Set<Integer> zweitesSet = new HashSet<Integer>();
zweitesSet.addAll(Arrays.asList(new Integer[] {1, 3, 4, 5, 6, 7, 5})); 
System.out.println(zweitesSet);

Set<Integer> union = new HashSet<>(erstesSet);
union.addAll(zweitesSet);
System.out.print("Beide Sets zusammengeführt ergibt:");
System.out.println(union);

Set<Integer> schnittmenge = new HashSet<>(erstesSet);
schnittmenge.retainAll(zweitesSet);
System.out.print("Die Schnittmenge beider Sets ist:");
System.out.println(schnittmenge);


Set<Integer> differenz = new HashSet<Integer>(erstesSet);
differenz.removeAll(zweitesSet);
System.out.print("Diese Elemente sind nicht im zweiten Set vorhanden:");
System.out.println(differenz);





}

}