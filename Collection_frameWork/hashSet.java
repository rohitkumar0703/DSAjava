
import java.util.HashSet;
import java.util.Set;
public class hashSet {
    public static void main(String[] args){
        Set<Integer> c = new HashSet<>();
        c.add(5);
        c.add(10);
        c.add(20);
        c.add(30);
        c.add(40);
        c.add(50);
        c.add(60);
        System.out.println(c);
        //c.remove(10);
        System.out.println(c);
        //c.clear();
        System.out.println(c);
        int p = c.size();
        System.out.println(p);
        System.out.println(c.contains(70));
        System.out.println(c.contains(30));
    }
}
