package b1_Listen;

import java.util.ArrayList;

public class ArrayListBsp{

    public static void main(String[] args) {
        ArrayList<Integer> messwerte = new ArrayList<>();

        // Objekte hinzufügen
        messwerte.add(4);
        messwerte.add(3);
        messwerte.add(5);


        System.out.println(messwerte);

        for(Integer mw : messwerte)
        System.out.println("Messwerte: "+ mw);
        
        Integer i1 = messwerte.get(2);
        System.out.println(i1);
        
        messwerte.remove(Integer.valueOf(3));
        System.out.println(messwerte);
        
        if (messwerte.contains(4)) {
            System.out.println("2 ist in der Liste");
        }

    }
}



