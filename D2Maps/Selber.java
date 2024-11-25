import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Selber {
    public static void main(String[] args) {

        Map<String, Integer> keinDeutscherPass = new TreeMap<>();
        
        keinDeutscherPass.put("Teo",99);
        keinDeutscherPass.put("Noah",88);
        keinDeutscherPass.put("Masuma",33);
        keinDeutscherPass.put("Sarah",40);
        keinDeutscherPass.put("LingLing",55);

        System.out.println(keinDeutscherPass);

        for (Map.Entry m: keinDeutscherPass.entrySet())
        {
            System.out.println(m.getKey()+ " " + m.getValue());
            
        }
        //----------------------------------------------------------
        for (String i : keinDeutscherPass.keySet()) {
            System.out.println( i +  " " + keinDeutscherPass.get(i));
          }
        
          keinDeutscherPass.remove("LingLing");
          System.out.println(keinDeutscherPass);

    }
}
