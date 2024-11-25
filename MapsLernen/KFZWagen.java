package MapsLernen;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class KFZWagen {
    public static void main(String[] args) {
        Person p1 = new Person("Max", "Beier");
        Person p2 = new Person("Noah", "Asylant");
        Person p3 = new Person("Nigger", "Sanji");

        Wagen w1 = new Wagen("BMW",54545);
        Wagen w2 = new Wagen("Mercedes",10000);
        Wagen w3 = new Wagen("Tesla",1);

        Map<Person, Wagen> autoperon =new HashMap<>();

        autoperon.put(p3, w2);
        autoperon.put(p1, w3);
        autoperon.put(p2, w1);

        System.out.println(autoperon);

        for(Map.Entry ap : autoperon.entrySet()){
        System.out.println(ap);
        }


    System.out.println("--------Nur Person----------");
    Set<Person> p = new HashSet<>(autoperon.keySet());
    for (Person pe : p) {
        System.out.println(pe);
    }

    List<Person> pp = new ArrayList<>(autoperon.keySet());
    for (Person pd : pp) {
        System.out.println(pd);   
    }

    System.out.println("-----------Nur Wagen--------------");

    Set<Wagen> n = new HashSet<>(autoperon.values());
    for (Wagen dd : n) {
        System.out.println(dd);
    }

    List<Wagen> dpr = new ArrayList<>(autoperon.values());
    for (Wagen pd : dpr) {
        System.out.println(pd);   
    }

    System.out.println("Namen einer Marke zuweisen: ");
    Wagen w = autoperon.get(p1);
    System.out.println("Name: " + p1.getName() + " Wagen: " + w.getMarke() + " Kilos: " + w.getKilo());



   
        
    }
}
