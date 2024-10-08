package b1_Listen;

import java.util.LinkedList;

public class Linkedlist {
    
    public static void main(String[] args) {
    
    LinkedList<String> programmiersprachen = new LinkedList<>();


    programmiersprachen.add("Java");
    programmiersprachen.add("C++");
    programmiersprachen.add("C#");

    System.out.println(programmiersprachen);

    for (String Str : programmiersprachen) {
      System.out.println("Sprachen: " + Str);     
    }

    String i2 = programmiersprachen.get(2);
    System.out.println(i2);



    programmiersprachen.remove(String.valueOf("Java"));
    System.out.println(programmiersprachen);
    //suche nach dem befehl, wie man ein wort als erstes hinzufügt und das letzt hinzufüggt und löscht




      }


}
