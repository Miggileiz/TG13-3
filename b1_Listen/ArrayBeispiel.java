package b1_Listen;

import java.util.Arrays;

public class ArrayBeispiel{

    public static void main(String[] args){

        String[] name = new String[3];

        name[0] = "M";
        name[1] = "S";
        name[2] = "Dort";

       System.out.println(Arrays.toString(name));
       for (String s : name) {
        System.out.println(s);
    }
 

   }

}