package app;

import java.util.HashMap;
import java.util.Map;

public class PlayMap {
    public static void main(String[] args) {
        
        Map<Integer, Integer> integerMap = new HashMap<>();
        integerMap.put(1, 10);
        integerMap.put(2, 20);
        integerMap.put(3, 30);
        integerMap.put(4, 40);
        integerMap.put(5, 50);

        Map<Integer, String> stringMap = new HashMap<>();
        stringMap.put(1, "One");
        stringMap.put(2, "Two");
        stringMap.put(3, "Three");
        stringMap.put(4, "Four");
        stringMap.put(5, "Five");

        System.out.println("Size of Integer Map: " + integerMap.size());
        System.out.println("Is Integer Map empty? " + integerMap.isEmpty());

        System.out.println("Size of String Map: " + stringMap.size());
        System.out.println("Is String Map empty? " + stringMap.isEmpty());

        System.out.println("String Map:");
        for (Map.Entry<Integer, String> entry : stringMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }

     
        integerMap.clear();
        stringMap.clear();

        System.out.println("Size of Integer Map after removal: " + integerMap.size());
        System.out.println("Is Integer Map empty after removal? " + integerMap.isEmpty());

        System.out.println("Size of String Map after removal: " + stringMap.size());
        System.out.println("Is String Map empty after removal? " + stringMap.isEmpty());
    }
}