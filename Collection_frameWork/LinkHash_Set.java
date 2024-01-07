
import java.util.LinkedHashSet;  //Order Collection
import java.util.Set;
public class LinkHash_Set {
    public static void main(String[] args) {
        Set<Integer> c = new LinkedHashSet<>();
        c.add(10);
        c.add(40);
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
