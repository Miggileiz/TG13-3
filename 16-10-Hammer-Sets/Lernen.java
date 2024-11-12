import java.util.HashSet;
import java.util.TreeSet;

public class Lernen{
public static void main(String[] args) {
    
    HashSet<Integer> Liste = new HashSet<>();

    Liste.add(3);
    Liste.add(9);
    Liste.add(7);

    System.out.println(Liste.add(8));
    System.out.println(Liste.add(null));
    System.out.println(Liste);
    for(Integer L: Liste){
        System.out.println(L);
    }
    System.out.println(Liste.contains(3));
    System.out.println(Liste.remove(7));
    System.out.println(Liste);
    System.out.println(Liste.size());
    Liste.clear();
    System.out.println(Liste);
    System.out.println(Liste.isEmpty());


    TreeSet<String> tset = new TreeSet<>();

    tset.add("Baum");
    tset.add("Pferd");
    tset.add("Rauch");

    System.out.println(tset);
    System.out.println(tset.headSet("Pferd", false));





}
}

