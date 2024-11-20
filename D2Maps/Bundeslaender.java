import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Bundeslaender {

    public static void main(String[] args) {
        HashMap<String, String> bund = new HashMap<>();

        bund.put("Baden-Württemberg", "Stuttgart");
        bund.put("Bayern", "München");
        bund.put("Berlin", "Berlin");
        bund.put("Saarland", "Saarbrücken");
        bund.put("Sachsen", "Dresden");

        System.out.println("Normal:_______________");
        System.out.println(bund);
        System.out.println("entry:_______________");

         for (Map.Entry m : bund.entrySet()) {
            System.out.println(m.getKey() + " = " + m.getValue());
        }



        //Keys Bundesländer
        List<String> laender =  new ArrayList<>(bund.keySet());
        for(String l : laender)
        {
            System.out.println("Die Bundesländer lauten: " + l);
        }

        //Keys Bundesländer
        List<String> hpdst =  new ArrayList<>(bund.values());
        for(String h : hpdst)
        {
            System.out.println("Die Hauptstädete lauten: " + h);
        }

        String hsBW = bund.get("Stuttgart");
        System.out.println(hsBW);

        String blST = bund.get("Baden-Württemberg");
        System.out.println(blST);

        
    }


}
