import java.util.HashMap;

public class lernen{

    public static void main(String[] args) {

Person p = new Person ("Müller");
Kfz wagen1 = new Kfz("D-U-3", 3456789);
Kfz wagen2 = new Kfz ("M-V-4", 4567890) ;

HashMap<Person, Kfz> halterMapsortiert = new HashMap<>();

halterMapsortiert.put(wagen1,p);
halterMapsortiert.put(wagen2,p);




    }
}