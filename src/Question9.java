import java.util.HashMap;
import java.util.Map;

/**
 * 9. Create a HashMap object called people that will store String keys and Integer values:
 * And use for each loop to iterate the value from Map.
 */

public class Question9 {
    public static void main(String[] args) {
        Map<String, Integer> people = new HashMap<>();
        people.put("Jimil", 90);
        people.put("Chetan", 85);
        people.put("Kinjal", 95);
        people.put("Dhara", 80);
        people.put("Shama", 75);
        people.put("Mehul", 70);

        for (int i : people.values()){
            System.out.println(i);
        }
    }


}
