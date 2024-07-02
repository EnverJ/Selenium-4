package collections;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        Map<String, Integer> fruitCalories = new HashMap<>();
        fruitCalories.put("apple", 100);
        fruitCalories.put("banana", 200);
        fruitCalories.put("orange", 240);
        for (Map.Entry<String, Integer> entry : fruitCalories.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());

        }
    }
}
