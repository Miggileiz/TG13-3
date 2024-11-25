package MapsLernen;

import java.util.HashMap;
import java.util.Map;

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

        
    }
}
