
  //Sorted Collection
import java.util.Set;
import java.util.TreeSet;

public class Tree_set {
    public static void main(String[] args) {
        Set<Integer> c = new TreeSet<>();
        c.add(10);
        c.add(400);
        c.add(60);
        c.add(90);
        c.add(100);
        System.out.println(c);
        int p = c.size();
        System.out.println(p);
        System.out.println(c.contains(70));
        System.out.println(c.contains(60));
    }
}
