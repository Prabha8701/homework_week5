package homework;
/**
 * Create a HashMap object called people that will store String keys and Integer
 *   values: And use for each loop to iterate the value from Map.
 */

import java.util.Iterator;

import java.util.Map;

public class HashMap {
    public static void hashMap(){
        Map<String, Integer> people = new java.util.HashMap<>();
        people.put("London", 01);
        people.put("Washington", 02);
        people.put("Paris", 03);
        people.put("Delhi", 04);
        people.put("Zurich", 05);

        Iterator<Integer> iterator =people.values().iterator();
        while(iterator.hasNext()){
            Integer value =iterator.next();
            System.out.println(value);

        }
    }

    public static void main(String[] args) {
        hashMap();
    }
}
