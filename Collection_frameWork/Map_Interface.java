
import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
    public static void main(String[] args) {
        Map<Integer, String> c = new HashMap<>();
        c.put(1, " Rohit");
        c.put(2, " Nidhi");
        c.put(3, " Name");
        c.put(4, " Farmer");
        c.put(5, " Student");
        System.out.println(c);
        c.put(3, "Love");   //Now it will change the String using same Address
        System.out.println(c);

        c.putIfAbsent(1, "Yadav");
        System.out.println(c);
        System.out.println(c.isEmpty());
        c.remove(3);
        for (Integer d:c.keySet()) {
            System.out.println(d);
        }
        System.out.println(c);
        for (String d: c.values()) {
            System.out.println(d);
        }
        System.out.println(c);

          

    }
}
