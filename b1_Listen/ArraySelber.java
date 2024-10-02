package b1_Listen;

import java.util.ArrayList;

public class ArraySelber{

    public static void main(String[] args) {
        ArrayList<String> array = new ArrayList<>();

        array.add("Noah");
        array.add("Pedo");
        array.add("Ahmed");

         System.out.println(array);

        for(String me: array);
        System.out.println("Namen: " + array);

        if (array.contains("Ahmed"))
        {
            System.out.println("Ahmed Allahu akbar");

        }

        array.remove("Noah");
        System.out.println(array);
    }

}