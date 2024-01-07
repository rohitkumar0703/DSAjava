import java.util.LinkedList;
import java.util.Queue;
public class queue {
    public static void main(String[] argss){
        Queue<Integer> c = new LinkedList<>();
        c.offer(3);
        c.offer(4);
        c.offer(5);
        c.offer(6);
        c.offer(7);
        System.out.println(c.peek()); //peek using for seeing element 3
        System.out.println(c);
        c.poll();    //Elements will be deleted
        c.poll();
        System.out.println(c);
    }
}
