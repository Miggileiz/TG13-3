package b1_Listen;

import java.util.ArrayList;
import java.util.Collections;

public class ArraySelber{

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("Noah");
        array.add("Pedo");
        array.add("Ahmed");

         System.out.println(array);

        for(String e: array);
        System.out.println("Namen: " + array);

        if (array.contains("Ahmed"))
        {
            System.out.println("Ahmed, Allahu akbar");

        }

        Collections.sort(array); //Sortiert Alphabetisch
        array.remove("Noah");
        System.out.println(array +" Attentat erfolgreich!!!");
    }

}