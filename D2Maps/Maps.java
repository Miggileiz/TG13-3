import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

class Maps {

  public static void main(String[] args) {

    // Create a HashMap object called people
    Map<String, Integer> people = new TreeMap<>();
    //Bei treeMap wieder sortiert

    // Add keys and values (Name, Age) doppelter Value ghet, Name nicht
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    System.out.println(people);
  
    for(Map.Entry m : people.entrySet()){
          System.out.println(m);
    }

    for (Map.Entry st : people.entrySet()) {
      System.out.println("key: " + st.getKey() + " " + "value: " + st.getValue());
    }

    // in dem i sind alle
    for (String i : people.keySet()) {
      System.out.println("key: " + i + " value: " + people.get(i));
    }

    
  }

  

}