import java.util.HashMap;
import java.util.TreeMap;

class Maps {

  public static void main(String[] args) {

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<>();
    //Bei treeMap wieder sortiert

    // Add keys and values (Name, Age) doppelter Value ghet, Name nicht
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    System.out.println(people);
    


    // in dem i sind alle
    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }
  }

}